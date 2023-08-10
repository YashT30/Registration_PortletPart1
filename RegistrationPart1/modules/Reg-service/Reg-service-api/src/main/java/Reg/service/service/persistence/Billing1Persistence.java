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

import Reg.service.exception.NoSuchBilling1Exception;
import Reg.service.model.Billing1;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the billing1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Billing1Util
 * @generated
 */
@ProviderType
public interface Billing1Persistence extends BasePersistence<Billing1> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Billing1Util} to access the billing1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the billing1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching billing1s
	 */
	public java.util.List<Billing1> findByUuid(String uuid);

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
	public java.util.List<Billing1> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Billing1> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Billing1>
			orderByComparator);

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
	public java.util.List<Billing1> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Billing1>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first billing1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching billing1
	 * @throws NoSuchBilling1Exception if a matching billing1 could not be found
	 */
	public Billing1 findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Billing1>
				orderByComparator)
		throws NoSuchBilling1Exception;

	/**
	 * Returns the first billing1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching billing1, or <code>null</code> if a matching billing1 could not be found
	 */
	public Billing1 fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Billing1>
			orderByComparator);

	/**
	 * Returns the last billing1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching billing1
	 * @throws NoSuchBilling1Exception if a matching billing1 could not be found
	 */
	public Billing1 findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Billing1>
				orderByComparator)
		throws NoSuchBilling1Exception;

	/**
	 * Returns the last billing1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching billing1, or <code>null</code> if a matching billing1 could not be found
	 */
	public Billing1 fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Billing1>
			orderByComparator);

	/**
	 * Returns the billing1s before and after the current billing1 in the ordered set where uuid = &#63;.
	 *
	 * @param billingAddressId the primary key of the current billing1
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next billing1
	 * @throws NoSuchBilling1Exception if a billing1 with the primary key could not be found
	 */
	public Billing1[] findByUuid_PrevAndNext(
			long billingAddressId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Billing1>
				orderByComparator)
		throws NoSuchBilling1Exception;

	/**
	 * Removes all the billing1s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of billing1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching billing1s
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the billing1 in the entity cache if it is enabled.
	 *
	 * @param billing1 the billing1
	 */
	public void cacheResult(Billing1 billing1);

	/**
	 * Caches the billing1s in the entity cache if it is enabled.
	 *
	 * @param billing1s the billing1s
	 */
	public void cacheResult(java.util.List<Billing1> billing1s);

	/**
	 * Creates a new billing1 with the primary key. Does not add the billing1 to the database.
	 *
	 * @param billingAddressId the primary key for the new billing1
	 * @return the new billing1
	 */
	public Billing1 create(long billingAddressId);

	/**
	 * Removes the billing1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param billingAddressId the primary key of the billing1
	 * @return the billing1 that was removed
	 * @throws NoSuchBilling1Exception if a billing1 with the primary key could not be found
	 */
	public Billing1 remove(long billingAddressId)
		throws NoSuchBilling1Exception;

	public Billing1 updateImpl(Billing1 billing1);

	/**
	 * Returns the billing1 with the primary key or throws a <code>NoSuchBilling1Exception</code> if it could not be found.
	 *
	 * @param billingAddressId the primary key of the billing1
	 * @return the billing1
	 * @throws NoSuchBilling1Exception if a billing1 with the primary key could not be found
	 */
	public Billing1 findByPrimaryKey(long billingAddressId)
		throws NoSuchBilling1Exception;

	/**
	 * Returns the billing1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param billingAddressId the primary key of the billing1
	 * @return the billing1, or <code>null</code> if a billing1 with the primary key could not be found
	 */
	public Billing1 fetchByPrimaryKey(long billingAddressId);

	/**
	 * Returns all the billing1s.
	 *
	 * @return the billing1s
	 */
	public java.util.List<Billing1> findAll();

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
	public java.util.List<Billing1> findAll(int start, int end);

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
	public java.util.List<Billing1> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Billing1>
			orderByComparator);

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
	public java.util.List<Billing1> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Billing1>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the billing1s from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of billing1s.
	 *
	 * @return the number of billing1s
	 */
	public int countAll();

}