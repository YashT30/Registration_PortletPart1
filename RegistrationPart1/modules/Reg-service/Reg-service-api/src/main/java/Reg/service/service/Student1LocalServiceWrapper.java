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
 * Provides a wrapper for {@link Student1LocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Student1LocalService
 * @generated
 */
public class Student1LocalServiceWrapper
	implements ServiceWrapper<Student1LocalService>, Student1LocalService {

	public Student1LocalServiceWrapper() {
		this(null);
	}

	public Student1LocalServiceWrapper(
		Student1LocalService student1LocalService) {

		_student1LocalService = student1LocalService;
	}

	@Override
	public Reg.service.model.Student1 addStudent1(
		String firstName, String lastName, String emailAddress, String username,
		boolean male, int birthdayMonth, int birthdayDay, int birthdayYear,
		String password1, String password2, String securityQuestion,
		String securityAnswer, boolean acceptedTerms) {

		return _student1LocalService.addStudent1(
			firstName, lastName, emailAddress, username, male, birthdayMonth,
			birthdayDay, birthdayYear, password1, password2, securityQuestion,
			securityAnswer, acceptedTerms);
	}

	/**
	 * Adds the student1 to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Student1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param student1 the student1
	 * @return the student1 that was added
	 */
	@Override
	public Reg.service.model.Student1 addStudent1(
		Reg.service.model.Student1 student1) {

		return _student1LocalService.addStudent1(student1);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _student1LocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new student1 with the primary key. Does not add the student1 to the database.
	 *
	 * @param userId the primary key for the new student1
	 * @return the new student1
	 */
	@Override
	public Reg.service.model.Student1 createStudent1(long userId) {
		return _student1LocalService.createStudent1(userId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _student1LocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the student1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Student1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userId the primary key of the student1
	 * @return the student1 that was removed
	 * @throws PortalException if a student1 with the primary key could not be found
	 */
	@Override
	public Reg.service.model.Student1 deleteStudent1(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _student1LocalService.deleteStudent1(userId);
	}

	/**
	 * Deletes the student1 from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Student1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param student1 the student1
	 * @return the student1 that was removed
	 */
	@Override
	public Reg.service.model.Student1 deleteStudent1(
		Reg.service.model.Student1 student1) {

		return _student1LocalService.deleteStudent1(student1);
	}

	@Override
	public Reg.service.model.Student1 deleteUser(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _student1LocalService.deleteUser(userId);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _student1LocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _student1LocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _student1LocalService.dynamicQuery();
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

		return _student1LocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Reg.service.model.impl.Student1ModelImpl</code>.
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

		return _student1LocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Reg.service.model.impl.Student1ModelImpl</code>.
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

		return _student1LocalService.dynamicQuery(
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

		return _student1LocalService.dynamicQueryCount(dynamicQuery);
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

		return _student1LocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public Reg.service.model.Student1 fetchStudent1(long userId) {
		return _student1LocalService.fetchStudent1(userId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _student1LocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _student1LocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _student1LocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _student1LocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the student1 with the primary key.
	 *
	 * @param userId the primary key of the student1
	 * @return the student1
	 * @throws PortalException if a student1 with the primary key could not be found
	 */
	@Override
	public Reg.service.model.Student1 getStudent1(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _student1LocalService.getStudent1(userId);
	}

	/**
	 * Returns a range of all the student1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Reg.service.model.impl.Student1ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of student1s
	 * @param end the upper bound of the range of student1s (not inclusive)
	 * @return the range of student1s
	 */
	@Override
	public java.util.List<Reg.service.model.Student1> getStudent1s(
		int start, int end) {

		return _student1LocalService.getStudent1s(start, end);
	}

	/**
	 * Returns the number of student1s.
	 *
	 * @return the number of student1s
	 */
	@Override
	public int getStudent1sCount() {
		return _student1LocalService.getStudent1sCount();
	}

	/**
	 * Updates the student1 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect Student1LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param student1 the student1
	 * @return the student1 that was updated
	 */
	@Override
	public Reg.service.model.Student1 updateStudent1(
		Reg.service.model.Student1 student1) {

		return _student1LocalService.updateStudent1(student1);
	}

	@Override
	public Student1LocalService getWrappedService() {
		return _student1LocalService;
	}

	@Override
	public void setWrappedService(Student1LocalService student1LocalService) {
		_student1LocalService = student1LocalService;
	}

	private Student1LocalService _student1LocalService;

}