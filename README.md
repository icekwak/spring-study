## Description
[개인 공부] Spring Framework 공부

1. 게시판
<br>├ 등록
<br>├ 수정
<br>├ 삭제
<br>├ 게시글 상세보기
<br>└ 페이징
  
2. 회원관리
<br>├ 로그인
<br>├ 로그아웃
<br>├ 회원가입
<br>└ 이메일 인증

## Tech Stack
<img src="https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=HTML5&logoColor=white"/></a>
<img src="https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=CSS3&logoColor=white"/></a>
<img src="https://img.shields.io/badge/javaScript-F7DF1E?style=flat-square&logo=JavaScript&logoColor=white"/></a>
<img src="https://img.shields.io/badge/jQuery-0769AD?style=flat-square&logo=jQuery&logoColor=white"/></a>

<img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=Java&logoColor=white"/></a>
<img src="https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=Spring&logoColor=white"/></a>
<img src="https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=Apache Maven&logoColor=white"/></a>
<img src="https://img.shields.io/badge/JSP-000?style=flat-square" /></a>

<img src="https://img.shields.io/badge/MySQL-5.7-4479A1?style=flat-square&logo=MySQL&logoColor=white"/></a>
<img src="https://img.shields.io/badge/MyBatis-0090CE?style=flat-square" /></a>

<img src="https://img.shields.io/badge/Tomcat-9.0.41-F8DC75?style=flat-square&logo=Apache Tomcat&logoColor=white"/>

## Prerequisite
1. tomcat 다운로드

2. `pom.xml` 파일 dependency version 변경 필요시 수정 및 확인<br>
[pom.xml](https://github.com/icekwak/spring-study/blob/main/springmvc/pom.xml)

3. `src/main/resources` 폴더에 `config.properties` 파일 생성 (mysql, Gmail 기준)
```properties
jdbc.driverClassName = com.mysql.cj.jdbc.Driver
jdbc.url = jdbc:mysql://localhost:3306/데이터베이스명?serverTimezone=Asia/Seoul&useUnicode=true&characterEncoding=utf8
jdbc.username = 계정명
jdbc.password = 계정비밀번호

mail.host = smtp.gmail.com
mail.port = 587
mail.username = 관리자 이메일 (인증메일 보낼 메일)
mail.password = 이메일 비밀번호
```

## Record
#### 2021-07-12
1. BD 연동 및 개발환경 설정<br>
2. 개발환경 구성
3. 게시글 목록, 게시글 상세보기 구현

#### 2021-07-13
1. Mybatis 공부 및 사용
2. 게시글 등록 구현

#### 2021-07-14
1. 로그인, 로그아웃 구현
2. 게시글 수정 구현
3. 로그인 시 게시글 등록, 수정 권한 부여

#### 2021-07-16
1. 회원 아이디 중복 체크 구현
2. 회원가입 유효성 검사 및 비밀번호 체크 구현 중

#### 2021-07-20
1. 간단한 UI 수정
2. 회원가입 form 전체 수정(이메일 인증 추가)
3. 회원 닉네임, 비밀번호 검사 구현
4. 이메일 인증 구현 중

#### 2021-07-21
1. 이메일 인증 구현

## Memo
1. 파일업로드 미완성
