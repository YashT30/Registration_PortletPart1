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

package Reg.service.model.impl;

import Reg.service.model.Student1;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Student1 in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Student1CacheModel
	implements CacheModel<Student1>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Student1CacheModel)) {
			return false;
		}

		Student1CacheModel student1CacheModel = (Student1CacheModel)object;

		if (userId == student1CacheModel.userId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", username=");
		sb.append(username);
		sb.append(", male=");
		sb.append(male);
		sb.append(", birthdayMonth=");
		sb.append(birthdayMonth);
		sb.append(", birthdayDay=");
		sb.append(birthdayDay);
		sb.append(", birthdayYear=");
		sb.append(birthdayYear);
		sb.append(", password1=");
		sb.append(password1);
		sb.append(", password2=");
		sb.append(password2);
		sb.append(", securityQuestion=");
		sb.append(securityQuestion);
		sb.append(", securityAnswer=");
		sb.append(securityAnswer);
		sb.append(", acceptedTermsOfUse=");
		sb.append(acceptedTermsOfUse);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Student1 toEntityModel() {
		Student1Impl student1Impl = new Student1Impl();

		if (uuid == null) {
			student1Impl.setUuid("");
		}
		else {
			student1Impl.setUuid(uuid);
		}

		student1Impl.setUserId(userId);

		if (firstName == null) {
			student1Impl.setFirstName("");
		}
		else {
			student1Impl.setFirstName(firstName);
		}

		if (lastName == null) {
			student1Impl.setLastName("");
		}
		else {
			student1Impl.setLastName(lastName);
		}

		if (emailAddress == null) {
			student1Impl.setEmailAddress("");
		}
		else {
			student1Impl.setEmailAddress(emailAddress);
		}

		if (username == null) {
			student1Impl.setUsername("");
		}
		else {
			student1Impl.setUsername(username);
		}

		student1Impl.setMale(male);
		student1Impl.setBirthdayMonth(birthdayMonth);
		student1Impl.setBirthdayDay(birthdayDay);
		student1Impl.setBirthdayYear(birthdayYear);

		if (password1 == null) {
			student1Impl.setPassword1("");
		}
		else {
			student1Impl.setPassword1(password1);
		}

		if (password2 == null) {
			student1Impl.setPassword2("");
		}
		else {
			student1Impl.setPassword2(password2);
		}

		if (securityQuestion == null) {
			student1Impl.setSecurityQuestion("");
		}
		else {
			student1Impl.setSecurityQuestion(securityQuestion);
		}

		if (securityAnswer == null) {
			student1Impl.setSecurityAnswer("");
		}
		else {
			student1Impl.setSecurityAnswer(securityAnswer);
		}

		student1Impl.setAcceptedTermsOfUse(acceptedTermsOfUse);

		student1Impl.resetOriginalValues();

		return student1Impl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		userId = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		username = objectInput.readUTF();

		male = objectInput.readBoolean();

		birthdayMonth = objectInput.readInt();

		birthdayDay = objectInput.readInt();

		birthdayYear = objectInput.readInt();
		password1 = objectInput.readUTF();
		password2 = objectInput.readUTF();
		securityQuestion = objectInput.readUTF();
		securityAnswer = objectInput.readUTF();

		acceptedTermsOfUse = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(userId);

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (username == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(username);
		}

		objectOutput.writeBoolean(male);

		objectOutput.writeInt(birthdayMonth);

		objectOutput.writeInt(birthdayDay);

		objectOutput.writeInt(birthdayYear);

		if (password1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(password1);
		}

		if (password2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(password2);
		}

		if (securityQuestion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityQuestion);
		}

		if (securityAnswer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityAnswer);
		}

		objectOutput.writeBoolean(acceptedTermsOfUse);
	}

	public String uuid;
	public long userId;
	public String firstName;
	public String lastName;
	public String emailAddress;
	public String username;
	public boolean male;
	public int birthdayMonth;
	public int birthdayDay;
	public int birthdayYear;
	public String password1;
	public String password2;
	public String securityQuestion;
	public String securityAnswer;
	public boolean acceptedTermsOfUse;

}