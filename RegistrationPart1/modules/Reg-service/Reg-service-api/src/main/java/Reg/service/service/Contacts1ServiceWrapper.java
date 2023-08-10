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
 * Provides a wrapper for {@link Contacts1Service}.
 *
 * @author Brian Wing Shun Chan
 * @see Contacts1Service
 * @generated
 */
public class Contacts1ServiceWrapper
	implements Contacts1Service, ServiceWrapper<Contacts1Service> {

	public Contacts1ServiceWrapper() {
		this(null);
	}

	public Contacts1ServiceWrapper(Contacts1Service contacts1Service) {
		_contacts1Service = contacts1Service;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _contacts1Service.getOSGiServiceIdentifier();
	}

	@Override
	public Contacts1Service getWrappedService() {
		return _contacts1Service;
	}

	@Override
	public void setWrappedService(Contacts1Service contacts1Service) {
		_contacts1Service = contacts1Service;
	}

	private Contacts1Service _contacts1Service;

}