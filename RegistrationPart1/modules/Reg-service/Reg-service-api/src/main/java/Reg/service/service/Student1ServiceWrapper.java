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
 * Provides a wrapper for {@link Student1Service}.
 *
 * @author Brian Wing Shun Chan
 * @see Student1Service
 * @generated
 */
public class Student1ServiceWrapper
	implements ServiceWrapper<Student1Service>, Student1Service {

	public Student1ServiceWrapper() {
		this(null);
	}

	public Student1ServiceWrapper(Student1Service student1Service) {
		_student1Service = student1Service;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _student1Service.getOSGiServiceIdentifier();
	}

	@Override
	public Student1Service getWrappedService() {
		return _student1Service;
	}

	@Override
	public void setWrappedService(Student1Service student1Service) {
		_student1Service = student1Service;
	}

	private Student1Service _student1Service;

}