/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package Reg.service.service.impl;

import Reg.service.model.Student1;
import Reg.service.service.Student1LocalServiceUtil;
import Reg.service.service.base.Student1LocalServiceBaseImpl;
import Reg.service.service.persistence.Student1Persistence;
import Reg.service.service.persistence.impl.Student1PersistenceImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.Validator;

import java.util.Calendar;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=Reg.service.model.Student1",
	service = AopService.class
)
public class Student1LocalServiceImpl extends Student1LocalServiceBaseImpl {
	public Student1 addStudent1(
			String firstName, String lastName, String emailAddress, String username, boolean male,
			int birthdayMonth, int birthdayDay, int birthdayYear, String password1, String password2,
			String securityQuestion, String securityAnswer, boolean acceptedTerms)
			 {
				// Validate required fields
				if (Validator.isNull(firstName) || Validator.isNull(lastName) ||
						Validator.isNull(emailAddress) || Validator.isNull(username) ||
						Validator.isNull(password1) || Validator.isNull(password2) ||
						Validator.isNull(securityQuestion) || Validator.isNull(securityAnswer)) {
						throw new IllegalArgumentException("All required fields must be filled.");
				}
				// Validate alphanumeric fields
				if (!Validator.isAlphanumericName(firstName) || !Validator.isAlphanumericName(lastName) ||
					!Validator.isAlphanumericName(username) || !Validator.isAlphanumericName(securityAnswer)) {
					throw new IllegalArgumentException("Invalid characters in some fields.");
				}
				// Validate email address
				if (!Validator.isEmailAddress(emailAddress)) {
					throw new IllegalArgumentException("Invalid email address format.");
				}
				// Validate username length
				if (username.length() < 4 || username.length() > 16) {
					throw new IllegalArgumentException("Username must be between 4 and 16 characters long.");
				}
				
				// Check for existing username
				List<Student1> users = student1Persistence.findByUsername(username);
				if (!users.isEmpty()) {
					throw new IllegalArgumentException("Username already exists. Please choose a different one.");
				}
				// Validate password length and complexity
				if (password1.length() < 6 ||
					!(password1.matches(".*[A-Z].*")) ||
					!(password1.matches(".*[0-9].*")) ||
					!(password1.matches(".*[^a-zA-Z0-9].*"))) {
					throw new IllegalArgumentException(
						"Password must be at least 6 characters long and contain at least one uppercase letter, one number, and one special character."
					);
				}
				// Check if passwords match
				if (!password1.equals(password2)) {
					throw new IllegalArgumentException("Passwords do not match.");
				}
				// Validate birthday
				int currentYear = Calendar.getInstance().get(Calendar.YEAR);
				int minAllowedYear = currentYear - 13; // Must be at least 13 years old to register
				if (birthdayYear > currentYear || birthdayYear < (minAllowedYear - 120)) {
					throw new IllegalArgumentException("Invalid birth year.");
				}
				// Additional validations can be added here if needed.
				// All validations passed, create the user
				Student1 student1 = createStudent1(counterLocalService.increment(Student1.class.getName()));
				student1.setFirstName(firstName);
				student1.setLastName(lastName);
				student1.setEmailAddress(emailAddress);
				student1.setUsername(username);
				student1.setMale(male);
				student1.setBirthdayMonth(birthdayMonth);
				student1.setBirthdayDay(birthdayDay);
				student1.setBirthdayYear(birthdayYear);
				student1.setPassword1(password1);
				student1.setPassword2(password2);
				student1.setSecurityQuestion(securityQuestion);
				student1.setSecurityAnswer(securityAnswer);
				student1.setAcceptedTermsOfUse(acceptedTerms);
				student1 = student1LocalService.updateStudent1(student1);
				//studentlocalServiceUtil
				//student1Persistence.update(student1);
			
				// Persist the user in the database
				//return userLocalService.addUser(user);
				//super.addStudent1(student1);
				return student1;
				
	}

	  public Student1 deleteUser(long userId) throws PortalException {
	        Student1 student1 = student1LocalService.getStudent1(userId);
	        // Perform any additional logic or actions required before deleting the user
	        return student1LocalService.deleteStudent1(student1);
	    }

	 }