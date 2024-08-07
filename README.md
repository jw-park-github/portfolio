# Portfolio

<br>

>개발자 지망생을 위한 포트폴리오 웹사이트입니다.<br><br>
>코드 수정과 재배포의 번거로움 없이 관리자 계정을 통해 편리하게 사이트를 관리할 수 있습니다.

<br>


# 목차
- [1. 프로젝트 개요](#1-프로젝트-개요)
- [2. 주요 기능](#2-주요-기능)
- [3. DB 설계](#3-db-설계)
- [4. API 문서](#4-api-문서)
- [5. 실행 화면](#5-실행-화면)

  <br>

# 1. 프로젝트 개요
* 시행처</strong>: [카카오x구름] Spring & React 풀스택 개발자 과정<br>
* 기간</strong>: 2023.12~2024.03<br>
* 프로그래밍 언어</strong>: Java, HTML, CSS, JavaScript<br>
* 프레임워크</strong>: Spring Boot 3.1.7<br>
* 템플릿 엔진</strong>: Thymleaf, Mustache<br>
* 라이브러리</strong>: Bootstrap<br>
* DBMS</strong>: MySQL, H2<br>
* 배포</strong>: AWS EC2<br><br>

# 2. 주요 기능
* 메인 화면(ABOUT, OTHERS) CRUD 기능
* 포트폴리오(PROJECTS) CRUD 기능
* 외부 URL 참조를 통한 이미지 등록
* 회원가입
* 로그인
* 유효성 검사 및 중복 검사
* 게시물 CRUD 권한이 부여된 관리자 계정<br><br>

# 3. DB 설계

<strong>[[ER-다이어그램](https://lh3.googleusercontent.com/pw/AP1GczO-BjIWtEDp3Ug5IfjGofaIV2mjnaB6fg55ZkwVLFlsNLbQEqSKD3BKL8ZZbmfdXDvkOqZWPXURhbiBJ0ZK3IgIzCncbZ0V82B93ahkZQ2eN6lMrVFqGzmaYaIoktke4lw25XDiPMdvpHZ7k7z-mgZh=w736-h536-s-no-gm?authuser=0)]</strong>


## **Users**

| 필드명     | 자료형 | 제약 조건            | 설명         |
|----------|------|------------------|------------|
| id       | long | PK, Not Null, Increment | 고유값   |
| email    | string | Not Null           | 이메일 주소 |
| password | string | Not Null           | 비밀번호    |

<br>

## **Projects**

| 필드명   | 자료형  | 제약 조건                | 설명            |
|---------|-------|----------------------|---------------|
| id      | long  | PK, Not Null, Increment | 고유값         |
| title   | string | Not Null               | 프로젝트명       |
| image   | string | Not Null               | 프로젝트 이미지    |
| result  | string | Not Null               | 구현 페이지 링크  |
| github  | string | Not Null               | 깃허브 링크      |
| content | string | Not Null               | 프로젝트 설명     |

<br>

## **Profiles**

| 필드명      | 자료형  | 제약 조건                | 설명              |
|-----------|-------|----------------------|-----------------|
| id        | long  | PK, Not Null, Increment | 고유값           |
| mainImage | string | Not Null               | 배경 이미지        |
| about     | string | Not Null               | 자기 소개         |
| otherOne  | string | Not Null               | OTHERS의 1번 이미지 |
| otherTwo  | string | Not Null               | OTHERS의 2번 이미지 |
| otherThree | string | Not Null               | OTHERS의 3번 이미지 |
| otherFour | string | Not Null               | OTHERS의 4번 이미지 |
| otherFive | string | Not Null               | OTHERS의 5번 이미지 |
| otherSix  | string | Not Null               | OTHERS의 6번 이미지 |

<br>
<br>

# 4. API 문서


## ProfileController

| Method | API            | Path  | Query | Body  | Status | JSON Result                      |
|--------|----------------|-------|-------|-------|--------|----------------------------------|
| GET    | Show Main Page | /     | None  | None  | 200    | 프로필 데이터가 포함된 HTML 페이지  |
| GET    | Show Edit Page | /edit | None  | None  | 200    | 프로필 데이터가 포함된 HTML 페이지  |
| POST   | Update Profile | /update | None | mainImage, about, otherOne, otherTwo, otherThree, otherFour, otherFive, otherSix | 302 (Redirect) | 메인 페이지로 리다이렉트            |

<br>

## ProjectApiController

| Method | API            | Path             | Query | Body                | Status | JSON Result                  |
|--------|----------------|------------------|-------|---------------------|--------|------------------------------|
| POST   | Add Project    | /api/projects    | None  | AddProjectRequest   | 201    | 프로젝트                        |
| GET    | Find All Projects | /api/projects | None  | None                | 200    | ProjectResponse 목록            |
| GET    | Find Project by ID | /api/projects/{id} | None | None              | 200    | ProjectResponse              |
| DELETE | Delete Project | /api/projects/{id} | None | None              | 200    | 없음                           |
| PUT    | Update Project | /api/projects/{id} | None | UpdateProjectRequest | 200  | 프로젝트                        |

<br>

## ProjectViewController

| Method | API            | Path         | Query | Body | Status | JSON Result                      |
|--------|----------------|--------------|-------|------|--------|----------------------------------|
| GET    | Get Projects   | /projects    | None  | None | 200    | 프로젝트 목록이 포함된 HTML 페이지    |
| GET    | Get Project by ID | /projects/{id} | None | None | 200 | 프로젝트 데이터가 포함된 HTML 페이지   |
| GET    | New Project    | /new-project | id (optional) | None | 200 | 새 프로젝트 생성용 HTML 페이지       |

<br>

## UserApiController

| Method | API            | Path   | Query | Body            | Status | JSON Result           |
|--------|----------------|--------|-------|-----------------|--------|-----------------------|
| POST   | Signup         | /user  | None  | AddUserRequest  | 302 (Redirect) | 로그인 페이지로 리다이렉트   |
| GET    | Logout         | /logout | None  | None            | 302 (Redirect) | 로그인 페이지로 리다이렉트   |

<br>

## UserViewController

| Method | API            | Path   | Query | Body | Status | JSON Result           |
|--------|----------------|--------|-------|------|--------|-----------------------|
| GET    | Login          | /login | None  | None | 200    | HTML 로그인 페이지    |
| GET    | Signup Page    | /signup | None | None | 200    | HTML 회원가입 페이지  |

<br>

## EtcController

| Method | API          | Path          | Query | Body | Status | JSON Result    |
|--------|--------------|---------------|-------|------|--------|----------------|
| GET    | Show Youtube | /youtube      | None  | None | 200    | "youtube"      |
| GET    | Show Netflix | /netflix      | None  | None | 200    | "netflix"      |
| GET    | Show ToDo    | /todo         | None  | None | 200    | "todo"         |
| GET    | Github Finder| /githubfinder | None  | None | 200    | "githubfinder" |
| GET    | SpreadSheet  | /spreadsheet  | None  | None | 200    | "spreadsheet"  |

<br>
<br>


# 5. 실행 화면
<strong>[[메인 화면]](https://jw-park.com/)</strong><br>
<img width="960" alt="MAIN_PAGE_2" src="https://github.com/jw-park-github/portfolio/assets/165545220/15bb7610-75d1-4e82-b55d-b3a01018be46"><br><br>
<img width="960" alt="ABOUT_OTHERS" src="https://github.com/jw-park-github/portfolio/assets/165545220/db072cae-ffb4-441f-9e8d-4032b25f4113"><br>

---

<strong>[메인 화면 수정]</strong><br>
<img width="960" alt="UPDATE_MAIN_PAGE" src="https://github.com/jw-park-github/portfolio/assets/165545220/8ed70e98-fc9d-43d1-addc-3ac1a755d931"><br>

---

<strong>[[전체 포트폴리오 목록]](https://jw-park.com/projects)</strong><br>
<img width="960" alt="PROJECTS_LIST" src="https://github.com/jw-park-github/portfolio/assets/165545220/c673a361-129c-41cc-ad3f-dce9bb09e8ed"><br>

---

<strong>[포트폴리오 생성]</strong><br>
<img width="960" alt="CREATE_PROJECT" src="https://github.com/jw-park-github/portfolio/assets/165545220/388e4a46-cf3e-4bbd-b570-974762d37b0a"><br>

---

<strong>[포트폴리오 수정]</strong><br>
<img width="960" alt="UPDATE_PROJECT" src="https://github.com/jw-park-github/portfolio/assets/165545220/3d1a7873-c9ce-4deb-8361-4d381c95c4a5"><br>

---

<strong>[포트폴리오 삭제]</strong><br>
<img width="960" alt="DELETE_PROJECT" src="https://github.com/jw-park-github/portfolio/assets/165545220/86d5f297-4612-4b9a-962c-0b6879e32da9"><br>

---

<strong>[[회원 가입]](https://jw-park.com/signup)</strong><br>
<img width="960" alt="SIGNUP" src="https://github.com/jw-park-github/portfolio/assets/165545220/8b12a78b-87e3-4c08-97dd-60e42346b1a1"><br>

---

<strong>[[로그인]](https://jw-park.com/login)</strong><br>
<img width="960" alt="LOGIN" src="https://github.com/jw-park-github/portfolio/assets/165545220/ae1c156a-e74a-4783-866d-127cb3b33803">

<br>
