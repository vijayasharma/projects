create schema caster;
use caster;


drop table authorities;
drop table users;

CREATE TABLE USERS (
USERNAME VARCHAR(150) NOT NULL,
PASSWORD VARCHAR(32) NOT NULL,
ENABLED SMALLINT,
PRIMARY KEY (USERNAME)
);

CREATE TABLE authorities (
USERNAME VARCHAR(150) NOT NULL,
AUTHORITY VARCHAR(10) NOT NULL,
FOREIGN KEY (USERNAME) REFERENCES USERS(USERNAME) 
);

DROP TABLE CASTER_ENUMS;

CREATE TABLE CASTER_ENUMS (
	ENUM_ID INT NOT NULL PRIMARY KEY,
    ENUM_GROUP VARCHAR(150) NOT NULL,
    ENUM_VALUE VARCHAR(200)
);

insert into caster_enums values (1,'MARITAL_STATUS','Never Married');
insert into caster_enums values (2,'MARITAL_STATUS','Divorsed');
insert into caster_enums values (3,'MARITAL_STATUS','Awaiting Divrose');
insert into caster_enums values (10,'HEIGHT','4ft 5in');
insert into caster_enums values (11,'HEIGHT','4ft 6in');
insert into caster_enums values (12,'HEIGHT','4ft 7in');
insert into caster_enums values (13,'HEIGHT','4ft 8in');
insert into caster_enums values (14,'HEIGHT','4ft 9in');
insert into caster_enums values (15,'HEIGHT','4ft 10in');
insert into caster_enums values (16,'HEIGHT','4ft 11in');
insert into caster_enums values (17,'HEIGHT','4ft 12in');
insert into caster_enums values (18,'HEIGHT','5ft');
insert into caster_enums values (19,'HEIGHT','5ft 1in');
insert into caster_enums values (20,'HEIGHT','5ft 2in');
insert into caster_enums values (21,'HEIGHT','5ft 3in');
insert into caster_enums values (22,'HEIGHT','5ft 4in');
insert into caster_enums values (23,'HEIGHT','5ft 5in');
insert into caster_enums values (24,'HEIGHT','5ft 6in');
insert into caster_enums values (25,'HEIGHT','5ft 7in');
insert into caster_enums values (26,'HEIGHT','5ft 8in');
insert into caster_enums values (27,'HEIGHT','5ft 9in');
insert into caster_enums values (28,'HEIGHT','5ft 10in');
insert into caster_enums values (29,'HEIGHT','5ft 11in');
insert into caster_enums values (30,'HEIGHT','5ft 12in');
insert into caster_enums values (31,'HEIGHT','6ft');
insert into caster_enums values (32,'HEIGHT','6ft 1in');
insert into caster_enums values (33,'HEIGHT','6ft 2in');
insert into caster_enums values (34,'HEIGHT','6ft 3in');
insert into caster_enums values (35,'HEIGHT','6ft 4in');
insert into caster_enums values (36,'HEIGHT','6ft 5in');
insert into caster_enums values (37,'HEIGHT','6ft 6in');
insert into caster_enums values (50,'BODY_TYPE','Slim');
insert into caster_enums values (51,'BODY_TYPE','Average');
insert into caster_enums values (52,'BODY_TYPE','Athletic');
insert into caster_enums values (53,'BODY_TYPE','Heavy');

insert into caster_enums values (61,'SKIN_TONE','Very Fair');
insert into caster_enums values (62,'SKIN_TONE','Fair');
insert into caster_enums values (63,'SKIN_TONE','Wheatish');
insert into caster_enums values (64,'SKIN_TONE','Dark');


insert into caster_enums values (71,'BLOOD_GROUP','-- Don\'t know --');
insert into caster_enums values (72,'BLOOD_GROUP','A+');
insert into caster_enums values (73,'BLOOD_GROUP','A-');
insert into caster_enums values (74,'BLOOD_GROUP','B+');
insert into caster_enums values (75,'BLOOD_GROUP','B-');
insert into caster_enums values (76,'BLOOD_GROUP','AB+');
insert into caster_enums values (77,'BLOOD_GROUP','AB-');
insert into caster_enums values (78,'BLOOD_GROUP','O+');
insert into caster_enums values (79,'BLOOD_GROUP','O-');

insert into caster_enums values (91,'RELIGION','Hindu');
insert into caster_enums values (92,'RELIGION','Muslim');
insert into caster_enums values (93,'RELIGION','Christian');
insert into caster_enums values (94,'RELIGION','Sikh');
insert into caster_enums values (95,'RELIGION','Parsi');
insert into caster_enums values (96,'RELIGION','Jain');
insert into caster_enums values (97,'RELIGION','Buddhist');
insert into caster_enums values (98,'RELIGION','Jewish');
insert into caster_enums values (99,'RELIGION','No Religion');
insert into caster_enums values (100,'RELIGION','Spiritual');
insert into caster_enums values (101,'RELIGION','Other');

INSERT INTO USERS (USERNAME, PASSWORD, ENABLED) VALUES (?,?,?);
insert into users(username, password,enabled) values('bharat','pass',1);
insert into authorities(username,authority) values('bharat','ROLE_ADMIN');
insert into authorities(username,authority) values('bharat','ROLE_USER');

delete from authorities where username != 'a';

DROP TABLE PROFILES;

create table PROFILES(
	PROFILE_ID INT PRIMARY KEY AUTO_INCREMENT,
    FIRST_NAME VARCHAR(100),
    MIDDLE_NAME VARCHAR(100),
    LAST_NAME VARCHAR(100),
    DATE_OF_BIRTH DATETIME,
    GENDER VARCHAR(6),
    MARITAL_STATUS VARCHAR(20),
    EMAIL VARCHAR(150),
    HEIGHT VARCHAR(10),
    BODY_TYPE VARCHAR(20),
    WEIGHT VARCHAR(10),
    HEALTH_INFORMATION VARCHAR(200),
    SKIN_TONE VARCHAR(20),
    DISABILITY VARCHAR(20),
    BLOOD_GROUP VARCHAR(10),
    RELIGION VARCHAR(150),
    MOTHER_TONGUE VARCHAR(150),
    COMMUNITY VARCHAR(150),
    SUB_COMMUNITY VARCHAR(150),
    GOTRA VARCHAR(150),
    PHONE VARCHAR(10),
    ALTERNATE_PHONE VARCHAR(10),
    -- AUDIT FIELDS
    IS_DELETED VARCHAR(1),
    CREATED_DATE DATETIME,
    UPDATED_DATE DATETIME
);

insert into users(username, password,enabled) values('ibharatsharma@gmail.com','1234',1);
insert into authorities(username,authority) values('ibharatsharma@gmail.com','ROLE_ADMIN');
insert into authorities(username,authority) values('ibharatsharma@gmail.com','ROLE_USER');

select * from users;
select * from authorities;
select * from PROFILES;
select * from CASTER_ENUMS order by enum_id, enum_group;
select enum_id, enum_group, enum_value from caster_enums where enum_group='HEIGHT' order by enum_id, enum_group