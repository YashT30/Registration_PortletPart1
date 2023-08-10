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

import Reg.service.exception.NoSuchStudent1Exception;
import Reg.service.model.Student1;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the student1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student1Util
 * @generated
 */
@ProviderType
public interface Student1Persistence extends BasePersistence<Student1> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Student1Util} to access the student1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the student1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching student1s
	 */
	public java.util.List<Student1> findByUuid(String uuid);

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
	public java.util.List<Student1> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Student1> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student1>
			orderByComparator);

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
	public java.util.List<Student1> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student1>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first student1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student1
	 * @throws NoSuchStudent1Exception if a matching student1 could not be found
	 */
	public Student1 findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Student1>
				orderByComparator)
		throws NoSuchStudent1Exception;

	/**
	 * Returns the first student1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student1, or <code>null</code> if a matching student1 could not be found
	 */
	public Student1 fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Student1>
			orderByComparator);

	/**
	 * Returns the last student1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student1
	 * @throws NoSuchStudent1Exception if a matching student1 could not be found
	 */
	public Student1 findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Student1>
				orderByComparator)
		throws NoSuchStudent1Exception;

	/**
	 * Returns the last student1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student1, or <code>null</code> if a matching student1 could not be found
	 */
	public Student1 fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Student1>
			orderByComparator);

	/**
	 * Returns the student1s before and after the current student1 in the ordered set where uuid = &#63;.
	 *
	 * @param userId the primary key of the current student1
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student1
	 * @throws NoSuchStudent1Exception if a student1 with the primary key could not be found
	 */
	public Student1[] findByUuid_PrevAndNext(
			long userId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Student1>
				orderByComparator)
		throws NoSuchStudent1Exception;

	/**
	 * Removes all the student1s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of student1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching student1s
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the student1s where username = &#63;.
	 *
	 * @param username the username
	 * @return the matching student1s
	 */
	public java.util.List<Student1> findByUsername(String username);

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
	public java.util.List<Student1> findByUsername(
		String username, int start, int end);

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
	public java.util.List<Student1> findByUsername(
		String username, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student1>
			orderByComparator);

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
	public java.util.List<Student1> findByUsername(
		String username, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student1>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first student1 in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student1
	 * @throws NoSuchStudent1Exception if a matching student1 could not be found
	 */
	public Student1 findByUsername_First(
			String username,
			com.liferay.portal.kernel.util.OrderByComparator<Student1>
				orderByComparator)
		throws NoSuchStudent1Exception;

	/**
	 * Returns the first student1 in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student1, or <code>null</code> if a matching student1 could not be found
	 */
	public Student1 fetchByUsername_First(
		String username,
		com.liferay.portal.kernel.util.OrderByComparator<Student1>
			orderByComparator);

	/**
	 * Returns the last student1 in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student1
	 * @throws NoSuchStudent1Exception if a matching student1 could not be found
	 */
	public Student1 findByUsername_Last(
			String username,
			com.liferay.portal.kernel.util.OrderByComparator<Student1>
				orderByComparator)
		throws NoSuchStudent1Exception;

	/**
	 * Returns the last student1 in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student1, or <code>null</code> if a matching student1 could not be found
	 */
	public Student1 fetchByUsername_Last(
		String username,
		com.liferay.portal.kernel.util.OrderByComparator<Student1>
			orderByComparator);

	/**
	 * Returns the student1s before and after the current student1 in the ordered set where username = &#63;.
	 *
	 * @param userId the primary key of the current student1
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student1
	 * @throws NoSuchStudent1Exception if a student1 with the primary key could not be found
	 */
	public Student1[] findByUsername_PrevAndNext(
			long userId, String username,
			com.liferay.portal.kernel.util.OrderByComparator<Student1>
				orderByComparator)
		throws NoSuchStudent1Exception;

	/**
	 * Removes all the student1s where username = &#63; from the database.
	 *
	 * @param username the username
	 */
	public void removeByUsername(String username);

	/**
	 * Returns the number of student1s where username = &#63;.
	 *
	 * @param username the username
	 * @return the number of matching student1s
	 */
	public int countByUsername(String username);

	/**
	 * Caches the student1 in the entity cache if it is enabled.
	 *
	 * @param student1 the student1
	 */
	public void cacheResult(Student1 student1);

	/**
	 * Caches the student1s in the entity cache if it is enabled.
	 *
	 * @param student1s the student1s
	 */
	public void cacheResult(java.util.List<Student1> student1s);

	/**
	 * Creates a new student1 with the primary key. Does not add the student1 to the database.
	 *
	 * @param userId the primary key for the new student1
	 * @return the new student1
	 */
	public Student1 create(long userId);

	/**
	 * Removes the student1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the student1
	 * @return the student1 that was removed
	 * @throws NoSuchStudent1Exception if a student1 with the primary key could not be found
	 */
	public Student1 remove(long userId) throws NoSuchStudent1Exception;

	public Student1 updateImpl(Student1 student1);

	/**
	 * Returns the student1 with the primary key or throws a <code>NoSuchStudent1Exception</code> if it could not be found.
	 *
	 * @param userId the primary key of the student1
	 * @return the student1
	 * @throws NoSuchStudent1Exception if a student1 with the primary key could not be found
	 */
	public Student1 findByPrimaryKey(long userId)
		throws NoSuchStudent1Exception;

	/**
	 * Returns the student1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userId the primary key of the student1
	 * @return the student1, or <code>null</code> if a student1 with the primary key could not be found
	 */
	public Student1 fetchByPrimaryKey(long userId);

	/**
	 * Returns all the student1s.
	 *
	 * @return the student1s
	 */
	public java.util.List<Student1> findAll();

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
	public java.util.List<Student1> findAll(int start, int end);

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
	public java.util.List<Student1> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student1>
			orderByComparator);

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
	public java.util.List<Student1> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Student1>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the student1s from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of student1s.
	 *
	 * @return the number of student1s
	 */
	public int countAll();

}