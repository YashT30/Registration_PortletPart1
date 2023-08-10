package Reg.web.portlet;

import Reg.service.model.Student1;
import Reg.service.model.impl.Student1Impl;
import Reg.service.service.Billing1LocalService;
import Reg.service.service.Billing1LocalServiceUtil;
import Reg.service.service.Contacts1LocalService;
import Reg.service.service.Contacts1LocalServiceUtil;
import Reg.service.service.Student1LocalService;
import Reg.service.service.Student1LocalServiceUtil;
import Reg.service.service.persistence.Student1Persistence;
//import Reg.service.service.Billing1LocalService;
//import Reg.service.service.Contacts1LocalService;
//import Reg.service.service.Student1LocalService;
//import Reg.service.service.Student1LocalServiceUtil;
import Reg.web.constants.RegAMFPortletKeys;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;
import javax.xml.crypto.Data;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
//import org.osgi.service.component.annotations.Reference;

/**
 * @author me
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=RegAMF", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp", "javax.portlet.name=" + RegAMFPortletKeys.REGAMF,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class RegAMFPortlet extends MVCPortlet {
	
	Log log = LogFactoryUtil.getLog(RegAMFPortlet.class);

	@ProcessAction(name = "registerUser")
	public void registerUser(ActionRequest request, ActionResponse response) throws IOException, PortalException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		System.out.println("WELCOME TO LIFERAY");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Student1.class.getName(), request);
		long userId = ParamUtil.getLong(request, "userId");
		
		String firstName = ParamUtil.getString(request, "firstName");
		log.info(firstName);
		String lastName = ParamUtil.getString(request, "lastName");
		String emailAddress = ParamUtil.getString(request, "emailAddress");
		String username = ParamUtil.getString(request, "username");
		boolean male = ParamUtil.getBoolean(request, "male");
		int birthdayMonth = ParamUtil.getInteger(request, "birthdayMonth");
		int birthdayDay = ParamUtil.getInteger(request, "birthdayDay");
		int birthdayYear = ParamUtil.getInteger(request, "birthdayYear");
		String password1 = ParamUtil.getString(request, "password1");
		String password2 = ParamUtil.getString(request, "password2");
		String securityQuestion = ParamUtil.getString(request, "securityQuestion");
		String securityAnswer = ParamUtil.getString(request, "securityAnswer");
		boolean acceptedTerms = ParamUtil.getBoolean(request, "acceptedTerms");
		
		//Contacts1 entity
		String homePhone = ParamUtil.getString(request,"homePhone");
		String mobilePhone = ParamUtil.getString(request,"mobilePhone");
		
		//billings1 entity
		String address = ParamUtil.getString(request, "address");
		String address2 = ParamUtil.getString(request,"address2");
		String city = ParamUtil.getString(request ,"city");
		String state = ParamUtil.getString(request ,"state");
		String zip = ParamUtil.getString(request ,"zip");
		
		
		log.info("firstName " + firstName + " lastName " + lastName + " emailAddress " + emailAddress + " userName "
				+ username + " male " + male + " bdaymonth" + birthdayMonth+ birthdayDay+birthdayYear+password1+password2+securityQuestion+securityAnswer+acceptedTerms);
		
		Student1 student1=Student1LocalServiceUtil.addStudent1(firstName, lastName, emailAddress, username, male, birthdayMonth,
				birthdayDay, birthdayYear, password1, password2, securityQuestion, securityAnswer, acceptedTerms);
		
		Contacts1LocalServiceUtil.addContacts1(student1.getUserId(),homePhone, mobilePhone);
		Billing1LocalServiceUtil.addBilling1(student1.getUserId(), address, address2, city, state, zip);
		log.info("Data updated");
		// Validate form data (You can add more validation as per your requirements)
		if (!acceptedTerms) {
		         return;
		}
		if (!password1.equals(password2)) {
			return;
		}


	

		try {

	
			// Optionally, you can set a success message to be displayed on the UI
			// _student1localService.addStudent1(firstName, lastName, emailAddress,
			// username, male, birthdayMonth, birthdayDay, birthdayYear, password1,
			// password2, securityQuestion, securityAnswer, acceptedTerms);
		} catch (Exception e) {
			// Handle any exceptions that may occur during data insertion
			e.printStackTrace();
			// You can display an error message or do further processing
			return;
		}
		// Redirect the user to a success page or refresh the current page
		String registrationURL = themeDisplay.getURLCurrent(); // You can set a custom URL if needed
		response.sendRedirect(registrationURL);

	}
	@Reference
	private Student1LocalService _student1localService;
	@Reference
	private Contacts1LocalService _phoneLocalService;

	@Reference
	private Billing1LocalService _billingAddressLocalService;



}