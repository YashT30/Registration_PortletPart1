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

import Reg.service.model.Contacts1;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Contacts1 in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Contacts1CacheModel
	implements CacheModel<Contacts1>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Contacts1CacheModel)) {
			return false;
		}

		Contacts1CacheModel contacts1CacheModel = (Contacts1CacheModel)object;

		if (phoneId == contacts1CacheModel.phoneId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, phoneId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", phoneId=");
		sb.append(phoneId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", homePhone=");
		sb.append(homePhone);
		sb.append(", mobilePhone=");
		sb.append(mobilePhone);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Contacts1 toEntityModel() {
		Contacts1Impl contacts1Impl = new Contacts1Impl();

		if (uuid == null) {
			contacts1Impl.setUuid("");
		}
		else {
			contacts1Impl.setUuid(uuid);
		}

		contacts1Impl.setPhoneId(phoneId);
		contacts1Impl.setUserId(userId);

		if (homePhone == null) {
			contacts1Impl.setHomePhone("");
		}
		else {
			contacts1Impl.setHomePhone(homePhone);
		}

		if (mobilePhone == null) {
			contacts1Impl.setMobilePhone("");
		}
		else {
			contacts1Impl.setMobilePhone(mobilePhone);
		}

		contacts1Impl.resetOriginalValues();

		return contacts1Impl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		phoneId = objectInput.readLong();

		userId = objectInput.readLong();
		homePhone = objectInput.readUTF();
		mobilePhone = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(phoneId);

		objectOutput.writeLong(userId);

		if (homePhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homePhone);
		}

		if (mobilePhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobilePhone);
		}
	}

	public String uuid;
	public long phoneId;
	public long userId;
	public String homePhone;
	public String mobilePhone;

}