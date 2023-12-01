-- FileTest > script.sql


SELECT * FROM tblplace;
SELECT * FROM tblpic;

DROP TABLE tblpic;
DROP SEQUENCE seqpic;

DROP TABLE tblplace;
DROP SEQUENCE seqplace;

-- 장소
CREATE TABLE tblPlace (
	seq NUMBER PRIMARY KEY,
	subject varchar2(500) NOT NULL,
	content varchar2(1000) NOT NULL,
	regdate DATE DEFAULT sysdate NOT NULL
);

CREATE SEQUENCE seqplace;


-- 사진 업로드
CREATE TABLE tblPic (
	seq NUMBER PRIMARY KEY,
	filename varchar2(300) NOT NULL,
	pseq NUMBER REFERENCES tblPlace(seq) NOT NULL
);
CREATE SEQUENCE seqPic;


SELECT a.*, (SELECT count(*) FROM tblpic WHERE pseq = a.seq) AS picCount FROM tblPlace a ORDER BY a.seq DESC;

