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
 * The table class for the &quot;Yash_Billing1&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Billing1
 * @generated
 */
public class Billing1Table extends BaseTable<Billing1Table> {

	public static final Billing1Table INSTANCE = new Billing1Table();

	public final Column<Billing1Table, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Billing1Table, Long> billingAddressId = createColumn(
		"billingAddressId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<Billing1Table, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<Billing1Table, String> address = createColumn(
		"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Billing1Table, String> address2 = createColumn(
		"address2", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Billing1Table, String> city = createColumn(
		"city", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Billing1Table, String> state = createColumn(
		"state_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Billing1Table, String> zip = createColumn(
		"zip", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private Billing1Table() {
		super("Yash_Billing1", Billing1Table::new);
	}

}