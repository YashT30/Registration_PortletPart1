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

package Reg.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Contacts1LocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Contacts1LocalService
 * @generated
 */
public class Contacts1LocalServiceWrapper
	implements Contacts1LocalService, ServiceWrapper<Contacts1LocalService> {

	public Contacts1LocalServiceWrapper() {
		this(null);
	}

	public Contacts1LocalServiceWrapper(
		Contacts1LocalService contacts1LocalService) {

		_contacts1LocalService = contacts1LocalService;
	}

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
	@Override
	public Reg.service.model.Contacts1 addContacts1(
		Reg.service.model.Contacts1 contacts1) {

		return _contacts1LocalService.addContacts1(contacts1);
	}

	@Override
	public Reg.service.model.Contacts1 addContacts1(
		long userId, String homePhone, String mobilePhone) {

		return _contacts1LocalService.addContacts1(
			userId, homePhone, mobilePhone);
	}

	/**
	 * Creates a new contacts1 with the primary key. Does not add the contacts1 to the database.
	 *
	 * @param phoneId the primary key for the new contacts1
	 * @return the new contacts1
	 */
	@Override
	public Reg.service.model.Contacts1 createContacts1(long phoneId) {
		return _contacts1LocalService.createContacts1(phoneId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contacts1LocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public Reg.service.model.Contacts1 deleteContacts1(
		Reg.service.model.Contacts1 contacts1) {

		return _contacts1LocalService.deleteContacts1(contacts1);
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
	@Override
	public Reg.service.model.Contacts1 deleteContacts1(long phoneId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contacts1LocalService.deleteContacts1(phoneId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contacts1LocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public Reg.service.model.Contacts1 deletePhone(long phoneId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contacts1LocalService.deletePhone(phoneId);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _contacts1LocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _contacts1LocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _contacts1LocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _contacts1LocalService.dynamicQuery(dynamicQuery);
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
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _contacts1LocalService.dynamicQuery(dynamicQuery, start, end);
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
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _contacts1LocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _contacts1LocalService.dynamicQueryCount(dynamicQuery);
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
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _contacts1LocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public Reg.service.model.Contacts1 fetchContacts1(long phoneId) {
		return _contacts1LocalService.fetchContacts1(phoneId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _contacts1LocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the contacts1 with the primary key.
	 *
	 * @param phoneId the primary key of the contacts1
	 * @return the contacts1
	 * @throws PortalException if a contacts1 with the primary key could not be found
	 */
	@Override
	public Reg.service.model.Contacts1 getContacts1(long phoneId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contacts1LocalService.getContacts1(phoneId);
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
	public java.util.List<Reg.service.model.Contacts1> getContacts1s(
		int start, int end) {

		return _contacts1LocalService.getContacts1s(start, end);
	}

	/**
	 * Returns the number of contacts1s.
	 *
	 * @return the number of contacts1s
	 */
	@Override
	public int getContacts1sCount() {
		return _contacts1LocalService.getContacts1sCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _contacts1LocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _contacts1LocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contacts1LocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public Reg.service.model.Contacts1 updateContacts1(
		Reg.service.model.Contacts1 contacts1) {

		return _contacts1LocalService.updateContacts1(contacts1);
	}

	@Override
	public Reg.service.model.Contacts1 updateContacts1(
			long phoneId, String homePhone, String mobilePhone)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contacts1LocalService.updateContacts1(
			phoneId, homePhone, mobilePhone);
	}

	@Override
	public Contacts1LocalService getWrappedService() {
		return _contacts1LocalService;
	}

	@Override
	public void setWrappedService(Contacts1LocalService contacts1LocalService) {
		_contacts1LocalService = contacts1LocalService;
	}

	private Contacts1LocalService _contacts1LocalService;

}