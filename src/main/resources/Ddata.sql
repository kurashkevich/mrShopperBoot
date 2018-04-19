/*ID, DESCR, name, unit, */
insert into DETAIL values (1, 'operation system', 'android', 'android/ios');
insert into DETAIL values (2, 'operation system', 'ios', 'android/ios');
insert into DETAIL values (3, 'screen resolution', '1920/1080', 'пикселей');
insert into DETAIL values (4, 'screen size', '5', 'дюймов');
insert into DETAIL values (5, 'screen technology', 'LED', '');
insert into DETAIL values (6, 'ROM', '8', 'gb');
insert into DETAIL values (7, 'RAM', '32', 'gb');
insert into DETAIL values (8, 'Back Camera', '10', 'px');
insert into DETAIL values (9, 'Front Camera', '6', 'px');
insert into DETAIL values (10, 'material', 'steel', '');
insert into DETAIL values (11, 'body color', 'black', '');
insert into DETAIL values (12, 'width', '4', '"');
insert into DETAIL values (13, 'height', '6', '"');
insert into DETAIL values (14, 'weight', '150', '');
insert into DETAIL values (15, 'batary', '3000', 'MAH');





insert into CATEGORY values (1, 'mobile phones');
insert into CATEGORY values (2, 'TVs');



insert into CATEGORY_DETAIL VALUES (1, 1);
insert into CATEGORY_DETAIL VALUES (1, 2);
insert into CATEGORY_DETAIL VALUES (1, 3);
insert into CATEGORY_DETAIL VALUES (1, 4);
insert into CATEGORY_DETAIL VALUES (1, 5);
insert into CATEGORY_DETAIL VALUES (1, 6);
insert into CATEGORY_DETAIL VALUES (1, 7);
insert into CATEGORY_DETAIL VALUES (1, 8);
insert into CATEGORY_DETAIL VALUES (1, 9);
insert into CATEGORY_DETAIL VALUES (1, 10);
insert into CATEGORY_DETAIL VALUES (1, 11);
insert into CATEGORY_DETAIL VALUES (1, 12);
insert into CATEGORY_DETAIL VALUES (1, 13);
insert into CATEGORY_DETAIL VALUES (1, 14);
insert into CATEGORY_DETAIL VALUES (1, 15);





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
insert into Product values (1, 100, '2017-06-15','NOKIA', 1200, 1, 1);
insert into Product values (2, 150, '2016-05-12','Apple', 1470, 1, 2);
insert into Product values (3, 90, '2015-12-11','Samsung', 720, 1, 3);
insert into Product values (4, 73, '2018-11-09','Xiomi', 350, 1, 3);
insert into Product values (5, 268, '2013-07-06','Motorolla', 300, 1, 1);
insert into Product values (6, 244, '2014-03-02','Apple', 1450, 1, 1);
insert into Product values (7, 156, '2016-06-01','Apple', 1600, 1, 1);
insert into Product values (8, 33, '2015-09-03','LG', 600, 1, 1);
insert into Product values (9, 12, '2011-11-19','huaway', 560, 1, 1);
insert into Product values (10, 198, '2013-08-21','NOKIA', 900, 1, 1);
insert into Product values (11, 211, '2015-01-28','Meizu', 800, 1, 1);
insert into Product values (12, 66, '2017-06-27','Alcatel', 430, 1, 1);


commit;