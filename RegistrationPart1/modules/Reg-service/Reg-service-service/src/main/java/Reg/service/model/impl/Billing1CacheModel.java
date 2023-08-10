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

import Reg.service.model.Billing1;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Billing1 in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class Billing1CacheModel
	implements CacheModel<Billing1>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Billing1CacheModel)) {
			return false;
		}

		Billing1CacheModel billing1CacheModel = (Billing1CacheModel)object;

		if (billingAddressId == billing1CacheModel.billingAddressId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, billingAddressId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", billingAddressId=");
		sb.append(billingAddressId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", address=");
		sb.append(address);
		sb.append(", address2=");
		sb.append(address2);
		sb.append(", city=");
		sb.append(city);
		sb.append(", state=");
		sb.append(state);
		sb.append(", zip=");
		sb.append(zip);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Billing1 toEntityModel() {
		Billing1Impl billing1Impl = new Billing1Impl();

		if (uuid == null) {
			billing1Impl.setUuid("");
		}
		else {
			billing1Impl.setUuid(uuid);
		}

		billing1Impl.setBillingAddressId(billingAddressId);
		billing1Impl.setUserId(userId);

		if (address == null) {
			billing1Impl.setAddress("");
		}
		else {
			billing1Impl.setAddress(address);
		}

		if (address2 == null) {
			billing1Impl.setAddress2("");
		}
		else {
			billing1Impl.setAddress2(address2);
		}

		if (city == null) {
			billing1Impl.setCity("");
		}
		else {
			billing1Impl.setCity(city);
		}

		if (state == null) {
			billing1Impl.setState("");
		}
		else {
			billing1Impl.setState(state);
		}

		if (zip == null) {
			billing1Impl.setZip("");
		}
		else {
			billing1Impl.setZip(zip);
		}

		billing1Impl.resetOriginalValues();

		return billing1Impl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		billingAddressId = objectInput.readLong();

		userId = objectInput.readLong();
		address = objectInput.readUTF();
		address2 = objectInput.readUTF();
		city = objectInput.readUTF();
		state = objectInput.readUTF();
		zip = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(billingAddressId);

		objectOutput.writeLong(userId);

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (address2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address2);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (state == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (zip == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zip);
		}
	}

	public String uuid;
	public long billingAddressId;
	public long userId;
	public String address;
	public String address2;
	public String city;
	public String state;
	public String zip;

}