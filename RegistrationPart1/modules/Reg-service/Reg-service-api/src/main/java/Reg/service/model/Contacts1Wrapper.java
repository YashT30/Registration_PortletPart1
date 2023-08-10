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
 * This class is a wrapper for {@link Contacts1}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Contacts1
 * @generated
 */
public class Contacts1Wrapper
	extends BaseModelWrapper<Contacts1>
	implements Contacts1, ModelWrapper<Contacts1> {

	public Contacts1Wrapper(Contacts1 contacts1) {
		super(contacts1);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("phoneId", getPhoneId());
		attributes.put("userId", getUserId());
		attributes.put("homePhone", getHomePhone());
		attributes.put("mobilePhone", getMobilePhone());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long phoneId = (Long)attributes.get("phoneId");

		if (phoneId != null) {
			setPhoneId(phoneId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String homePhone = (String)attributes.get("homePhone");

		if (homePhone != null) {
			setHomePhone(homePhone);
		}

		String mobilePhone = (String)attributes.get("mobilePhone");

		if (mobilePhone != null) {
			setMobilePhone(mobilePhone);
		}
	}

	@Override
	public Contacts1 cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the home phone of this contacts1.
	 *
	 * @return the home phone of this contacts1
	 */
	@Override
	public String getHomePhone() {
		return model.getHomePhone();
	}

	/**
	 * Returns the mobile phone of this contacts1.
	 *
	 * @return the mobile phone of this contacts1
	 */
	@Override
	public String getMobilePhone() {
		return model.getMobilePhone();
	}

	/**
	 * Returns the phone ID of this contacts1.
	 *
	 * @return the phone ID of this contacts1
	 */
	@Override
	public long getPhoneId() {
		return model.getPhoneId();
	}

	/**
	 * Returns the primary key of this contacts1.
	 *
	 * @return the primary key of this contacts1
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this contacts1.
	 *
	 * @return the user ID of this contacts1
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this contacts1.
	 *
	 * @return the user uuid of this contacts1
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this contacts1.
	 *
	 * @return the uuid of this contacts1
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the home phone of this contacts1.
	 *
	 * @param homePhone the home phone of this contacts1
	 */
	@Override
	public void setHomePhone(String homePhone) {
		model.setHomePhone(homePhone);
	}

	/**
	 * Sets the mobile phone of this contacts1.
	 *
	 * @param mobilePhone the mobile phone of this contacts1
	 */
	@Override
	public void setMobilePhone(String mobilePhone) {
		model.setMobilePhone(mobilePhone);
	}

	/**
	 * Sets the phone ID of this contacts1.
	 *
	 * @param phoneId the phone ID of this contacts1
	 */
	@Override
	public void setPhoneId(long phoneId) {
		model.setPhoneId(phoneId);
	}

	/**
	 * Sets the primary key of this contacts1.
	 *
	 * @param primaryKey the primary key of this contacts1
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this contacts1.
	 *
	 * @param userId the user ID of this contacts1
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this contacts1.
	 *
	 * @param userUuid the user uuid of this contacts1
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this contacts1.
	 *
	 * @param uuid the uuid of this contacts1
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
	protected Contacts1Wrapper wrap(Contacts1 contacts1) {
		return new Contacts1Wrapper(contacts1);
	}

}