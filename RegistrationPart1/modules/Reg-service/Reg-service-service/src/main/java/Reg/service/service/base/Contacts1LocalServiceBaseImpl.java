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

package Reg.service.service.base;

import Reg.service.model.Contacts1;
import Reg.service.service.Contacts1LocalService;
import Reg.service.service.Contacts1LocalServiceUtil;
import Reg.service.service.persistence.Billing1Persistence;
import Reg.service.service.persistence.Contacts1Persistence;
import Reg.service.service.persistence.Student1Persistence;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the contacts1 local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link Reg.service.service.impl.Contacts1LocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Reg.service.service.impl.Contacts1LocalServiceImpl
 * @generated
 */
public abstract class Contacts1LocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, Contacts1LocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>Contacts1LocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>Contacts1LocalServiceUtil</code>.
	 */

	/**
	 * Adds the contacts1 to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Contacts1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contacts1 the contacts1
	 * @return the contacts1 that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Contacts1 addContacts1(Contacts1 contacts1) {
		contacts1.setNew(true);

		return contacts1Persistence.update(contacts1);
	}

	/**
	 * Creates a new contacts1 with the primary key. Does not add the contacts1 to the database.
	 *
	 * @param phoneId the primary key for the new contacts1
	 * @return the new contacts1
	 */
	@Override
	@Transactional(enabled = false)
	public Contacts1 createContacts1(long phoneId) {
		return contacts1Persistence.create(phoneId);
	}

	/**
	 * Deletes the contacts1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Contacts1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param phoneId the primary key of the contacts1
	 * @return the contacts1 that was removed
	 * @throws PortalException if a contacts1 with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Contacts1 deleteContacts1(long phoneId) throws PortalException {
		return contacts1Persistence.remove(phoneId);
	}

	/**
	 * Deletes the contacts1 from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Contacts1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contacts1 the contacts1
	 * @return the contacts1 that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Contacts1 deleteContacts1(Contacts1 contacts1) {
		return contacts1Persistence.remove(contacts1);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return contacts1Persistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Contacts1.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return contacts1Persistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Reg.service.model.impl.Contacts1ModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return contacts1Persistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Reg.service.model.impl.Contacts1ModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return contacts1Persistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return contacts1Persistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return contacts1Persistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public Contacts1 fetchContacts1(long phoneId) {
		return contacts1Persistence.fetchByPrimaryKey(phoneId);
	}

	/**
	 * Returns the contacts1 with the primary key.
	 *
	 * @param phoneId the primary key of the contacts1
	 * @return the contacts1
	 * @throws PortalException if a contacts1 with the primary key could not be found
	 */
	@Override
	public Contacts1 getContacts1(long phoneId) throws PortalException {
		return contacts1Persistence.findByPrimaryKey(phoneId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(contacts1LocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Contacts1.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("phoneId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			contacts1LocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Contacts1.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("phoneId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(contacts1LocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Contacts1.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("phoneId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return contacts1Persistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		if (_log.isWarnEnabled()) {
			_log.warn(
				"Implement Contacts1LocalServiceImpl#deleteContacts1(Contacts1) to avoid orphaned data");
		}

		return contacts1LocalService.deleteContacts1((Contacts1)persistedModel);
	}

	@Override
	public BasePersistence<Contacts1> getBasePersistence() {
		return contacts1Persistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return contacts1Persistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the contacts1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Reg.service.model.impl.Contacts1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contacts1s
	 * @param end the upper bound of the range of contacts1s (not inclusive)
	 * @return the range of contacts1s
	 */
	@Override
	public List<Contacts1> getContacts1s(int start, int end) {
		return contacts1Persistence.findAll(start, end);
	}

	/**
	 * Returns the number of contacts1s.
	 *
	 * @return the number of contacts1s
	 */
	@Override
	public int getContacts1sCount() {
		return contacts1Persistence.countAll();
	}

	/**
	 * Updates the contacts1 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Contacts1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contacts1 the contacts1
	 * @return the contacts1 that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Contacts1 updateContacts1(Contacts1 contacts1) {
		return contacts1Persistence.update(contacts1);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			Contacts1LocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		contacts1LocalService = (Contacts1LocalService)aopProxy;

		_setLocalServiceUtilService(contacts1LocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return Contacts1LocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Contacts1.class;
	}

	protected String getModelClassName() {
		return Contacts1.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = contacts1Persistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setLocalServiceUtilService(
		Contacts1LocalService contacts1LocalService) {

		try {
			Field field = Contacts1LocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, contacts1LocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected Billing1Persistence billing1Persistence;

	protected Contacts1LocalService contacts1LocalService;

	@Reference
	protected Contacts1Persistence contacts1Persistence;

	@Reference
	protected Student1Persistence student1Persistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	private static final Log _log = LogFactoryUtil.getLog(
		Contacts1LocalServiceBaseImpl.class);

}