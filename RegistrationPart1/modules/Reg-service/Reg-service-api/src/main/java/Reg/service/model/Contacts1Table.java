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

package Reg.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;Yash_Contacts1&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Contacts1
 * @generated
 */
public class Contacts1Table extends BaseTable<Contacts1Table> {

	public static final Contacts1Table INSTANCE = new Contacts1Table();

	public final Column<Contacts1Table, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Contacts1Table, Long> phoneId = createColumn(
		"phoneId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<Contacts1Table, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<Contacts1Table, String> homePhone = createColumn(
		"homePhone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Contacts1Table, String> mobilePhone = createColumn(
		"mobilePhone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private Contacts1Table() {
		super("Yash_Contacts1", Contacts1Table::new);
	}

}