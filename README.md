
# Portfolio

>개발자 지망생을 위한 포트폴리오 웹사이트입니다.<br>
>코드 수정과 재배포의 번거로움 없이 관리자 계정을 통해 편리하게 사이트를 관리할 수 있습니다. 


## 1. 프로젝트 개요
<strong>ㆍ 시행처</strong>: [구름 x 인프런] 자바 스프링 & 리액트 풀스택 개발자 성장 과정<br><br>
<strong>ㆍ 기간</strong>: 2023.12~2024.03<br><br>
<strong>ㆍ 프로그래밍 언어</strong>: Java, HTML, CSS, JavaScript<br><br>
<strong>ㆍ 프레임워크</strong>: Spring Boot 3.1.7<br><br>
<strong>ㆍ 템플릿 엔진</strong>: Thymleaf, Mustache<br><br>
<strong>ㆍ 라이브러리</strong>: Bootstrap<br><br>
<strong>ㆍ DBMS</strong>: MySQL, H2<br><br>
<strong>ㆍ 배포</strong>: AWS EC2<br><br>

## 2. 주요 기능
* 메인 화면(ABOUT, OTHERS) CRUD 기능
  
* 포트폴리오(PROJECTS) CRUD 기능
  
* 외부 URL 참조를 통한 이미지 등록
  
* 회원가입
  
* 로그인
  
* 유효성 검사 및 중복 검사
  
* 게시물 CRUD 권한이 부여된 관리자 계정

## 3. 실행 화면
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

## 4. DB 설계
<strong>[[ER-다이어그램](https://lh3.googleusercontent.com/pw/AP1GczO-BjIWtEDp3Ug5IfjGofaIV2mjnaB6fg55ZkwVLFlsNLbQEqSKD3BKL8ZZbmfdXDvkOqZWPXURhbiBJ0ZK3IgIzCncbZ0V82B93ahkZQ2eN6lMrVFqGzmaYaIoktke4lw25XDiPMdvpHZ7k7z-mgZh=w736-h536-s-no-gm?authuser=0)]</strong>

### **Users**

| 필드명     | 자료형 | 제약 조건            | 설명         |
|----------|------|------------------|------------|
| id       | long | PK, Not Null, Increment | 고유값   |
| email    | string | Not Null           | 이메일 주소 |
| password | string | Not Null           | 비밀번호    |

### **Projects**

| 필드명   | 자료형  | 제약 조건                | 설명            |
|---------|-------|----------------------|---------------|
| id      | long  | PK, Not Null, Increment | 고유값         |
| title   | string | Not Null               | 프로젝트명       |
| image   | string | Not Null               | 프로젝트 이미지    |
| result  | string | Not Null               | 구현 페이지 링크  |
| github  | string | Not Null               | 깃허브 링크      |
| content | string | Not Null               | 프로젝트 설명     |

### **Profiles**

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

## 5. API 설계

#### 프로젝트 관리 API

| 기능              | 메소드 | URL                | Return                 |
|------------------|--------|--------------------|------------------------|
| 프로젝트 조회     | GET    | `/api/projects`    | `List<ProjectResponse>` |
| 프로젝트 등록     | POST   | `/api/projects`    | `Project`               |
| 개별 프로젝트 조회 | GET    | `/api/projects/{id}` | `ProjectResponse`       |
| 프로젝트 수정     | PUT    | `/api/projects/{id}` | `Project`               |
| 프로젝트 삭제     | DELETE | `/api/projects/{id}` | `Void`                  |

#### 프로젝트 뷰 컨트롤러

| 기능                   | 메소드 | URL               | Return      |
|-----------------------|--------|-------------------|-------------|
| 전체 프로젝트 조회 페이지 | GET    | `/projects`       | `projectList` |
| 개별 프로젝트 조회 페이지 | GET    | `/projects/{id}`  | `project`     |
| 프로젝트 등록 페이지      | GET    | `/new-project`    | `newProject`  |

#### 프로필 뷰 컨트롤러

| 기능            | 메소드 | URL        | Return      |
|----------------|--------|------------|-------------|
| 메인 페이지 조회  | GET    | `/`        | `index`     |
| 프로필 편집 페이지 조회 | GET    | `/edit`     | `edit`      |
| 프로필 업데이트    | POST   | `/update`   | `redirect:/` |


#### 사용자 관리 API

| 기능         | 메소드 | URL       | Return               |
|--------------|--------|-----------|----------------------|
| 사용자 회원가입 | POST   | `/user`   | `signup` / `redirect:/login` |
| 로그아웃       | GET    | `/logout` | `redirect:/login`            |

#### 사용자 뷰 컨트롤러

| 기능          | 메소드 | URL        | Return   |
|---------------|--------|------------|----------|
| 로그인 페이지 조회 | GET    | `/login`   | `login`   |
| 회원가입 페이지 조회 | GET    | `/signup`  | `signup`  |

