create table Yash_Billing1 (
	uuid_ VARCHAR(75) null,
	billingAddressId LONG not null primary key,
	userId LONG,
	address VARCHAR(75) null,
	address2 VARCHAR(75) null,
	city VARCHAR(75) null,
	state_ VARCHAR(75) null,
	zip VARCHAR(75) null
);

create table Yash_Contacts1 (
	uuid_ VARCHAR(75) null,
	phoneId LONG not null primary key,
	userId LONG,
	homePhone VARCHAR(75) null,
	mobilePhone VARCHAR(75) null
);

create table Yash_Student1 (
	uuid_ VARCHAR(75) null,
	userId LONG not null primary key,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	username VARCHAR(75) null,
	male BOOLEAN,
	birthdayMonth INTEGER,
	birthdayDay INTEGER,
	birthdayYear INTEGER,
	password1 VARCHAR(75) null,
	password2 VARCHAR(75) null,
	securityQuestion VARCHAR(75) null,
	securityAnswer VARCHAR(75) null,
	acceptedTermsOfUse BOOLEAN
);