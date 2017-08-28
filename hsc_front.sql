select *
  from tbl_contents;
  
insert into tbl_contents
	(id, name, main_title, sub_title)
values
	('france', '프랑스', '진정한 빠리지앵<br>이 되고싶다면', '와인 한 잔, 그리고 바게트와 <br>함께하는 여행기'),
    ('jeju', '제주도', '가족과 함께하는<br>제주도 여행', '사랑하는 가족과 함께 <br>마음 따뜻한 여행기');
    
select *
  from tbl_users;

insert into tbl_users
	(user_no, user_id, img, text)
values
	('1', '중기꺼', 'img/user/shk.jpg', '인생은 나처럼'),
    ('2', '문뽕구', 'img/user/mcw.jpg', '얼굴이 좀 크죠'),
    ('3', '이지금', 'img/user/iu.jpg', '오빠가 좋은걸~'),
    ('4', '제니', 'img/user/jennie.jpg', '마마마지막처럼 같이 여행갈래요?'),
    ('5', '세젤예', 'img/user/ireane.jpg', '빨간맛! 궁금해 허니!'),
    ('6', '태봉궁예', 'img/user/gungye.jpg', '누가 기침소리를 내었는가'),
    ('7', '족구왕안나', 'img/user/hsu.jpg', '오빠 나 진짜 나쁜년이니까 좋아하지마요'),
    ('8', '호동이', 'img/user/khd.jpg', '으랏차차!!');

select *
  from tbl_submenu;

insert into tbl_submenu
	(id, submenu_id, img, title, content, user_no, user_id, users_img)
values
    ('france', '1', './img/albums/view.jpg', '스물 셋, 그림속을 거닐다.', '#유럽 #나홀로여행 #프랑스 #여름이야기 #전국일주', '1', '중기꺼', 'img/user/shk.jpg'),
    ('france', '2', './img/albums/france.jpg', '프랑스~모로코', '', '3', '이지금', 'img/user/iu.jpg'),
    ('france', '3', './img/albums/eftower.jpg', 'Je t\'aime, Paris!', '#여행을쓰자 #파리 #프랑스 #여름이야기 #유럽', '2', '문뽕구', 'img/user/mcw.jpg');
    
select *
  from tbl_users_sub;
  
insert into tbl_users_sub
	(visited, visited_img, user_no, user_id, users_img)
values
('spain', 'img/flag/spain.png', '7', '족구왕안나', 'img/user/hsu.jpg'),
('turkey', 'img/flag/tk.png', '7', '족구왕안나', 'img/user/hsu.jpg'),
('england', 'img/flag/eng.png', '7', '족구왕안나', 'img/user/hsu.jpg'),
('usa', 'img/flag/usa.png', '7', '족구왕안나', 'img/user/hsu.jpg'),
('korea', 'img/flag/kor.png', '7', '족구왕안나', 'img/user/hsu.jpg'),
('czech', 'img/flag/cz.png', '7', '족구왕안나', 'img/user/hsu.jpg'),
('japan', 'img/flag/jpn.png', '7', '족구왕안나', 'img/user/hsu.jpg'),
('china', 'img/flag/cn.png', '7', '족구왕안나', 'img/user/hsu.jpg');
  
SELECT name, main_title, sub_title
FROM tbl_contents
WHERE id = 'france';

SELECT id, submenu_id, img, title, content, users_img, user_id, together, COUNT(id)
FROM tbl_submenu
WHERE id = 'france'
ORDER BY submenu_id;

SELECT user_no, user_id, img, text
FROM tbl_users;

SELECT user_no, visited, visited_img
FROM tbl_users_sub
WHERE user_no = 1;
SELECT u.user_no, u.user_id, u.img, u.text, s.user_no, s.visited, s.visited_img
FROM tbl_users u, tbl_users_sub s
WHERE u.user_no = s.user_no
ORDER BY s.user_no;

SELECT u.user_no, u.user_id, u.img, u.text, s.title, s.content, s.img
FROM tbl_users u 
LEFT JOIN tbl_submenu s
ON u.user_no = s.user_no
WHERE u.user_no = 3;

SELECT user_no, title, content, img
FROM tbl_submenu
WHERE user_no = 1;

SELECT user_no, user_id, users_img, title, content, img
FROM tbl_submenu
WHERE user_no=1;

SELECT u.user_no, u.user_id, u.img, u.text, s.visited, s.visited_img
FROM tbl_users u
JOIN tbl_users_sub s
ON u.user_no = s.user_no
ORDER BY u.user_no;

SELECT img, title, content, user_no, user_id, users_img, together, like_count, submenu_id
		  FROM tbl_submenu
		 ORDER BY user_no;


UPDATE `tbl_submenu` SET `like_count`= like_count + 1 WHERE `id`='france' and`submenu_id`='1' and`user_no`='1';

SELECT * FROM hsc_front.tbl_member;
		  