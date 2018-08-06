
DROP TABLE IF EXISTS PRICING;

CREATE TABLE PRICING (
	drugSKUNo		varchar(100) not null,
	drugClass       varchar(100) not null,
	drugName        varchar(100) not null,
	drugDescription varchar(100) not null,
	drugUnitPrice   integer, 
	drugVolumePrice integer
);


INSERT INTO PRICING (drugSKUNo,drugClass,drugName,drugDescription,drugUnitPrice,drugVolumePrice) VALUES ('DR1000','AA','DRUG1','DRUG1 Desc',3,100);
INSERT INTO PRICING (drugSKUNo,drugClass,drugName,drugDescription,drugUnitPrice,drugVolumePrice) VALUES ('DR3000','AA','DRUG2','DRUG2 Desc',5,150);
INSERT INTO PRICING (drugSKUNo,drugClass,drugName,drugDescription,drugUnitPrice,drugVolumePrice) VALUES ('DR4000','AB','DRUG3','DRUG3 Desc',7,200);