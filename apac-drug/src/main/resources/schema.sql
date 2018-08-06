
DROP TABLE IF EXISTS CRM;

CREATE TABLE CRM (
	drugSKUNo	varchar(100) not null,
	orderID     varchar(100) not null,
	ID          varchar(100) not null,
	firstName   varchar(100) not null,
	lastName    varchar(100) not null,
	phone       varchar(100) not null,
	zipcode     varchar(100) not null,
	email       varchar(100) ,
	city        varchar(100) ,
	country     varchar(100)    
);


INSERT INTO CRM (drugSKUNo,orderID,ID,firstName,lastName,phone,zipcode,email,city,country) VALUES ('DR1000','0011','1111111','Christina','LLLL','23456789','09876','abc@com','Singapore','Singapore');
INSERT INTO CRM (drugSKUNo,orderID,ID,firstName,lastName,phone,zipcode,email,city,country) VALUES ('DR2000','0013','6757667','Vishal','GGGGGG','6543456','04569','def@com','Singapore','Singapore');     
INSERT INTO CRM (drugSKUNo,orderID,ID,firstName,lastName,phone,zipcode,email,city,country) VALUES ('DR4000','0014','3423433','Tom','AAAA','8754564','03457','htg@com','Singapore','Singapore');     
