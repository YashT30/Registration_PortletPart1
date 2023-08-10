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

package Reg.service.service.persistence;

import Reg.service.model.Billing1;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the billing1 service. This utility wraps <code>Reg.service.service.persistence.impl.Billing1PersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Billing1Persistence
 * @generated
 */
public class Billing1Util {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Billing1 billing1) {
		getPersistence().clearCache(billing1);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Billing1> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Billing1> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Billing1> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Billing1> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Billing1> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Billing1 update(Billing1 billing1) {
		return getPersistence().update(billing1);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Billing1 update(
		Billing1 billing1, ServiceContext serviceContext) {

		return getPersistence().update(billing1, serviceContext);
	}

	/**
	 * Returns all the billing1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching billing1s
	 */
	public static List<Billing1> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the billing1s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Billing1ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of billing1s
	 * @param end the upper bound of the range of billing1s (not inclusive)
	 * @return the range of matching billing1s
	 */
	public static List<Billing1> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the billing1s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Billing1ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of billing1s
	 * @param end the upper bound of the range of billing1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching billing1s
	 */
	public static List<Billing1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Billing1> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the billing1s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Billing1ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of billing1s
	 * @param end the upper bound of the range of billing1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching billing1s
	 */
	public static List<Billing1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Billing1> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first billing1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching billing1
	 * @throws NoSuchBilling1Exception if a matching billing1 could not be found
	 */
	public static Billing1 findByUuid_First(
			String uuid, OrderByComparator<Billing1> orderByComparator)
		throws Reg.service.exception.NoSuchBilling1Exception {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first billing1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching billing1, or <code>null</code> if a matching billing1 could not be found
	 */
	public static Billing1 fetchByUuid_First(
		String uuid, OrderByComparator<Billing1> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last billing1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching billing1
	 * @throws NoSuchBilling1Exception if a matching billing1 could not be found
	 */
	public static Billing1 findByUuid_Last(
			String uuid, OrderByComparator<Billing1> orderByComparator)
		throws Reg.service.exception.NoSuchBilling1Exception {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last billing1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching billing1, or <code>null</code> if a matching billing1 could not be found
	 */
	public static Billing1 fetchByUuid_Last(
		String uuid, OrderByComparator<Billing1> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the billing1s before and after the current billing1 in the ordered set where uuid = &#63;.
	 *
	 * @param billingAddressId the primary key of the current billing1
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next billing1
	 * @throws NoSuchBilling1Exception if a billing1 with the primary key could not be found
	 */
	public static Billing1[] findByUuid_PrevAndNext(
			long billingAddressId, String uuid,
			OrderByComparator<Billing1> orderByComparator)
		throws Reg.service.exception.NoSuchBilling1Exception {

		return getPersistence().findByUuid_PrevAndNext(
			billingAddressId, uuid, orderByComparator);
	}

	/**
	 * Removes all the billing1s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of billing1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching billing1s
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the billing1 in the entity cache if it is enabled.
	 *
	 * @param billing1 the billing1
	 */
	public static void cacheResult(Billing1 billing1) {
		getPersistence().cacheResult(billing1);
	}

	/**
	 * Caches the billing1s in the entity cache if it is enabled.
	 *
	 * @param billing1s the billing1s
	 */
	public static void cacheResult(List<Billing1> billing1s) {
		getPersistence().cacheResult(billing1s);
	}

	/**
	 * Creates a new billing1 with the primary key. Does not add the billing1 to the database.
	 *
	 * @param billingAddressId the primary key for the new billing1
	 * @return the new billing1
	 */
	public static Billing1 create(long billingAddressId) {
		return getPersistence().create(billingAddressId);
	}

	/**
	 * Removes the billing1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param billingAddressId the primary key of the billing1
	 * @return the billing1 that was removed
	 * @throws NoSuchBilling1Exception if a billing1 with the primary key could not be found
	 */
	public static Billing1 remove(long billingAddressId)
		throws Reg.service.exception.NoSuchBilling1Exception {

		return getPersistence().remove(billingAddressId);
	}

	public static Billing1 updateImpl(Billing1 billing1) {
		return getPersistence().updateImpl(billing1);
	}

	/**
	 * Returns the billing1 with the primary key or throws a <code>NoSuchBilling1Exception</code> if it could not be found.
	 *
	 * @param billingAddressId the primary key of the billing1
	 * @return the billing1
	 * @throws NoSuchBilling1Exception if a billing1 with the primary key could not be found
	 */
	public static Billing1 findByPrimaryKey(long billingAddressId)
		throws Reg.service.exception.NoSuchBilling1Exception {

		return getPersistence().findByPrimaryKey(billingAddressId);
	}

	/**
	 * Returns the billing1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param billingAddressId the primary key of the billing1
	 * @return the billing1, or <code>null</code> if a billing1 with the primary key could not be found
	 */
	public static Billing1 fetchByPrimaryKey(long billingAddressId) {
		return getPersistence().fetchByPrimaryKey(billingAddressId);
	}

	/**
	 * Returns all the billing1s.
	 *
	 * @return the billing1s
	 */
	public static List<Billing1> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the billing1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Billing1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of billing1s
	 * @param end the upper bound of the range of billing1s (not inclusive)
	 * @return the range of billing1s
	 */
	public static List<Billing1> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the billing1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Billing1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of billing1s
	 * @param end the upper bound of the range of billing1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of billing1s
	 */
	public static List<Billing1> findAll(
		int start, int end, OrderByComparator<Billing1> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the billing1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Billing1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of billing1s
	 * @param end the upper bound of the range of billing1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of billing1s
	 */
	public static List<Billing1> findAll(
		int start, int end, OrderByComparator<Billing1> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the billing1s from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of billing1s.
	 *
	 * @return the number of billing1s
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Billing1Persistence getPersistence() {
		return _persistence;
	}

	private static volatile Billing1Persistence _persistence;

}