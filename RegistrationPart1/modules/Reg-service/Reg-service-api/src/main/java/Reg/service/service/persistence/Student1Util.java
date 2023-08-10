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

import Reg.service.model.Student1;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the student1 service. This utility wraps <code>Reg.service.service.persistence.impl.Student1PersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student1Persistence
 * @generated
 */
public class Student1Util {

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
	public static void clearCache(Student1 student1) {
		getPersistence().clearCache(student1);
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
	public static Map<Serializable, Student1> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Student1> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Student1> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Student1> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Student1> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Student1 update(Student1 student1) {
		return getPersistence().update(student1);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Student1 update(
		Student1 student1, ServiceContext serviceContext) {

		return getPersistence().update(student1, serviceContext);
	}

	/**
	 * Returns all the student1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching student1s
	 */
	public static List<Student1> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the student1s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Student1ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of student1s
	 * @param end the upper bound of the range of student1s (not inclusive)
	 * @return the range of matching student1s
	 */
	public static List<Student1> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the student1s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Student1ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of student1s
	 * @param end the upper bound of the range of student1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching student1s
	 */
	public static List<Student1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Student1> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the student1s where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Student1ModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of student1s
	 * @param end the upper bound of the range of student1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching student1s
	 */
	public static List<Student1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Student1> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first student1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student1
	 * @throws NoSuchStudent1Exception if a matching student1 could not be found
	 */
	public static Student1 findByUuid_First(
			String uuid, OrderByComparator<Student1> orderByComparator)
		throws Reg.service.exception.NoSuchStudent1Exception {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first student1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student1, or <code>null</code> if a matching student1 could not be found
	 */
	public static Student1 fetchByUuid_First(
		String uuid, OrderByComparator<Student1> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last student1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student1
	 * @throws NoSuchStudent1Exception if a matching student1 could not be found
	 */
	public static Student1 findByUuid_Last(
			String uuid, OrderByComparator<Student1> orderByComparator)
		throws Reg.service.exception.NoSuchStudent1Exception {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last student1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student1, or <code>null</code> if a matching student1 could not be found
	 */
	public static Student1 fetchByUuid_Last(
		String uuid, OrderByComparator<Student1> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the student1s before and after the current student1 in the ordered set where uuid = &#63;.
	 *
	 * @param userId the primary key of the current student1
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student1
	 * @throws NoSuchStudent1Exception if a student1 with the primary key could not be found
	 */
	public static Student1[] findByUuid_PrevAndNext(
			long userId, String uuid,
			OrderByComparator<Student1> orderByComparator)
		throws Reg.service.exception.NoSuchStudent1Exception {

		return getPersistence().findByUuid_PrevAndNext(
			userId, uuid, orderByComparator);
	}

	/**
	 * Removes all the student1s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of student1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching student1s
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the student1s where username = &#63;.
	 *
	 * @param username the username
	 * @return the matching student1s
	 */
	public static List<Student1> findByUsername(String username) {
		return getPersistence().findByUsername(username);
	}

	/**
	 * Returns a range of all the student1s where username = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Student1ModelImpl</code>.
	 * </p>
	 *
	 * @param username the username
	 * @param start the lower bound of the range of student1s
	 * @param end the upper bound of the range of student1s (not inclusive)
	 * @return the range of matching student1s
	 */
	public static List<Student1> findByUsername(
		String username, int start, int end) {

		return getPersistence().findByUsername(username, start, end);
	}

	/**
	 * Returns an ordered range of all the student1s where username = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Student1ModelImpl</code>.
	 * </p>
	 *
	 * @param username the username
	 * @param start the lower bound of the range of student1s
	 * @param end the upper bound of the range of student1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching student1s
	 */
	public static List<Student1> findByUsername(
		String username, int start, int end,
		OrderByComparator<Student1> orderByComparator) {

		return getPersistence().findByUsername(
			username, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the student1s where username = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Student1ModelImpl</code>.
	 * </p>
	 *
	 * @param username the username
	 * @param start the lower bound of the range of student1s
	 * @param end the upper bound of the range of student1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching student1s
	 */
	public static List<Student1> findByUsername(
		String username, int start, int end,
		OrderByComparator<Student1> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUsername(
			username, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first student1 in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student1
	 * @throws NoSuchStudent1Exception if a matching student1 could not be found
	 */
	public static Student1 findByUsername_First(
			String username, OrderByComparator<Student1> orderByComparator)
		throws Reg.service.exception.NoSuchStudent1Exception {

		return getPersistence().findByUsername_First(
			username, orderByComparator);
	}

	/**
	 * Returns the first student1 in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student1, or <code>null</code> if a matching student1 could not be found
	 */
	public static Student1 fetchByUsername_First(
		String username, OrderByComparator<Student1> orderByComparator) {

		return getPersistence().fetchByUsername_First(
			username, orderByComparator);
	}

	/**
	 * Returns the last student1 in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student1
	 * @throws NoSuchStudent1Exception if a matching student1 could not be found
	 */
	public static Student1 findByUsername_Last(
			String username, OrderByComparator<Student1> orderByComparator)
		throws Reg.service.exception.NoSuchStudent1Exception {

		return getPersistence().findByUsername_Last(
			username, orderByComparator);
	}

	/**
	 * Returns the last student1 in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student1, or <code>null</code> if a matching student1 could not be found
	 */
	public static Student1 fetchByUsername_Last(
		String username, OrderByComparator<Student1> orderByComparator) {

		return getPersistence().fetchByUsername_Last(
			username, orderByComparator);
	}

	/**
	 * Returns the student1s before and after the current student1 in the ordered set where username = &#63;.
	 *
	 * @param userId the primary key of the current student1
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student1
	 * @throws NoSuchStudent1Exception if a student1 with the primary key could not be found
	 */
	public static Student1[] findByUsername_PrevAndNext(
			long userId, String username,
			OrderByComparator<Student1> orderByComparator)
		throws Reg.service.exception.NoSuchStudent1Exception {

		return getPersistence().findByUsername_PrevAndNext(
			userId, username, orderByComparator);
	}

	/**
	 * Removes all the student1s where username = &#63; from the database.
	 *
	 * @param username the username
	 */
	public static void removeByUsername(String username) {
		getPersistence().removeByUsername(username);
	}

	/**
	 * Returns the number of student1s where username = &#63;.
	 *
	 * @param username the username
	 * @return the number of matching student1s
	 */
	public static int countByUsername(String username) {
		return getPersistence().countByUsername(username);
	}

	/**
	 * Caches the student1 in the entity cache if it is enabled.
	 *
	 * @param student1 the student1
	 */
	public static void cacheResult(Student1 student1) {
		getPersistence().cacheResult(student1);
	}

	/**
	 * Caches the student1s in the entity cache if it is enabled.
	 *
	 * @param student1s the student1s
	 */
	public static void cacheResult(List<Student1> student1s) {
		getPersistence().cacheResult(student1s);
	}

	/**
	 * Creates a new student1 with the primary key. Does not add the student1 to the database.
	 *
	 * @param userId the primary key for the new student1
	 * @return the new student1
	 */
	public static Student1 create(long userId) {
		return getPersistence().create(userId);
	}

	/**
	 * Removes the student1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the student1
	 * @return the student1 that was removed
	 * @throws NoSuchStudent1Exception if a student1 with the primary key could not be found
	 */
	public static Student1 remove(long userId)
		throws Reg.service.exception.NoSuchStudent1Exception {

		return getPersistence().remove(userId);
	}

	public static Student1 updateImpl(Student1 student1) {
		return getPersistence().updateImpl(student1);
	}

	/**
	 * Returns the student1 with the primary key or throws a <code>NoSuchStudent1Exception</code> if it could not be found.
	 *
	 * @param userId the primary key of the student1
	 * @return the student1
	 * @throws NoSuchStudent1Exception if a student1 with the primary key could not be found
	 */
	public static Student1 findByPrimaryKey(long userId)
		throws Reg.service.exception.NoSuchStudent1Exception {

		return getPersistence().findByPrimaryKey(userId);
	}

	/**
	 * Returns the student1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userId the primary key of the student1
	 * @return the student1, or <code>null</code> if a student1 with the primary key could not be found
	 */
	public static Student1 fetchByPrimaryKey(long userId) {
		return getPersistence().fetchByPrimaryKey(userId);
	}

	/**
	 * Returns all the student1s.
	 *
	 * @return the student1s
	 */
	public static List<Student1> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the student1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Student1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of student1s
	 * @param end the upper bound of the range of student1s (not inclusive)
	 * @return the range of student1s
	 */
	public static List<Student1> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the student1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Student1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of student1s
	 * @param end the upper bound of the range of student1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of student1s
	 */
	public static List<Student1> findAll(
		int start, int end, OrderByComparator<Student1> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the student1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Student1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of student1s
	 * @param end the upper bound of the range of student1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of student1s
	 */
	public static List<Student1> findAll(
		int start, int end, OrderByComparator<Student1> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the student1s from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of student1s.
	 *
	 * @return the number of student1s
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Student1Persistence getPersistence() {
		return _persistence;
	}

	private static volatile Student1Persistence _persistence;

}