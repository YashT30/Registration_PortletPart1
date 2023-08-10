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

package Reg.service.service.impl;

import Reg.service.model.Contacts1;
import Reg.service.service.base.Contacts1LocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=Reg.service.model.Contacts1",
	service = AopService.class
)
public class Contacts1LocalServiceImpl extends Contacts1LocalServiceBaseImpl {
public Contacts1 addContacts1(long userId , String homePhone, String mobilePhone) {
		
		long phoneId = counterLocalService.increment(Contacts1.class.getName());
		
		Contacts1 contacts1 = createContacts1(phoneId);
		contacts1.setUserId(userId);
		contacts1.setHomePhone(homePhone);
		contacts1.setMobilePhone(mobilePhone);
		return addContacts1(contacts1);
		
		
	}
	public Contacts1 updateContacts1(long phoneId, String homePhone, String mobilePhone) throws PortalException {
		Contacts1 contacts1 = getContacts1(phoneId);
		contacts1.setHomePhone(homePhone);
		contacts1.setMobilePhone(mobilePhone);
		return updateContacts1(contacts1);
	}
	public Contacts1 deletePhone(long phoneId) throws PortalException {
		Contacts1 contacts1 = getContacts1(phoneId);
		return deleteContacts1(contacts1);
	}
}
	
