-- Code > script.sql

CREATE TABLE tblCode (
	seq NUMBER PRIMARY KEY,
	subject varchar2(1000) NOT NULL,
	code varchar2(2000) NOT NULL,
	regdate DATE DEFAULT sysdate NOT NULL,
	language varchar2(100) NOT NULL
);

CREATE SEQUENCE seqCode;

SELECT * FROM tblcode;