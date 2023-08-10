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

package Reg.service.service.persistence.impl;

import Reg.service.exception.NoSuchBilling1Exception;
import Reg.service.model.Billing1;
import Reg.service.model.Billing1Table;
import Reg.service.model.impl.Billing1Impl;
import Reg.service.model.impl.Billing1ModelImpl;
import Reg.service.service.persistence.Billing1Persistence;
import Reg.service.service.persistence.Billing1Util;
import Reg.service.service.persistence.impl.constants.YashPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUID;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the billing1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = Billing1Persistence.class)
public class Billing1PersistenceImpl
	extends BasePersistenceImpl<Billing1> implements Billing1Persistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>Billing1Util</code> to access the billing1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		Billing1Impl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the billing1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching billing1s
	 */
	@Override
	public List<Billing1> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Billing1> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Billing1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Billing1> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Billing1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Billing1> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Billing1> list = null;

		if (useFinderCache) {
			list = (List<Billing1>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Billing1 billing1 : list) {
					if (!uuid.equals(billing1.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_BILLING1_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(Billing1ModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Billing1>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first billing1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching billing1
	 * @throws NoSuchBilling1Exception if a matching billing1 could not be found
	 */
	@Override
	public Billing1 findByUuid_First(
			String uuid, OrderByComparator<Billing1> orderByComparator)
		throws NoSuchBilling1Exception {

		Billing1 billing1 = fetchByUuid_First(uuid, orderByComparator);

		if (billing1 != null) {
			return billing1;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchBilling1Exception(sb.toString());
	}

	/**
	 * Returns the first billing1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching billing1, or <code>null</code> if a matching billing1 could not be found
	 */
	@Override
	public Billing1 fetchByUuid_First(
		String uuid, OrderByComparator<Billing1> orderByComparator) {

		List<Billing1> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last billing1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching billing1
	 * @throws NoSuchBilling1Exception if a matching billing1 could not be found
	 */
	@Override
	public Billing1 findByUuid_Last(
			String uuid, OrderByComparator<Billing1> orderByComparator)
		throws NoSuchBilling1Exception {

		Billing1 billing1 = fetchByUuid_Last(uuid, orderByComparator);

		if (billing1 != null) {
			return billing1;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchBilling1Exception(sb.toString());
	}

	/**
	 * Returns the last billing1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching billing1, or <code>null</code> if a matching billing1 could not be found
	 */
	@Override
	public Billing1 fetchByUuid_Last(
		String uuid, OrderByComparator<Billing1> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Billing1> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Billing1[] findByUuid_PrevAndNext(
			long billingAddressId, String uuid,
			OrderByComparator<Billing1> orderByComparator)
		throws NoSuchBilling1Exception {

		uuid = Objects.toString(uuid, "");

		Billing1 billing1 = findByPrimaryKey(billingAddressId);

		Session session = null;

		try {
			session = openSession();

			Billing1[] array = new Billing1Impl[3];

			array[0] = getByUuid_PrevAndNext(
				session, billing1, uuid, orderByComparator, true);

			array[1] = billing1;

			array[2] = getByUuid_PrevAndNext(
				session, billing1, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Billing1 getByUuid_PrevAndNext(
		Session session, Billing1 billing1, String uuid,
		OrderByComparator<Billing1> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_BILLING1_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(Billing1ModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(billing1)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Billing1> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the billing1s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Billing1 billing1 :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(billing1);
		}
	}

	/**
	 * Returns the number of billing1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching billing1s
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_BILLING1_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"billing1.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(billing1.uuid IS NULL OR billing1.uuid = '')";

	public Billing1PersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("state", "state_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Billing1.class);

		setModelImplClass(Billing1Impl.class);
		setModelPKClass(long.class);

		setTable(Billing1Table.INSTANCE);
	}

	/**
	 * Caches the billing1 in the entity cache if it is enabled.
	 *
	 * @param billing1 the billing1
	 */
	@Override
	public void cacheResult(Billing1 billing1) {
		entityCache.putResult(
			Billing1Impl.class, billing1.getPrimaryKey(), billing1);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the billing1s in the entity cache if it is enabled.
	 *
	 * @param billing1s the billing1s
	 */
	@Override
	public void cacheResult(List<Billing1> billing1s) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (billing1s.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Billing1 billing1 : billing1s) {
			if (entityCache.getResult(
					Billing1Impl.class, billing1.getPrimaryKey()) == null) {

				cacheResult(billing1);
			}
		}
	}

	/**
	 * Clears the cache for all billing1s.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Billing1Impl.class);

		finderCache.clearCache(Billing1Impl.class);
	}

	/**
	 * Clears the cache for the billing1.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Billing1 billing1) {
		entityCache.removeResult(Billing1Impl.class, billing1);
	}

	@Override
	public void clearCache(List<Billing1> billing1s) {
		for (Billing1 billing1 : billing1s) {
			entityCache.removeResult(Billing1Impl.class, billing1);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(Billing1Impl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(Billing1Impl.class, primaryKey);
		}
	}

	/**
	 * Creates a new billing1 with the primary key. Does not add the billing1 to the database.
	 *
	 * @param billingAddressId the primary key for the new billing1
	 * @return the new billing1
	 */
	@Override
	public Billing1 create(long billingAddressId) {
		Billing1 billing1 = new Billing1Impl();

		billing1.setNew(true);
		billing1.setPrimaryKey(billingAddressId);

		String uuid = _portalUUID.generate();

		billing1.setUuid(uuid);

		return billing1;
	}

	/**
	 * Removes the billing1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param billingAddressId the primary key of the billing1
	 * @return the billing1 that was removed
	 * @throws NoSuchBilling1Exception if a billing1 with the primary key could not be found
	 */
	@Override
	public Billing1 remove(long billingAddressId)
		throws NoSuchBilling1Exception {

		return remove((Serializable)billingAddressId);
	}

	/**
	 * Removes the billing1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the billing1
	 * @return the billing1 that was removed
	 * @throws NoSuchBilling1Exception if a billing1 with the primary key could not be found
	 */
	@Override
	public Billing1 remove(Serializable primaryKey)
		throws NoSuchBilling1Exception {

		Session session = null;

		try {
			session = openSession();

			Billing1 billing1 = (Billing1)session.get(
				Billing1Impl.class, primaryKey);

			if (billing1 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBilling1Exception(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(billing1);
		}
		catch (NoSuchBilling1Exception noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Billing1 removeImpl(Billing1 billing1) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(billing1)) {
				billing1 = (Billing1)session.get(
					Billing1Impl.class, billing1.getPrimaryKeyObj());
			}

			if (billing1 != null) {
				session.delete(billing1);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (billing1 != null) {
			clearCache(billing1);
		}

		return billing1;
	}

	@Override
	public Billing1 updateImpl(Billing1 billing1) {
		boolean isNew = billing1.isNew();

		if (!(billing1 instanceof Billing1ModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(billing1.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(billing1);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in billing1 proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Billing1 implementation " +
					billing1.getClass());
		}

		Billing1ModelImpl billing1ModelImpl = (Billing1ModelImpl)billing1;

		if (Validator.isNull(billing1.getUuid())) {
			String uuid = _portalUUID.generate();

			billing1.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(billing1);
			}
			else {
				billing1 = (Billing1)session.merge(billing1);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			Billing1Impl.class, billing1ModelImpl, false, true);

		if (isNew) {
			billing1.setNew(false);
		}

		billing1.resetOriginalValues();

		return billing1;
	}

	/**
	 * Returns the billing1 with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the billing1
	 * @return the billing1
	 * @throws NoSuchBilling1Exception if a billing1 with the primary key could not be found
	 */
	@Override
	public Billing1 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBilling1Exception {

		Billing1 billing1 = fetchByPrimaryKey(primaryKey);

		if (billing1 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBilling1Exception(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return billing1;
	}

	/**
	 * Returns the billing1 with the primary key or throws a <code>NoSuchBilling1Exception</code> if it could not be found.
	 *
	 * @param billingAddressId the primary key of the billing1
	 * @return the billing1
	 * @throws NoSuchBilling1Exception if a billing1 with the primary key could not be found
	 */
	@Override
	public Billing1 findByPrimaryKey(long billingAddressId)
		throws NoSuchBilling1Exception {

		return findByPrimaryKey((Serializable)billingAddressId);
	}

	/**
	 * Returns the billing1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param billingAddressId the primary key of the billing1
	 * @return the billing1, or <code>null</code> if a billing1 with the primary key could not be found
	 */
	@Override
	public Billing1 fetchByPrimaryKey(long billingAddressId) {
		return fetchByPrimaryKey((Serializable)billingAddressId);
	}

	/**
	 * Returns all the billing1s.
	 *
	 * @return the billing1s
	 */
	@Override
	public List<Billing1> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Billing1> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Billing1> findAll(
		int start, int end, OrderByComparator<Billing1> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Billing1> findAll(
		int start, int end, OrderByComparator<Billing1> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Billing1> list = null;

		if (useFinderCache) {
			list = (List<Billing1>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BILLING1);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BILLING1;

				sql = sql.concat(Billing1ModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Billing1>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the billing1s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Billing1 billing1 : findAll()) {
			remove(billing1);
		}
	}

	/**
	 * Returns the number of billing1s.
	 *
	 * @return the number of billing1s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_BILLING1);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "billingAddressId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BILLING1;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return Billing1ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the billing1 persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_setBilling1UtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setBilling1UtilPersistence(null);

		entityCache.removeCache(Billing1Impl.class.getName());
	}

	private void _setBilling1UtilPersistence(
		Billing1Persistence billing1Persistence) {

		try {
			Field field = Billing1Util.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, billing1Persistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = YashPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = YashPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = YashPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_BILLING1 =
		"SELECT billing1 FROM Billing1 billing1";

	private static final String _SQL_SELECT_BILLING1_WHERE =
		"SELECT billing1 FROM Billing1 billing1 WHERE ";

	private static final String _SQL_COUNT_BILLING1 =
		"SELECT COUNT(billing1) FROM Billing1 billing1";

	private static final String _SQL_COUNT_BILLING1_WHERE =
		"SELECT COUNT(billing1) FROM Billing1 billing1 WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "billing1.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Billing1 exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Billing1 exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		Billing1PersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "state"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PortalUUID _portalUUID;

}