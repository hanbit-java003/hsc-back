INSERT INTO tbl_country
	(id, name, title, text, flag)
VALUES
	('jeju', '제주도', '가족과 함께하는<br>제주도 여행', '사랑하는 가족과 함께<br>마음 따뜻한 여행기', './img/flag/kor.png'),
    ('hungary', '헝가리', '사랑에 빠지는 곳,<br>부다페스트', '감성 충만, 세계에서 가장 아름다운<br>야경을 보고 싶다면 부다페스트로', './img/flag/hungary.png'),
    ('saipan', '사이판', '남태평양의 보석,<br>사이판', '바캉스의 상징, 남태평양의<br>푸른 낙원 사이판으로 떠나보자', './img/flag/usa.png');

SELECT * FROM tbl_country;

INSERT INTO tbl_member
	(uid, id, email, pwd, regist_dt, regist_by, domain)
VALUES
	("", "", "", "", NOW(), "", "");

SELECT * FROM tbl_member;

SELECT * FROM tbl_member_detail;

SELECT m.uid, id, email, pwd, domain, name, img, comment
FROM tbl_member m LEFT JOIN tbl_member_detail d
ON m.uid = d.uid
WHERE email = 'asdf@asdf.com';

SELECT m.uid, id, email, pwd, domain, name, img, comment
FROM tbl_member m LEFT JOIN tbl_member_detail d
ON m.uid = d.uid
WHERE id = 'asdf';