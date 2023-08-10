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
import Reg.service.model.Billing1Model;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Billing1 service. Represents a row in the &quot;Yash_Billing1&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>Billing1Model</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Billing1Impl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Billing1Impl
 * @generated
 */
@JSON(strict = true)
public class Billing1ModelImpl
	extends BaseModelImpl<Billing1> implements Billing1Model {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a billing1 model instance should use the <code>Billing1</code> interface instead.
	 */
	public static final String TABLE_NAME = "Yash_Billing1";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"billingAddressId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"address", Types.VARCHAR},
		{"address2", Types.VARCHAR}, {"city", Types.VARCHAR},
		{"state_", Types.VARCHAR}, {"zip", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("billingAddressId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("address", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("address2", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("city", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("state_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("zip", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Yash_Billing1 (uuid_ VARCHAR(75) null,billingAddressId LONG not null primary key,userId LONG,address VARCHAR(75) null,address2 VARCHAR(75) null,city VARCHAR(75) null,state_ VARCHAR(75) null,zip VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table Yash_Billing1";

	public static final String ORDER_BY_JPQL =
		" ORDER BY billing1.billingAddressId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Yash_Billing1.billingAddressId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long BILLINGADDRESSID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public Billing1ModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _billingAddressId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBillingAddressId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _billingAddressId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Billing1.class;
	}

	@Override
	public String getModelClassName() {
		return Billing1.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Billing1, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Billing1, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Billing1, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Billing1)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Billing1, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Billing1, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Billing1)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Billing1, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Billing1, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<Billing1, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Billing1, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Billing1, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Billing1, Object>>();
		Map<String, BiConsumer<Billing1, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Billing1, ?>>();

		attributeGetterFunctions.put("uuid", Billing1::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Billing1, String>)Billing1::setUuid);
		attributeGetterFunctions.put(
			"billingAddressId", Billing1::getBillingAddressId);
		attributeSetterBiConsumers.put(
			"billingAddressId",
			(BiConsumer<Billing1, Long>)Billing1::setBillingAddressId);
		attributeGetterFunctions.put("userId", Billing1::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Billing1, Long>)Billing1::setUserId);
		attributeGetterFunctions.put("address", Billing1::getAddress);
		attributeSetterBiConsumers.put(
			"address", (BiConsumer<Billing1, String>)Billing1::setAddress);
		attributeGetterFunctions.put("address2", Billing1::getAddress2);
		attributeSetterBiConsumers.put(
			"address2", (BiConsumer<Billing1, String>)Billing1::setAddress2);
		attributeGetterFunctions.put("city", Billing1::getCity);
		attributeSetterBiConsumers.put(
			"city", (BiConsumer<Billing1, String>)Billing1::setCity);
		attributeGetterFunctions.put("state", Billing1::getState);
		attributeSetterBiConsumers.put(
			"state", (BiConsumer<Billing1, String>)Billing1::setState);
		attributeGetterFunctions.put("zip", Billing1::getZip);
		attributeSetterBiConsumers.put(
			"zip", (BiConsumer<Billing1, String>)Billing1::setZip);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getBillingAddressId() {
		return _billingAddressId;
	}

	@Override
	public void setBillingAddressId(long billingAddressId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_billingAddressId = billingAddressId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getAddress() {
		if (_address == null) {
			return "";
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_address = address;
	}

	@JSON
	@Override
	public String getAddress2() {
		if (_address2 == null) {
			return "";
		}
		else {
			return _address2;
		}
	}

	@Override
	public void setAddress2(String address2) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_address2 = address2;
	}

	@JSON
	@Override
	public String getCity() {
		if (_city == null) {
			return "";
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_city = city;
	}

	@JSON
	@Override
	public String getState() {
		if (_state == null) {
			return "";
		}
		else {
			return _state;
		}
	}

	@Override
	public void setState(String state) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_state = state;
	}

	@JSON
	@Override
	public String getZip() {
		if (_zip == null) {
			return "";
		}
		else {
			return _zip;
		}
	}

	@Override
	public void setZip(String zip) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_zip = zip;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, Billing1.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Billing1 toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Billing1>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		Billing1Impl billing1Impl = new Billing1Impl();

		billing1Impl.setUuid(getUuid());
		billing1Impl.setBillingAddressId(getBillingAddressId());
		billing1Impl.setUserId(getUserId());
		billing1Impl.setAddress(getAddress());
		billing1Impl.setAddress2(getAddress2());
		billing1Impl.setCity(getCity());
		billing1Impl.setState(getState());
		billing1Impl.setZip(getZip());

		billing1Impl.resetOriginalValues();

		return billing1Impl;
	}

	@Override
	public Billing1 cloneWithOriginalValues() {
		Billing1Impl billing1Impl = new Billing1Impl();

		billing1Impl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		billing1Impl.setBillingAddressId(
			this.<Long>getColumnOriginalValue("billingAddressId"));
		billing1Impl.setUserId(this.<Long>getColumnOriginalValue("userId"));
		billing1Impl.setAddress(this.<String>getColumnOriginalValue("address"));
		billing1Impl.setAddress2(
			this.<String>getColumnOriginalValue("address2"));
		billing1Impl.setCity(this.<String>getColumnOriginalValue("city"));
		billing1Impl.setState(this.<String>getColumnOriginalValue("state_"));
		billing1Impl.setZip(this.<String>getColumnOriginalValue("zip"));

		return billing1Impl;
	}

	@Override
	public int compareTo(Billing1 billing1) {
		long primaryKey = billing1.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Billing1)) {
			return false;
		}

		Billing1 billing1 = (Billing1)object;

		long primaryKey = billing1.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Billing1> toCacheModel() {
		Billing1CacheModel billing1CacheModel = new Billing1CacheModel();

		billing1CacheModel.uuid = getUuid();

		String uuid = billing1CacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			billing1CacheModel.uuid = null;
		}

		billing1CacheModel.billingAddressId = getBillingAddressId();

		billing1CacheModel.userId = getUserId();

		billing1CacheModel.address = getAddress();

		String address = billing1CacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			billing1CacheModel.address = null;
		}

		billing1CacheModel.address2 = getAddress2();

		String address2 = billing1CacheModel.address2;

		if ((address2 != null) && (address2.length() == 0)) {
			billing1CacheModel.address2 = null;
		}

		billing1CacheModel.city = getCity();

		String city = billing1CacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			billing1CacheModel.city = null;
		}

		billing1CacheModel.state = getState();

		String state = billing1CacheModel.state;

		if ((state != null) && (state.length() == 0)) {
			billing1CacheModel.state = null;
		}

		billing1CacheModel.zip = getZip();

		String zip = billing1CacheModel.zip;

		if ((zip != null) && (zip.length() == 0)) {
			billing1CacheModel.zip = null;
		}

		return billing1CacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Billing1, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Billing1, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Billing1, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Billing1)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Billing1>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Billing1.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _billingAddressId;
	private long _userId;
	private String _address;
	private String _address2;
	private String _city;
	private String _state;
	private String _zip;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Billing1, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Billing1)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("billingAddressId", _billingAddressId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("address", _address);
		_columnOriginalValues.put("address2", _address2);
		_columnOriginalValues.put("city", _city);
		_columnOriginalValues.put("state_", _state);
		_columnOriginalValues.put("zip", _zip);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");
		attributeNames.put("state_", "state");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("billingAddressId", 2L);

		columnBitmasks.put("userId", 4L);

		columnBitmasks.put("address", 8L);

		columnBitmasks.put("address2", 16L);

		columnBitmasks.put("city", 32L);

		columnBitmasks.put("state_", 64L);

		columnBitmasks.put("zip", 128L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Billing1 _escapedModel;

}