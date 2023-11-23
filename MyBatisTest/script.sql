-- MyBatisTest > script.sql

CREATE TABLE tblMyBatis (
	seq NUMBER PRIMARY KEY,
	name varchar2(50) NOT NULL,
	age NUMBER NOT NULL,
	address varchar2(100) NOT NULL,
	gender char(1) NOT null
);

CREATE SEQUENCE seqMyBatis;

SELECT * FROM tblMyBatis;

INSERT INTO tblMyBatis (seq, name, age, address, gender)
	VALUES (seqMyBatis.nextVal, '홍길동', 20, '서울시 강남구 역삼동', 'm');
	
COMMIT;