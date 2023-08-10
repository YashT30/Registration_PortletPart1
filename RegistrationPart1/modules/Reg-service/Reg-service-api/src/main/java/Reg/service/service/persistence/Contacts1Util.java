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

import Reg.service.model.Contacts1;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the contacts1 service. This utility wraps <code>Reg.service.service.persistence.impl.Contacts1PersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Contacts1Persistence
 * @generated
 */
public class Contacts1Util {

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
	public static void clearCache(Contacts1 contacts1) {
		getPersistence().clearCache(contacts1);
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
	public static Map<Serializable, Contacts1> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Contacts1> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Contacts1> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Contacts1> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Contacts1> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Contacts1 update(Contacts1 contacts1) {
		return getPersistence().update(contacts1);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Contacts1 update(
		Contacts1 contacts1, ServiceContext serviceContext) {

		return getPersistence().update(contacts1, serviceContext);
	}

	/**
	 * Returns all the contacts1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching contacts1s
	 */
	public static List<Contacts1> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the contacts1s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Contacts1ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contacts1s
	 * @param end the upper bound of the range of contacts1s (not inclusive)
	 * @return the range of matching contacts1s
	 */
	public static List<Contacts1> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the contacts1s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Contacts1ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contacts1s
	 * @param end the upper bound of the range of contacts1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contacts1s
	 */
	public static List<Contacts1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Contacts1> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contacts1s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Contacts1ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contacts1s
	 * @param end the upper bound of the range of contacts1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching contacts1s
	 */
	public static List<Contacts1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Contacts1> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first contacts1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacts1
	 * @throws NoSuchContacts1Exception if a matching contacts1 could not be found
	 */
	public static Contacts1 findByUuid_First(
			String uuid, OrderByComparator<Contacts1> orderByComparator)
		throws Reg.service.exception.NoSuchContacts1Exception {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first contacts1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacts1, or <code>null</code> if a matching contacts1 could not be found
	 */
	public static Contacts1 fetchByUuid_First(
		String uuid, OrderByComparator<Contacts1> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last contacts1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacts1
	 * @throws NoSuchContacts1Exception if a matching contacts1 could not be found
	 */
	public static Contacts1 findByUuid_Last(
			String uuid, OrderByComparator<Contacts1> orderByComparator)
		throws Reg.service.exception.NoSuchContacts1Exception {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last contacts1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacts1, or <code>null</code> if a matching contacts1 could not be found
	 */
	public static Contacts1 fetchByUuid_Last(
		String uuid, OrderByComparator<Contacts1> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the contacts1s before and after the current contacts1 in the ordered set where uuid = &#63;.
	 *
	 * @param phoneId the primary key of the current contacts1
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contacts1
	 * @throws NoSuchContacts1Exception if a contacts1 with the primary key could not be found
	 */
	public static Contacts1[] findByUuid_PrevAndNext(
			long phoneId, String uuid,
			OrderByComparator<Contacts1> orderByComparator)
		throws Reg.service.exception.NoSuchContacts1Exception {

		return getPersistence().findByUuid_PrevAndNext(
			phoneId, uuid, orderByComparator);
	}

	/**
	 * Removes all the contacts1s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of contacts1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching contacts1s
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the contacts1 in the entity cache if it is enabled.
	 *
	 * @param contacts1 the contacts1
	 */
	public static void cacheResult(Contacts1 contacts1) {
		getPersistence().cacheResult(contacts1);
	}

	/**
	 * Caches the contacts1s in the entity cache if it is enabled.
	 *
	 * @param contacts1s the contacts1s
	 */
	public static void cacheResult(List<Contacts1> contacts1s) {
		getPersistence().cacheResult(contacts1s);
	}

	/**
	 * Creates a new contacts1 with the primary key. Does not add the contacts1 to the database.
	 *
	 * @param phoneId the primary key for the new contacts1
	 * @return the new contacts1
	 */
	public static Contacts1 create(long phoneId) {
		return getPersistence().create(phoneId);
	}

	/**
	 * Removes the contacts1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param phoneId the primary key of the contacts1
	 * @return the contacts1 that was removed
	 * @throws NoSuchContacts1Exception if a contacts1 with the primary key could not be found
	 */
	public static Contacts1 remove(long phoneId)
		throws Reg.service.exception.NoSuchContacts1Exception {

		return getPersistence().remove(phoneId);
	}

	public static Contacts1 updateImpl(Contacts1 contacts1) {
		return getPersistence().updateImpl(contacts1);
	}

	/**
	 * Returns the contacts1 with the primary key or throws a <code>NoSuchContacts1Exception</code> if it could not be found.
	 *
	 * @param phoneId the primary key of the contacts1
	 * @return the contacts1
	 * @throws NoSuchContacts1Exception if a contacts1 with the primary key could not be found
	 */
	public static Contacts1 findByPrimaryKey(long phoneId)
		throws Reg.service.exception.NoSuchContacts1Exception {

		return getPersistence().findByPrimaryKey(phoneId);
	}

	/**
	 * Returns the contacts1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param phoneId the primary key of the contacts1
	 * @return the contacts1, or <code>null</code> if a contacts1 with the primary key could not be found
	 */
	public static Contacts1 fetchByPrimaryKey(long phoneId) {
		return getPersistence().fetchByPrimaryKey(phoneId);
	}

	/**
	 * Returns all the contacts1s.
	 *
	 * @return the contacts1s
	 */
	public static List<Contacts1> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the contacts1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Contacts1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contacts1s
	 * @param end the upper bound of the range of contacts1s (not inclusive)
	 * @return the range of contacts1s
	 */
	public static List<Contacts1> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the contacts1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Contacts1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contacts1s
	 * @param end the upper bound of the range of contacts1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of contacts1s
	 */
	public static List<Contacts1> findAll(
		int start, int end, OrderByComparator<Contacts1> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contacts1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Contacts1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contacts1s
	 * @param end the upper bound of the range of contacts1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of contacts1s
	 */
	public static List<Contacts1> findAll(
		int start, int end, OrderByComparator<Contacts1> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the contacts1s from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of contacts1s.
	 *
	 * @return the number of contacts1s
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Contacts1Persistence getPersistence() {
		return _persistence;
	}

	private static volatile Contacts1Persistence _persistence;

}