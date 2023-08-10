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
 * Provides a wrapper for {@link Billing1LocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Billing1LocalService
 * @generated
 */
public class Billing1LocalServiceWrapper
	implements Billing1LocalService, ServiceWrapper<Billing1LocalService> {

	public Billing1LocalServiceWrapper() {
		this(null);
	}

	public Billing1LocalServiceWrapper(
		Billing1LocalService billing1LocalService) {

		_billing1LocalService = billing1LocalService;
	}

	/**
	 * Adds the billing1 to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Billing1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param billing1 the billing1
	 * @return the billing1 that was added
	 */
	@Override
	public Reg.service.model.Billing1 addBilling1(
		Reg.service.model.Billing1 billing1) {

		return _billing1LocalService.addBilling1(billing1);
	}

	@Override
	public Reg.service.model.Billing1 addBilling1(
		long userId, String address, String address2, String city, String state,
		String zip) {

		return _billing1LocalService.addBilling1(
			userId, address, address2, city, state, zip);
	}

	/**
	 * Creates a new billing1 with the primary key. Does not add the billing1 to the database.
	 *
	 * @param billingAddressId the primary key for the new billing1
	 * @return the new billing1
	 */
	@Override
	public Reg.service.model.Billing1 createBilling1(long billingAddressId) {
		return _billing1LocalService.createBilling1(billingAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _billing1LocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the billing1 from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Billing1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param billing1 the billing1
	 * @return the billing1 that was removed
	 */
	@Override
	public Reg.service.model.Billing1 deleteBilling1(
		Reg.service.model.Billing1 billing1) {

		return _billing1LocalService.deleteBilling1(billing1);
	}

	/**
	 * Deletes the billing1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Billing1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param billingAddressId the primary key of the billing1
	 * @return the billing1 that was removed
	 * @throws PortalException if a billing1 with the primary key could not be found
	 */
	@Override
	public Reg.service.model.Billing1 deleteBilling1(long billingAddressId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _billing1LocalService.deleteBilling1(billingAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _billing1LocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _billing1LocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _billing1LocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _billing1LocalService.dynamicQuery();
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

		return _billing1LocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Reg.service.model.impl.Billing1ModelImpl</code>.
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

		return _billing1LocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Reg.service.model.impl.Billing1ModelImpl</code>.
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

		return _billing1LocalService.dynamicQuery(
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

		return _billing1LocalService.dynamicQueryCount(dynamicQuery);
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

		return _billing1LocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public Reg.service.model.Billing1 fetchBilling1(long billingAddressId) {
		return _billing1LocalService.fetchBilling1(billingAddressId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _billing1LocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the billing1 with the primary key.
	 *
	 * @param billingAddressId the primary key of the billing1
	 * @return the billing1
	 * @throws PortalException if a billing1 with the primary key could not be found
	 */
	@Override
	public Reg.service.model.Billing1 getBilling1(long billingAddressId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _billing1LocalService.getBilling1(billingAddressId);
	}

	/**
	 * Returns a range of all the billing1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Reg.service.model.impl.Billing1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of billing1s
	 * @param end the upper bound of the range of billing1s (not inclusive)
	 * @return the range of billing1s
	 */
	@Override
	public java.util.List<Reg.service.model.Billing1> getBilling1s(
		int start, int end) {

		return _billing1LocalService.getBilling1s(start, end);
	}

	/**
	 * Returns the number of billing1s.
	 *
	 * @return the number of billing1s
	 */
	@Override
	public int getBilling1sCount() {
		return _billing1LocalService.getBilling1sCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _billing1LocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _billing1LocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _billing1LocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the billing1 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Billing1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param billing1 the billing1
	 * @return the billing1 that was updated
	 */
	@Override
	public Reg.service.model.Billing1 updateBilling1(
		Reg.service.model.Billing1 billing1) {

		return _billing1LocalService.updateBilling1(billing1);
	}

	@Override
	public Reg.service.model.Billing1 updateBilling1(
			long billingAddressId, String address, String address2, String city,
			String state, String zip)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _billing1LocalService.updateBilling1(
			billingAddressId, address, address2, city, state, zip);
	}

	@Override
	public Billing1LocalService getWrappedService() {
		return _billing1LocalService;
	}

	@Override
	public void setWrappedService(Billing1LocalService billing1LocalService) {
		_billing1LocalService = billing1LocalService;
	}

	private Billing1LocalService _billing1LocalService;

}