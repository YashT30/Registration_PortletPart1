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

import Reg.service.exception.NoSuchContacts1Exception;
import Reg.service.model.Contacts1;
import Reg.service.model.Contacts1Table;
import Reg.service.model.impl.Contacts1Impl;
import Reg.service.model.impl.Contacts1ModelImpl;
import Reg.service.service.persistence.Contacts1Persistence;
import Reg.service.service.persistence.Contacts1Util;
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
 * The persistence implementation for the contacts1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = Contacts1Persistence.class)
public class Contacts1PersistenceImpl
	extends BasePersistenceImpl<Contacts1> implements Contacts1Persistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>Contacts1Util</code> to access the contacts1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		Contacts1Impl.class.getName();

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
	 * Returns all the contacts1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching contacts1s
	 */
	@Override
	public List<Contacts1> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Contacts1> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Contacts1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Contacts1> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Contacts1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Contacts1> orderByComparator,
		boolean useFinderCache) {

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

		List<Contacts1> list = null;

		if (useFinderCache) {
			list = (List<Contacts1>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Contacts1 contacts1 : list) {
					if (!uuid.equals(contacts1.getUuid())) {
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

			sb.append(_SQL_SELECT_CONTACTS1_WHERE);

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
				sb.append(Contacts1ModelImpl.ORDER_BY_JPQL);
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

				list = (List<Contacts1>)QueryUtil.list(
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
	 * Returns the first contacts1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacts1
	 * @throws NoSuchContacts1Exception if a matching contacts1 could not be found
	 */
	@Override
	public Contacts1 findByUuid_First(
			String uuid, OrderByComparator<Contacts1> orderByComparator)
		throws NoSuchContacts1Exception {

		Contacts1 contacts1 = fetchByUuid_First(uuid, orderByComparator);

		if (contacts1 != null) {
			return contacts1;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchContacts1Exception(sb.toString());
	}

	/**
	 * Returns the first contacts1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contacts1, or <code>null</code> if a matching contacts1 could not be found
	 */
	@Override
	public Contacts1 fetchByUuid_First(
		String uuid, OrderByComparator<Contacts1> orderByComparator) {

		List<Contacts1> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last contacts1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacts1
	 * @throws NoSuchContacts1Exception if a matching contacts1 could not be found
	 */
	@Override
	public Contacts1 findByUuid_Last(
			String uuid, OrderByComparator<Contacts1> orderByComparator)
		throws NoSuchContacts1Exception {

		Contacts1 contacts1 = fetchByUuid_Last(uuid, orderByComparator);

		if (contacts1 != null) {
			return contacts1;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchContacts1Exception(sb.toString());
	}

	/**
	 * Returns the last contacts1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contacts1, or <code>null</code> if a matching contacts1 could not be found
	 */
	@Override
	public Contacts1 fetchByUuid_Last(
		String uuid, OrderByComparator<Contacts1> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Contacts1> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Contacts1[] findByUuid_PrevAndNext(
			long phoneId, String uuid,
			OrderByComparator<Contacts1> orderByComparator)
		throws NoSuchContacts1Exception {

		uuid = Objects.toString(uuid, "");

		Contacts1 contacts1 = findByPrimaryKey(phoneId);

		Session session = null;

		try {
			session = openSession();

			Contacts1[] array = new Contacts1Impl[3];

			array[0] = getByUuid_PrevAndNext(
				session, contacts1, uuid, orderByComparator, true);

			array[1] = contacts1;

			array[2] = getByUuid_PrevAndNext(
				session, contacts1, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Contacts1 getByUuid_PrevAndNext(
		Session session, Contacts1 contacts1, String uuid,
		OrderByComparator<Contacts1> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CONTACTS1_WHERE);

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
			sb.append(Contacts1ModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(contacts1)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Contacts1> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the contacts1s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Contacts1 contacts1 :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(contacts1);
		}
	}

	/**
	 * Returns the number of contacts1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching contacts1s
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CONTACTS1_WHERE);

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
		"contacts1.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(contacts1.uuid IS NULL OR contacts1.uuid = '')";

	public Contacts1PersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Contacts1.class);

		setModelImplClass(Contacts1Impl.class);
		setModelPKClass(long.class);

		setTable(Contacts1Table.INSTANCE);
	}

	/**
	 * Caches the contacts1 in the entity cache if it is enabled.
	 *
	 * @param contacts1 the contacts1
	 */
	@Override
	public void cacheResult(Contacts1 contacts1) {
		entityCache.putResult(
			Contacts1Impl.class, contacts1.getPrimaryKey(), contacts1);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the contacts1s in the entity cache if it is enabled.
	 *
	 * @param contacts1s the contacts1s
	 */
	@Override
	public void cacheResult(List<Contacts1> contacts1s) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (contacts1s.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Contacts1 contacts1 : contacts1s) {
			if (entityCache.getResult(
					Contacts1Impl.class, contacts1.getPrimaryKey()) == null) {

				cacheResult(contacts1);
			}
		}
	}

	/**
	 * Clears the cache for all contacts1s.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Contacts1Impl.class);

		finderCache.clearCache(Contacts1Impl.class);
	}

	/**
	 * Clears the cache for the contacts1.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Contacts1 contacts1) {
		entityCache.removeResult(Contacts1Impl.class, contacts1);
	}

	@Override
	public void clearCache(List<Contacts1> contacts1s) {
		for (Contacts1 contacts1 : contacts1s) {
			entityCache.removeResult(Contacts1Impl.class, contacts1);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(Contacts1Impl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(Contacts1Impl.class, primaryKey);
		}
	}

	/**
	 * Creates a new contacts1 with the primary key. Does not add the contacts1 to the database.
	 *
	 * @param phoneId the primary key for the new contacts1
	 * @return the new contacts1
	 */
	@Override
	public Contacts1 create(long phoneId) {
		Contacts1 contacts1 = new Contacts1Impl();

		contacts1.setNew(true);
		contacts1.setPrimaryKey(phoneId);

		String uuid = _portalUUID.generate();

		contacts1.setUuid(uuid);

		return contacts1;
	}

	/**
	 * Removes the contacts1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param phoneId the primary key of the contacts1
	 * @return the contacts1 that was removed
	 * @throws NoSuchContacts1Exception if a contacts1 with the primary key could not be found
	 */
	@Override
	public Contacts1 remove(long phoneId) throws NoSuchContacts1Exception {
		return remove((Serializable)phoneId);
	}

	/**
	 * Removes the contacts1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the contacts1
	 * @return the contacts1 that was removed
	 * @throws NoSuchContacts1Exception if a contacts1 with the primary key could not be found
	 */
	@Override
	public Contacts1 remove(Serializable primaryKey)
		throws NoSuchContacts1Exception {

		Session session = null;

		try {
			session = openSession();

			Contacts1 contacts1 = (Contacts1)session.get(
				Contacts1Impl.class, primaryKey);

			if (contacts1 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchContacts1Exception(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(contacts1);
		}
		catch (NoSuchContacts1Exception noSuchEntityException) {
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
	protected Contacts1 removeImpl(Contacts1 contacts1) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(contacts1)) {
				contacts1 = (Contacts1)session.get(
					Contacts1Impl.class, contacts1.getPrimaryKeyObj());
			}

			if (contacts1 != null) {
				session.delete(contacts1);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (contacts1 != null) {
			clearCache(contacts1);
		}

		return contacts1;
	}

	@Override
	public Contacts1 updateImpl(Contacts1 contacts1) {
		boolean isNew = contacts1.isNew();

		if (!(contacts1 instanceof Contacts1ModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(contacts1.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(contacts1);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in contacts1 proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Contacts1 implementation " +
					contacts1.getClass());
		}

		Contacts1ModelImpl contacts1ModelImpl = (Contacts1ModelImpl)contacts1;

		if (Validator.isNull(contacts1.getUuid())) {
			String uuid = _portalUUID.generate();

			contacts1.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(contacts1);
			}
			else {
				contacts1 = (Contacts1)session.merge(contacts1);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			Contacts1Impl.class, contacts1ModelImpl, false, true);

		if (isNew) {
			contacts1.setNew(false);
		}

		contacts1.resetOriginalValues();

		return contacts1;
	}

	/**
	 * Returns the contacts1 with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the contacts1
	 * @return the contacts1
	 * @throws NoSuchContacts1Exception if a contacts1 with the primary key could not be found
	 */
	@Override
	public Contacts1 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchContacts1Exception {

		Contacts1 contacts1 = fetchByPrimaryKey(primaryKey);

		if (contacts1 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchContacts1Exception(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return contacts1;
	}

	/**
	 * Returns the contacts1 with the primary key or throws a <code>NoSuchContacts1Exception</code> if it could not be found.
	 *
	 * @param phoneId the primary key of the contacts1
	 * @return the contacts1
	 * @throws NoSuchContacts1Exception if a contacts1 with the primary key could not be found
	 */
	@Override
	public Contacts1 findByPrimaryKey(long phoneId)
		throws NoSuchContacts1Exception {

		return findByPrimaryKey((Serializable)phoneId);
	}

	/**
	 * Returns the contacts1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param phoneId the primary key of the contacts1
	 * @return the contacts1, or <code>null</code> if a contacts1 with the primary key could not be found
	 */
	@Override
	public Contacts1 fetchByPrimaryKey(long phoneId) {
		return fetchByPrimaryKey((Serializable)phoneId);
	}

	/**
	 * Returns all the contacts1s.
	 *
	 * @return the contacts1s
	 */
	@Override
	public List<Contacts1> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Contacts1> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Contacts1> findAll(
		int start, int end, OrderByComparator<Contacts1> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Contacts1> findAll(
		int start, int end, OrderByComparator<Contacts1> orderByComparator,
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

		List<Contacts1> list = null;

		if (useFinderCache) {
			list = (List<Contacts1>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CONTACTS1);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CONTACTS1;

				sql = sql.concat(Contacts1ModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Contacts1>)QueryUtil.list(
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
	 * Removes all the contacts1s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Contacts1 contacts1 : findAll()) {
			remove(contacts1);
		}
	}

	/**
	 * Returns the number of contacts1s.
	 *
	 * @return the number of contacts1s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_CONTACTS1);

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
		return "phoneId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CONTACTS1;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return Contacts1ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the contacts1 persistence.
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

		_setContacts1UtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setContacts1UtilPersistence(null);

		entityCache.removeCache(Contacts1Impl.class.getName());
	}

	private void _setContacts1UtilPersistence(
		Contacts1Persistence contacts1Persistence) {

		try {
			Field field = Contacts1Util.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, contacts1Persistence);
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

	private static final String _SQL_SELECT_CONTACTS1 =
		"SELECT contacts1 FROM Contacts1 contacts1";

	private static final String _SQL_SELECT_CONTACTS1_WHERE =
		"SELECT contacts1 FROM Contacts1 contacts1 WHERE ";

	private static final String _SQL_COUNT_CONTACTS1 =
		"SELECT COUNT(contacts1) FROM Contacts1 contacts1";

	private static final String _SQL_COUNT_CONTACTS1_WHERE =
		"SELECT COUNT(contacts1) FROM Contacts1 contacts1 WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "contacts1.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Contacts1 exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Contacts1 exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		Contacts1PersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PortalUUID _portalUUID;

}