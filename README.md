# -honest-trees-8857

Tables in SQl----------------------------------->


Engineer Table---->

create table engineer(
engId int primary key auto_increment,
name varchar(15) not null,
department varchar(10) not null,
email varchar(15) not null unique,
password varchar(10) not null
);


Problem Table---->

create table problem(
problemId int primary key auto_increment,
type varchar(10) not null,
description varchar(150) not null,
status varchar(10) default 'pending',
date date not null
);

Engineer Problem Table--->

create table engineer_problem(
engId int not null,
problemId int not null,
foreign key(engId) references engineer(engId),
foreign key(problemId) references problem(problemId)
);

Employee Table--->

create table employee(
empId int primary key auto_increment,
empName varchar(15) not null,
username varchar(15) not null unique,
password varchar(15) not null
);
