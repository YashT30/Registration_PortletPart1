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
 * The table class for the &quot;Yash_Student1&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Student1
 * @generated
 */
public class Student1Table extends BaseTable<Student1Table> {

	public static final Student1Table INSTANCE = new Student1Table();

	public final Column<Student1Table, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Student1Table, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<Student1Table, String> firstName = createColumn(
		"firstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Student1Table, String> lastName = createColumn(
		"lastName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Student1Table, String> emailAddress = createColumn(
		"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Student1Table, String> username = createColumn(
		"username", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Student1Table, Boolean> male = createColumn(
		"male", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<Student1Table, Integer> birthdayMonth = createColumn(
		"birthdayMonth", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<Student1Table, Integer> birthdayDay = createColumn(
		"birthdayDay", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<Student1Table, Integer> birthdayYear = createColumn(
		"birthdayYear", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<Student1Table, String> password1 = createColumn(
		"password1", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Student1Table, String> password2 = createColumn(
		"password2", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Student1Table, String> securityQuestion = createColumn(
		"securityQuestion", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Student1Table, String> securityAnswer = createColumn(
		"securityAnswer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<Student1Table, Boolean> acceptedTermsOfUse =
		createColumn(
			"acceptedTermsOfUse", Boolean.class, Types.BOOLEAN,
			Column.FLAG_DEFAULT);

	private Student1Table() {
		super("Yash_Student1", Student1Table::new);
	}

}