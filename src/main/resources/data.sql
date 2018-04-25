/*ID, DESCR, name, unit, */
insert into DETAIL values (1, 'very good iphone', 'iphone 8', 'ios', '8', '32', '5.5');
insert into DETAIL values (2, 'very good android', 'galaxy s8', 'android', '16', '64', '6"');
insert into DETAIL values (3, 'very good android', 'mi6', 'android', '16', '128', '4.5');
insert into DETAIL values (4, 'very good android', 'p8', 'android', '4', '32', '5.3');
insert into DETAIL values (5, 'very good iphone', 'iphone 5s', 'ios', '8', '16', '5');
insert into DETAIL values (6, 'very good iphone', null, 'ios', '8', '16', '5');
insert into DETAIL values (7, 'very good iphone', null, 'ios', '8', '16', '5');


/*
ID_PRODUCT  	COUNT  	DEVELOPED_DATE  	MANUFACTURER  	PRICE  	ID_CATEGORY  	ID_ORDER
*/
--insert into Product values (1, 123, '2017-06-15','NOKIA', 1200, 1, 1);



insert into USER_ROLE values (1, 'admin');
insert into USER_ROLE values (2, 'user');


/*Порядок колонок в H2 неправильный, для USER - id, email, first_name, last_name, login, password, user_role_id*/
insert into USER values (1, 'v.kurashkevich@mrshopper.by','Влад','Курашкевич', 'v.kur', '123', 1);
insert into USER values (2, 'vano66@mail.ru', 'Иван', 'Потребительский', 'ivan66', 'qwd',  2);
insert into USER values (3, 'sanek@yandex.ru', 'Александр', 'Иванов', 'sanek', '123', 2);




INSERT INTO "order" VALUES (1, 1200.00, 1);
INSERT INTO "order" VALUES (2, 1600, 2);
INSERT INTO "order" VALUES (3, 1800, 3);


/*
ID_PRODUCT  	COUNT  	DEVELOPED_DATE  	MANUFACTURER  	PRICE  	ID_CATEGORY  	ID_ORDER
*/
insert into Product values (1, 100, '2017-06-15','Apple', 1200, 1, 1);
insert into Product values (2, 150, '2016-05-12','Samsung', 1470, 2, 2);
insert into Product values (3, 90, '2015-12-11','Xiomi', 720, 3, 3);
insert into Product values (4, 73, '2018-11-09','Huaway', 350, 4, 3);
insert into Product values (5, 268, '2013-07-06','Apple', 900, 5, 1);
insert into Product values (6, 268, null,'Apple', null, 6, 1);
insert into Product values (7, 268, '2013-07-06','Samsung', 900, 7, 1);
/*insert into Product values (6, 244, '2014-03-02','Apple', 1450, 1, 1);
insert into Product values (7, 156, '2016-06-01','Apple', 1600, 1, 1);
insert into Product values (8, 33, '2015-09-03','LG', 600, 1, 1);
insert into Product values (9, 12, '2011-11-19','huaway', 560, 1, 1);
insert into Product values (10, 198, '2013-08-21','NOKIA', 900, 1, 1);
insert into Product values (11, 211, '2015-01-28','Meizu', 800, 1, 1);
insert into Product values (12, 66, '2017-06-27','Alcatel', 430, 1, 1);
*/

commit;