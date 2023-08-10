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
 * This class is a wrapper for {@link Billing1}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Billing1
 * @generated
 */
public class Billing1Wrapper
	extends BaseModelWrapper<Billing1>
	implements Billing1, ModelWrapper<Billing1> {

	public Billing1Wrapper(Billing1 billing1) {
		super(billing1);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("billingAddressId", getBillingAddressId());
		attributes.put("userId", getUserId());
		attributes.put("address", getAddress());
		attributes.put("address2", getAddress2());
		attributes.put("city", getCity());
		attributes.put("state", getState());
		attributes.put("zip", getZip());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long billingAddressId = (Long)attributes.get("billingAddressId");

		if (billingAddressId != null) {
			setBillingAddressId(billingAddressId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String address2 = (String)attributes.get("address2");

		if (address2 != null) {
			setAddress2(address2);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String zip = (String)attributes.get("zip");

		if (zip != null) {
			setZip(zip);
		}
	}

	@Override
	public Billing1 cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this billing1.
	 *
	 * @return the address of this billing1
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the address2 of this billing1.
	 *
	 * @return the address2 of this billing1
	 */
	@Override
	public String getAddress2() {
		return model.getAddress2();
	}

	/**
	 * Returns the billing address ID of this billing1.
	 *
	 * @return the billing address ID of this billing1
	 */
	@Override
	public long getBillingAddressId() {
		return model.getBillingAddressId();
	}

	/**
	 * Returns the city of this billing1.
	 *
	 * @return the city of this billing1
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the primary key of this billing1.
	 *
	 * @return the primary key of this billing1
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the state of this billing1.
	 *
	 * @return the state of this billing1
	 */
	@Override
	public String getState() {
		return model.getState();
	}

	/**
	 * Returns the user ID of this billing1.
	 *
	 * @return the user ID of this billing1
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this billing1.
	 *
	 * @return the user uuid of this billing1
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this billing1.
	 *
	 * @return the uuid of this billing1
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the zip of this billing1.
	 *
	 * @return the zip of this billing1
	 */
	@Override
	public String getZip() {
		return model.getZip();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the address of this billing1.
	 *
	 * @param address the address of this billing1
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the address2 of this billing1.
	 *
	 * @param address2 the address2 of this billing1
	 */
	@Override
	public void setAddress2(String address2) {
		model.setAddress2(address2);
	}

	/**
	 * Sets the billing address ID of this billing1.
	 *
	 * @param billingAddressId the billing address ID of this billing1
	 */
	@Override
	public void setBillingAddressId(long billingAddressId) {
		model.setBillingAddressId(billingAddressId);
	}

	/**
	 * Sets the city of this billing1.
	 *
	 * @param city the city of this billing1
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the primary key of this billing1.
	 *
	 * @param primaryKey the primary key of this billing1
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the state of this billing1.
	 *
	 * @param state the state of this billing1
	 */
	@Override
	public void setState(String state) {
		model.setState(state);
	}

	/**
	 * Sets the user ID of this billing1.
	 *
	 * @param userId the user ID of this billing1
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this billing1.
	 *
	 * @param userUuid the user uuid of this billing1
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this billing1.
	 *
	 * @param uuid the uuid of this billing1
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the zip of this billing1.
	 *
	 * @param zip the zip of this billing1
	 */
	@Override
	public void setZip(String zip) {
		model.setZip(zip);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected Billing1Wrapper wrap(Billing1 billing1) {
		return new Billing1Wrapper(billing1);
	}

}