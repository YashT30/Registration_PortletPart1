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

import Reg.service.exception.NoSuchStudent1Exception;
import Reg.service.model.Student1;
import Reg.service.model.Student1Table;
import Reg.service.model.impl.Student1Impl;
import Reg.service.model.impl.Student1ModelImpl;
import Reg.service.service.persistence.Student1Persistence;
import Reg.service.service.persistence.Student1Util;
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
 * The persistence implementation for the student1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = Student1Persistence.class)
public class Student1PersistenceImpl
	extends BasePersistenceImpl<Student1> implements Student1Persistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>Student1Util</code> to access the student1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		Student1Impl.class.getName();

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
	 * Returns all the student1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching student1s
	 */
	@Override
	public List<Student1> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Student1> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Student1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Student1> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Student1> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Student1> orderByComparator, boolean useFinderCache) {

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

		List<Student1> list = null;

		if (useFinderCache) {
			list = (List<Student1>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Student1 student1 : list) {
					if (!uuid.equals(student1.getUuid())) {
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

			sb.append(_SQL_SELECT_STUDENT1_WHERE);

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
				sb.append(Student1ModelImpl.ORDER_BY_JPQL);
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

				list = (List<Student1>)QueryUtil.list(
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
	 * Returns the first student1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student1
	 * @throws NoSuchStudent1Exception if a matching student1 could not be found
	 */
	@Override
	public Student1 findByUuid_First(
			String uuid, OrderByComparator<Student1> orderByComparator)
		throws NoSuchStudent1Exception {

		Student1 student1 = fetchByUuid_First(uuid, orderByComparator);

		if (student1 != null) {
			return student1;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchStudent1Exception(sb.toString());
	}

	/**
	 * Returns the first student1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student1, or <code>null</code> if a matching student1 could not be found
	 */
	@Override
	public Student1 fetchByUuid_First(
		String uuid, OrderByComparator<Student1> orderByComparator) {

		List<Student1> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last student1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student1
	 * @throws NoSuchStudent1Exception if a matching student1 could not be found
	 */
	@Override
	public Student1 findByUuid_Last(
			String uuid, OrderByComparator<Student1> orderByComparator)
		throws NoSuchStudent1Exception {

		Student1 student1 = fetchByUuid_Last(uuid, orderByComparator);

		if (student1 != null) {
			return student1;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchStudent1Exception(sb.toString());
	}

	/**
	 * Returns the last student1 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student1, or <code>null</code> if a matching student1 could not be found
	 */
	@Override
	public Student1 fetchByUuid_Last(
		String uuid, OrderByComparator<Student1> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Student1> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Student1[] findByUuid_PrevAndNext(
			long userId, String uuid,
			OrderByComparator<Student1> orderByComparator)
		throws NoSuchStudent1Exception {

		uuid = Objects.toString(uuid, "");

		Student1 student1 = findByPrimaryKey(userId);

		Session session = null;

		try {
			session = openSession();

			Student1[] array = new Student1Impl[3];

			array[0] = getByUuid_PrevAndNext(
				session, student1, uuid, orderByComparator, true);

			array[1] = student1;

			array[2] = getByUuid_PrevAndNext(
				session, student1, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Student1 getByUuid_PrevAndNext(
		Session session, Student1 student1, String uuid,
		OrderByComparator<Student1> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_STUDENT1_WHERE);

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
			sb.append(Student1ModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(student1)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Student1> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the student1s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Student1 student1 :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(student1);
		}
	}

	/**
	 * Returns the number of student1s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching student1s
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_STUDENT1_WHERE);

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
		"student1.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(student1.uuid IS NULL OR student1.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByUsername;
	private FinderPath _finderPathWithoutPaginationFindByUsername;
	private FinderPath _finderPathCountByUsername;

	/**
	 * Returns all the student1s where username = &#63;.
	 *
	 * @param username the username
	 * @return the matching student1s
	 */
	@Override
	public List<Student1> findByUsername(String username) {
		return findByUsername(
			username, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Student1> findByUsername(String username, int start, int end) {
		return findByUsername(username, start, end, null);
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
	@Override
	public List<Student1> findByUsername(
		String username, int start, int end,
		OrderByComparator<Student1> orderByComparator) {

		return findByUsername(username, start, end, orderByComparator, true);
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
	@Override
	public List<Student1> findByUsername(
		String username, int start, int end,
		OrderByComparator<Student1> orderByComparator, boolean useFinderCache) {

		username = Objects.toString(username, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUsername;
				finderArgs = new Object[] {username};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUsername;
			finderArgs = new Object[] {username, start, end, orderByComparator};
		}

		List<Student1> list = null;

		if (useFinderCache) {
			list = (List<Student1>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Student1 student1 : list) {
					if (!username.equals(student1.getUsername())) {
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

			sb.append(_SQL_SELECT_STUDENT1_WHERE);

			boolean bindUsername = false;

			if (username.isEmpty()) {
				sb.append(_FINDER_COLUMN_USERNAME_USERNAME_3);
			}
			else {
				bindUsername = true;

				sb.append(_FINDER_COLUMN_USERNAME_USERNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(Student1ModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUsername) {
					queryPos.add(username);
				}

				list = (List<Student1>)QueryUtil.list(
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
	 * Returns the first student1 in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student1
	 * @throws NoSuchStudent1Exception if a matching student1 could not be found
	 */
	@Override
	public Student1 findByUsername_First(
			String username, OrderByComparator<Student1> orderByComparator)
		throws NoSuchStudent1Exception {

		Student1 student1 = fetchByUsername_First(username, orderByComparator);

		if (student1 != null) {
			return student1;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("username=");
		sb.append(username);

		sb.append("}");

		throw new NoSuchStudent1Exception(sb.toString());
	}

	/**
	 * Returns the first student1 in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student1, or <code>null</code> if a matching student1 could not be found
	 */
	@Override
	public Student1 fetchByUsername_First(
		String username, OrderByComparator<Student1> orderByComparator) {

		List<Student1> list = findByUsername(username, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last student1 in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student1
	 * @throws NoSuchStudent1Exception if a matching student1 could not be found
	 */
	@Override
	public Student1 findByUsername_Last(
			String username, OrderByComparator<Student1> orderByComparator)
		throws NoSuchStudent1Exception {

		Student1 student1 = fetchByUsername_Last(username, orderByComparator);

		if (student1 != null) {
			return student1;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("username=");
		sb.append(username);

		sb.append("}");

		throw new NoSuchStudent1Exception(sb.toString());
	}

	/**
	 * Returns the last student1 in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student1, or <code>null</code> if a matching student1 could not be found
	 */
	@Override
	public Student1 fetchByUsername_Last(
		String username, OrderByComparator<Student1> orderByComparator) {

		int count = countByUsername(username);

		if (count == 0) {
			return null;
		}

		List<Student1> list = findByUsername(
			username, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Student1[] findByUsername_PrevAndNext(
			long userId, String username,
			OrderByComparator<Student1> orderByComparator)
		throws NoSuchStudent1Exception {

		username = Objects.toString(username, "");

		Student1 student1 = findByPrimaryKey(userId);

		Session session = null;

		try {
			session = openSession();

			Student1[] array = new Student1Impl[3];

			array[0] = getByUsername_PrevAndNext(
				session, student1, username, orderByComparator, true);

			array[1] = student1;

			array[2] = getByUsername_PrevAndNext(
				session, student1, username, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Student1 getByUsername_PrevAndNext(
		Session session, Student1 student1, String username,
		OrderByComparator<Student1> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_STUDENT1_WHERE);

		boolean bindUsername = false;

		if (username.isEmpty()) {
			sb.append(_FINDER_COLUMN_USERNAME_USERNAME_3);
		}
		else {
			bindUsername = true;

			sb.append(_FINDER_COLUMN_USERNAME_USERNAME_2);
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
			sb.append(Student1ModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUsername) {
			queryPos.add(username);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(student1)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Student1> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the student1s where username = &#63; from the database.
	 *
	 * @param username the username
	 */
	@Override
	public void removeByUsername(String username) {
		for (Student1 student1 :
				findByUsername(
					username, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(student1);
		}
	}

	/**
	 * Returns the number of student1s where username = &#63;.
	 *
	 * @param username the username
	 * @return the number of matching student1s
	 */
	@Override
	public int countByUsername(String username) {
		username = Objects.toString(username, "");

		FinderPath finderPath = _finderPathCountByUsername;

		Object[] finderArgs = new Object[] {username};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_STUDENT1_WHERE);

			boolean bindUsername = false;

			if (username.isEmpty()) {
				sb.append(_FINDER_COLUMN_USERNAME_USERNAME_3);
			}
			else {
				bindUsername = true;

				sb.append(_FINDER_COLUMN_USERNAME_USERNAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUsername) {
					queryPos.add(username);
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

	private static final String _FINDER_COLUMN_USERNAME_USERNAME_2 =
		"student1.username = ?";

	private static final String _FINDER_COLUMN_USERNAME_USERNAME_3 =
		"(student1.username IS NULL OR student1.username = '')";

	public Student1PersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Student1.class);

		setModelImplClass(Student1Impl.class);
		setModelPKClass(long.class);

		setTable(Student1Table.INSTANCE);
	}

	/**
	 * Caches the student1 in the entity cache if it is enabled.
	 *
	 * @param student1 the student1
	 */
	@Override
	public void cacheResult(Student1 student1) {
		entityCache.putResult(
			Student1Impl.class, student1.getPrimaryKey(), student1);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the student1s in the entity cache if it is enabled.
	 *
	 * @param student1s the student1s
	 */
	@Override
	public void cacheResult(List<Student1> student1s) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (student1s.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Student1 student1 : student1s) {
			if (entityCache.getResult(
					Student1Impl.class, student1.getPrimaryKey()) == null) {

				cacheResult(student1);
			}
		}
	}

	/**
	 * Clears the cache for all student1s.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Student1Impl.class);

		finderCache.clearCache(Student1Impl.class);
	}

	/**
	 * Clears the cache for the student1.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Student1 student1) {
		entityCache.removeResult(Student1Impl.class, student1);
	}

	@Override
	public void clearCache(List<Student1> student1s) {
		for (Student1 student1 : student1s) {
			entityCache.removeResult(Student1Impl.class, student1);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(Student1Impl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(Student1Impl.class, primaryKey);
		}
	}

	/**
	 * Creates a new student1 with the primary key. Does not add the student1 to the database.
	 *
	 * @param userId the primary key for the new student1
	 * @return the new student1
	 */
	@Override
	public Student1 create(long userId) {
		Student1 student1 = new Student1Impl();

		student1.setNew(true);
		student1.setPrimaryKey(userId);

		String uuid = _portalUUID.generate();

		student1.setUuid(uuid);

		return student1;
	}

	/**
	 * Removes the student1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the student1
	 * @return the student1 that was removed
	 * @throws NoSuchStudent1Exception if a student1 with the primary key could not be found
	 */
	@Override
	public Student1 remove(long userId) throws NoSuchStudent1Exception {
		return remove((Serializable)userId);
	}

	/**
	 * Removes the student1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the student1
	 * @return the student1 that was removed
	 * @throws NoSuchStudent1Exception if a student1 with the primary key could not be found
	 */
	@Override
	public Student1 remove(Serializable primaryKey)
		throws NoSuchStudent1Exception {

		Session session = null;

		try {
			session = openSession();

			Student1 student1 = (Student1)session.get(
				Student1Impl.class, primaryKey);

			if (student1 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStudent1Exception(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(student1);
		}
		catch (NoSuchStudent1Exception noSuchEntityException) {
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
	protected Student1 removeImpl(Student1 student1) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(student1)) {
				student1 = (Student1)session.get(
					Student1Impl.class, student1.getPrimaryKeyObj());
			}

			if (student1 != null) {
				session.delete(student1);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (student1 != null) {
			clearCache(student1);
		}

		return student1;
	}

	@Override
	public Student1 updateImpl(Student1 student1) {
		boolean isNew = student1.isNew();

		if (!(student1 instanceof Student1ModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(student1.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(student1);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in student1 proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Student1 implementation " +
					student1.getClass());
		}

		Student1ModelImpl student1ModelImpl = (Student1ModelImpl)student1;

		if (Validator.isNull(student1.getUuid())) {
			String uuid = _portalUUID.generate();

			student1.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(student1);
			}
			else {
				student1 = (Student1)session.merge(student1);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			Student1Impl.class, student1ModelImpl, false, true);

		if (isNew) {
			student1.setNew(false);
		}

		student1.resetOriginalValues();

		return student1;
	}

	/**
	 * Returns the student1 with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the student1
	 * @return the student1
	 * @throws NoSuchStudent1Exception if a student1 with the primary key could not be found
	 */
	@Override
	public Student1 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStudent1Exception {

		Student1 student1 = fetchByPrimaryKey(primaryKey);

		if (student1 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStudent1Exception(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return student1;
	}

	/**
	 * Returns the student1 with the primary key or throws a <code>NoSuchStudent1Exception</code> if it could not be found.
	 *
	 * @param userId the primary key of the student1
	 * @return the student1
	 * @throws NoSuchStudent1Exception if a student1 with the primary key could not be found
	 */
	@Override
	public Student1 findByPrimaryKey(long userId)
		throws NoSuchStudent1Exception {

		return findByPrimaryKey((Serializable)userId);
	}

	/**
	 * Returns the student1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userId the primary key of the student1
	 * @return the student1, or <code>null</code> if a student1 with the primary key could not be found
	 */
	@Override
	public Student1 fetchByPrimaryKey(long userId) {
		return fetchByPrimaryKey((Serializable)userId);
	}

	/**
	 * Returns all the student1s.
	 *
	 * @return the student1s
	 */
	@Override
	public List<Student1> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Student1> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Student1> findAll(
		int start, int end, OrderByComparator<Student1> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Student1> findAll(
		int start, int end, OrderByComparator<Student1> orderByComparator,
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

		List<Student1> list = null;

		if (useFinderCache) {
			list = (List<Student1>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_STUDENT1);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_STUDENT1;

				sql = sql.concat(Student1ModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Student1>)QueryUtil.list(
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
	 * Removes all the student1s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Student1 student1 : findAll()) {
			remove(student1);
		}
	}

	/**
	 * Returns the number of student1s.
	 *
	 * @return the number of student1s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_STUDENT1);

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
		return "userId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_STUDENT1;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return Student1ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the student1 persistence.
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

		_finderPathWithPaginationFindByUsername = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUsername",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"username"}, true);

		_finderPathWithoutPaginationFindByUsername = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUsername",
			new String[] {String.class.getName()}, new String[] {"username"},
			true);

		_finderPathCountByUsername = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUsername",
			new String[] {String.class.getName()}, new String[] {"username"},
			false);

		_setStudent1UtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setStudent1UtilPersistence(null);

		entityCache.removeCache(Student1Impl.class.getName());
	}

	private void _setStudent1UtilPersistence(
		Student1Persistence student1Persistence) {

		try {
			Field field = Student1Util.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, student1Persistence);
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

	private static final String _SQL_SELECT_STUDENT1 =
		"SELECT student1 FROM Student1 student1";

	private static final String _SQL_SELECT_STUDENT1_WHERE =
		"SELECT student1 FROM Student1 student1 WHERE ";

	private static final String _SQL_COUNT_STUDENT1 =
		"SELECT COUNT(student1) FROM Student1 student1";

	private static final String _SQL_COUNT_STUDENT1_WHERE =
		"SELECT COUNT(student1) FROM Student1 student1 WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "student1.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Student1 exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Student1 exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		Student1PersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PortalUUID _portalUUID;

}