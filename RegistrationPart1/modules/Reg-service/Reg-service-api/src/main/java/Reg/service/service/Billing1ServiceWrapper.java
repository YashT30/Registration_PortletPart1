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
 * Provides a wrapper for {@link Billing1Service}.
 *
 * @author Brian Wing Shun Chan
 * @see Billing1Service
 * @generated
 */
public class Billing1ServiceWrapper
	implements Billing1Service, ServiceWrapper<Billing1Service> {

	public Billing1ServiceWrapper() {
		this(null);
	}

	public Billing1ServiceWrapper(Billing1Service billing1Service) {
		_billing1Service = billing1Service;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _billing1Service.getOSGiServiceIdentifier();
	}

	@Override
	public Billing1Service getWrappedService() {
		return _billing1Service;
	}

	@Override
	public void setWrappedService(Billing1Service billing1Service) {
		_billing1Service = billing1Service;
	}

	private Billing1Service _billing1Service;

}