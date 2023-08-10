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

package Reg.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Student1}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student1
 * @generated
 */
public class Student1Wrapper
	extends BaseModelWrapper<Student1>
	implements ModelWrapper<Student1>, Student1 {

	public Student1Wrapper(Student1 student1) {
		super(student1);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("userId", getUserId());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("username", getUsername());
		attributes.put("male", isMale());
		attributes.put("birthdayMonth", getBirthdayMonth());
		attributes.put("birthdayDay", getBirthdayDay());
		attributes.put("birthdayYear", getBirthdayYear());
		attributes.put("password1", getPassword1());
		attributes.put("password2", getPassword2());
		attributes.put("securityQuestion", getSecurityQuestion());
		attributes.put("securityAnswer", getSecurityAnswer());
		attributes.put("acceptedTermsOfUse", isAcceptedTermsOfUse());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String username = (String)attributes.get("username");

		if (username != null) {
			setUsername(username);
		}

		Boolean male = (Boolean)attributes.get("male");

		if (male != null) {
			setMale(male);
		}

		Integer birthdayMonth = (Integer)attributes.get("birthdayMonth");

		if (birthdayMonth != null) {
			setBirthdayMonth(birthdayMonth);
		}

		Integer birthdayDay = (Integer)attributes.get("birthdayDay");

		if (birthdayDay != null) {
			setBirthdayDay(birthdayDay);
		}

		Integer birthdayYear = (Integer)attributes.get("birthdayYear");

		if (birthdayYear != null) {
			setBirthdayYear(birthdayYear);
		}

		String password1 = (String)attributes.get("password1");

		if (password1 != null) {
			setPassword1(password1);
		}

		String password2 = (String)attributes.get("password2");

		if (password2 != null) {
			setPassword2(password2);
		}

		String securityQuestion = (String)attributes.get("securityQuestion");

		if (securityQuestion != null) {
			setSecurityQuestion(securityQuestion);
		}

		String securityAnswer = (String)attributes.get("securityAnswer");

		if (securityAnswer != null) {
			setSecurityAnswer(securityAnswer);
		}

		Boolean acceptedTermsOfUse = (Boolean)attributes.get(
			"acceptedTermsOfUse");

		if (acceptedTermsOfUse != null) {
			setAcceptedTermsOfUse(acceptedTermsOfUse);
		}
	}

	@Override
	public Student1 cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the accepted terms of use of this student1.
	 *
	 * @return the accepted terms of use of this student1
	 */
	@Override
	public boolean getAcceptedTermsOfUse() {
		return model.getAcceptedTermsOfUse();
	}

	/**
	 * Returns the birthday day of this student1.
	 *
	 * @return the birthday day of this student1
	 */
	@Override
	public int getBirthdayDay() {
		return model.getBirthdayDay();
	}

	/**
	 * Returns the birthday month of this student1.
	 *
	 * @return the birthday month of this student1
	 */
	@Override
	public int getBirthdayMonth() {
		return model.getBirthdayMonth();
	}

	/**
	 * Returns the birthday year of this student1.
	 *
	 * @return the birthday year of this student1
	 */
	@Override
	public int getBirthdayYear() {
		return model.getBirthdayYear();
	}

	/**
	 * Returns the email address of this student1.
	 *
	 * @return the email address of this student1
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the first name of this student1.
	 *
	 * @return the first name of this student1
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the last name of this student1.
	 *
	 * @return the last name of this student1
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the male of this student1.
	 *
	 * @return the male of this student1
	 */
	@Override
	public boolean getMale() {
		return model.getMale();
	}

	/**
	 * Returns the password1 of this student1.
	 *
	 * @return the password1 of this student1
	 */
	@Override
	public String getPassword1() {
		return model.getPassword1();
	}

	/**
	 * Returns the password2 of this student1.
	 *
	 * @return the password2 of this student1
	 */
	@Override
	public String getPassword2() {
		return model.getPassword2();
	}

	/**
	 * Returns the primary key of this student1.
	 *
	 * @return the primary key of this student1
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the security answer of this student1.
	 *
	 * @return the security answer of this student1
	 */
	@Override
	public String getSecurityAnswer() {
		return model.getSecurityAnswer();
	}

	/**
	 * Returns the security question of this student1.
	 *
	 * @return the security question of this student1
	 */
	@Override
	public String getSecurityQuestion() {
		return model.getSecurityQuestion();
	}

	/**
	 * Returns the user ID of this student1.
	 *
	 * @return the user ID of this student1
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the username of this student1.
	 *
	 * @return the username of this student1
	 */
	@Override
	public String getUsername() {
		return model.getUsername();
	}

	/**
	 * Returns the user uuid of this student1.
	 *
	 * @return the user uuid of this student1
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this student1.
	 *
	 * @return the uuid of this student1
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this student1 is accepted terms of use.
	 *
	 * @return <code>true</code> if this student1 is accepted terms of use; <code>false</code> otherwise
	 */
	@Override
	public boolean isAcceptedTermsOfUse() {
		return model.isAcceptedTermsOfUse();
	}

	/**
	 * Returns <code>true</code> if this student1 is male.
	 *
	 * @return <code>true</code> if this student1 is male; <code>false</code> otherwise
	 */
	@Override
	public boolean isMale() {
		return model.isMale();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets whether this student1 is accepted terms of use.
	 *
	 * @param acceptedTermsOfUse the accepted terms of use of this student1
	 */
	@Override
	public void setAcceptedTermsOfUse(boolean acceptedTermsOfUse) {
		model.setAcceptedTermsOfUse(acceptedTermsOfUse);
	}

	/**
	 * Sets the birthday day of this student1.
	 *
	 * @param birthdayDay the birthday day of this student1
	 */
	@Override
	public void setBirthdayDay(int birthdayDay) {
		model.setBirthdayDay(birthdayDay);
	}

	/**
	 * Sets the birthday month of this student1.
	 *
	 * @param birthdayMonth the birthday month of this student1
	 */
	@Override
	public void setBirthdayMonth(int birthdayMonth) {
		model.setBirthdayMonth(birthdayMonth);
	}

	/**
	 * Sets the birthday year of this student1.
	 *
	 * @param birthdayYear the birthday year of this student1
	 */
	@Override
	public void setBirthdayYear(int birthdayYear) {
		model.setBirthdayYear(birthdayYear);
	}

	/**
	 * Sets the email address of this student1.
	 *
	 * @param emailAddress the email address of this student1
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the first name of this student1.
	 *
	 * @param firstName the first name of this student1
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the last name of this student1.
	 *
	 * @param lastName the last name of this student1
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets whether this student1 is male.
	 *
	 * @param male the male of this student1
	 */
	@Override
	public void setMale(boolean male) {
		model.setMale(male);
	}

	/**
	 * Sets the password1 of this student1.
	 *
	 * @param password1 the password1 of this student1
	 */
	@Override
	public void setPassword1(String password1) {
		model.setPassword1(password1);
	}

	/**
	 * Sets the password2 of this student1.
	 *
	 * @param password2 the password2 of this student1
	 */
	@Override
	public void setPassword2(String password2) {
		model.setPassword2(password2);
	}

	/**
	 * Sets the primary key of this student1.
	 *
	 * @param primaryKey the primary key of this student1
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the security answer of this student1.
	 *
	 * @param securityAnswer the security answer of this student1
	 */
	@Override
	public void setSecurityAnswer(String securityAnswer) {
		model.setSecurityAnswer(securityAnswer);
	}

	/**
	 * Sets the security question of this student1.
	 *
	 * @param securityQuestion the security question of this student1
	 */
	@Override
	public void setSecurityQuestion(String securityQuestion) {
		model.setSecurityQuestion(securityQuestion);
	}

	/**
	 * Sets the user ID of this student1.
	 *
	 * @param userId the user ID of this student1
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the username of this student1.
	 *
	 * @param username the username of this student1
	 */
	@Override
	public void setUsername(String username) {
		model.setUsername(username);
	}

	/**
	 * Sets the user uuid of this student1.
	 *
	 * @param userUuid the user uuid of this student1
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this student1.
	 *
	 * @param uuid the uuid of this student1
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected Student1Wrapper wrap(Student1 student1) {
		return new Student1Wrapper(student1);
	}

}