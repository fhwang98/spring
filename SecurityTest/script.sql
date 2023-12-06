-- SecurityTest > script.sql

-- 회원 테이블
-- 암호 > 암호화 인코딩
CREATE TABLE tblMember (
	userid varchar2(50) NOT NULL PRIMARY KEY,
	userpw varchar2(100) NOT NULL, -- 최소 100바이트 이상
	username varchar2(100) NOT NULL,
	regdate DATE DEFAULT sysdate NOT NULL,
	enabled char(1) DEFAULT '1'
);

-- 권한(자격) 테이블
CREATE TABLE tblAuth (
	userid varchar2(50) NOT NULL,
	auth varchar2(50) NOT NULL,
	
	CONSTRAINT fk_member_auth FOREIGN key(userid) REFERENCES tblMember(userid)
);


SELECT * FROM tblmember;
SELECT * FROM tblauth;




SELECT 
			m.userid,
			m.userpw,
			m.username,
			m.enabled,
			m.regdate,
			a.auth
		FROM tblMember m
			LEFT OUTER JOIN tblAuth a
				ON m.userid = a.userid
					WHERE m.userid = 'hamster';





