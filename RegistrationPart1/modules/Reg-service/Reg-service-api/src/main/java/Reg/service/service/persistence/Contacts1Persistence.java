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

import Reg.service.exception.NoSuchContacts1Exception;
import Reg.service.model.Contacts1;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the contacts1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Contacts1Util
 * @generated
 */
@ProviderType
public interface Contacts1Persistence extends BasePersistence<Contacts1> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Contacts1Util} to access the contacts1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the contacts1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching contacts1s
	 */
	public java.util.List<Contacts1> findByUuid(String uuid);

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
	public java.util.List<Contacts1> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Contacts1> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contacts1>
			orderByComparator);

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
	public java.util.List<Contacts1> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contacts1>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first contacts1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacts1
	 * @throws NoSuchContacts1Exception if a matching contacts1 could not be found
	 */
	public Contacts1 findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Contacts1>
				orderByComparator)
		throws NoSuchContacts1Exception;

	/**
	 * Returns the first contacts1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacts1, or <code>null</code> if a matching contacts1 could not be found
	 */
	public Contacts1 fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Contacts1>
			orderByComparator);

	/**
	 * Returns the last contacts1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacts1
	 * @throws NoSuchContacts1Exception if a matching contacts1 could not be found
	 */
	public Contacts1 findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Contacts1>
				orderByComparator)
		throws NoSuchContacts1Exception;

	/**
	 * Returns the last contacts1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacts1, or <code>null</code> if a matching contacts1 could not be found
	 */
	public Contacts1 fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Contacts1>
			orderByComparator);

	/**
	 * Returns the contacts1s before and after the current contacts1 in the ordered set where uuid = &#63;.
	 *
	 * @param phoneId the primary key of the current contacts1
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contacts1
	 * @throws NoSuchContacts1Exception if a contacts1 with the primary key could not be found
	 */
	public Contacts1[] findByUuid_PrevAndNext(
			long phoneId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Contacts1>
				orderByComparator)
		throws NoSuchContacts1Exception;

	/**
	 * Removes all the contacts1s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of contacts1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching contacts1s
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the contacts1 in the entity cache if it is enabled.
	 *
	 * @param contacts1 the contacts1
	 */
	public void cacheResult(Contacts1 contacts1);

	/**
	 * Caches the contacts1s in the entity cache if it is enabled.
	 *
	 * @param contacts1s the contacts1s
	 */
	public void cacheResult(java.util.List<Contacts1> contacts1s);

	/**
	 * Creates a new contacts1 with the primary key. Does not add the contacts1 to the database.
	 *
	 * @param phoneId the primary key for the new contacts1
	 * @return the new contacts1
	 */
	public Contacts1 create(long phoneId);

	/**
	 * Removes the contacts1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param phoneId the primary key of the contacts1
	 * @return the contacts1 that was removed
	 * @throws NoSuchContacts1Exception if a contacts1 with the primary key could not be found
	 */
	public Contacts1 remove(long phoneId) throws NoSuchContacts1Exception;

	public Contacts1 updateImpl(Contacts1 contacts1);

	/**
	 * Returns the contacts1 with the primary key or throws a <code>NoSuchContacts1Exception</code> if it could not be found.
	 *
	 * @param phoneId the primary key of the contacts1
	 * @return the contacts1
	 * @throws NoSuchContacts1Exception if a contacts1 with the primary key could not be found
	 */
	public Contacts1 findByPrimaryKey(long phoneId)
		throws NoSuchContacts1Exception;

	/**
	 * Returns the contacts1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param phoneId the primary key of the contacts1
	 * @return the contacts1, or <code>null</code> if a contacts1 with the primary key could not be found
	 */
	public Contacts1 fetchByPrimaryKey(long phoneId);

	/**
	 * Returns all the contacts1s.
	 *
	 * @return the contacts1s
	 */
	public java.util.List<Contacts1> findAll();

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
	public java.util.List<Contacts1> findAll(int start, int end);

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
	public java.util.List<Contacts1> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contacts1>
			orderByComparator);

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
	public java.util.List<Contacts1> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contacts1>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the contacts1s from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of contacts1s.
	 *
	 * @return the number of contacts1s
	 */
	public int countAll();

}