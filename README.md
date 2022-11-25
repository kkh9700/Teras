<div align="center">
  <br />
  <img src="/build/Teras_logo_home.png" alt="TerasStudy" />
  <br />
  <h1>테라스처럼 편한 학교</h1>
  <br />
</div>

## 목차

1. [**서비스 소개**](#1)
2. [**기술 스택**](#2)
3. [**시스템 아키텍처**](#3)
4. [**주요기능 및 데모영상**](#4)
5. [**UCC 보러가기**](#5)
6. [**협업 관리**](#6)
7. [**개발 멤버 소개**](#7)
8. [**프로젝트 기간**](#8)
9. [**프로젝트 관련 문서**](#9)

<br/>

<div id="1"></div>

## 💡 서비스 소개

### 메가스터디보다 뛰어난 테라스 스터디와 함께하세요.

> 학교에 가지 않고 온라인으로 수업을 듣는 시대가 왔습니다. <br />
코로나19로 비대면 수업들이 이제 일상이 되어버렸습니다. <br />
테라스 스터디는 편한 교육 환경으로 우수한 교육 퀄리티를 제공합니다.
>
#### 선생님과 학생 모두에게 편한 교육 플랫폼! Teras Study에서 등교부터 하교까지 함께 하세요! 
<br/>

<div id="2"></div>

## 🛠️ 기술 스택

<img src="https://img.shields.io/badge/Java-FF7800?style=for-the-badge&logo=Java&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/Spring Security-6DB33F?style=for-the-badge&logo=Spring Security&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=Spring Boot&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/JSON Web Tokens-000000?style=for-the-badge&logo=JSON Web Tokens&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>

<img src="https://img.shields.io/badge/Amazon S3-569A31?style=for-the-badge&logo=Amazon S3&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<br>
<img src="https://img.shields.io/badge/Ubuntu-E95420?style=for-the-badge&logo=Ubuntu&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=Gradle&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/Nginx-009639?style=for-the-badge&logo=NGINX&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>

<br>
<img src="https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=React&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/Node.js-339939?style=for-the-badge&logo=Node.js&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/Redux-764ABC?style=for-the-badge&logo=Redux&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>

<br>
<img src="https://img.shields.io/badge/Jira-0052CC?style=for-the-badge&logo=Jira&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/>
<img src="https://img.shields.io/badge/GitLab-FCA121?style=for-the-badge&logo=GitLab&logoColor=white" style="height : auto; margin-left : 10px; margin-right : 10px;"/> <br/>

<details><summary> <b> 상세 기술스택 및 버전</b> </summary>

| 구분       | 기술스택                    | 상세내용                 | 버전          |
| -------- | ----------------------- | -------------------- | ----------- |
| 공통     | 형상관리                 | Gitlab               | \-          |
|          | 이슈관리                 | Jira                 | \-          |
|          | 커뮤니케이션             | Mattermost, Notion   | \-          |
| BackEnd  | DB                      | MySQL                | 5.7         |
|          |                         | JPA                  | \-          |
|          |                         | QueryDSL             | \-          |
|          | Java                    | Zulu                 | 8.33.0.1    |
|          | Spring                  | Spring               | 5.3.6       |
|          |                         | Spring Boot          | 2.4.5       |
|          | IDE                     | Eclipse              | JEE 2020-06 |
|          | Cloud Storage           | AWS S3               | \-          |
|          | Build                   | Gradle               | 7.3.2       |
|          | WebRTC                  | OpenVidu             | 2.22.0      |
|          | API Docs                | Postman              |             |
| FrontEnd | HTML5                   |                      | \-          |
|          | CSS3                    |                      | \-          |
|          | JavaScript(ES6)         |                      |\-           |
|          | React                   | React                | 17.0.2      |
|          | React                   | Redux                | 7.2.6       |
|          | React                   | Redux-thunk          | 2.4.1       |
|          |                         | styled-components    | 5.3.3       |
|          |                         | framer-motion        | 6.0.0       |
|          |                         | apexcharts           | 3.33.0      |
|          |                         | toast-ui/react-editor      | 3.1.2       |
|          |                         | toast-ui/react-calendar    | 1.0.6       |
|          | WebSocket               | @stomp/stompjs       | 6.1.2       |
|          | WebSocket               | stompjs              | 2.3.3       |
|          | WebSocket               | sockjs-client        | 1.5.2       |
|          | IDE                     | Visual Studio Code   | 1.63.2      |
| Server   | 서버                    | AWS EC2              | \-          |
|          | 플랫폼                   | Ubuntu               | 20.04.3 LTS |
|          | 수동배포                 |                      |           |


</details>

<br />

<div id="3"></div>

## 🗂️ 시스템 아키텍처

|                              시스템 구성                           |
| :------------------------------------------------------------------------------: |
| !![image](/assets/아키텍쳐.png)(#) |


|                              디렉토리 구조                       |
| :------------------------------------------------------------------------------: |
| 프론트엔드![image](/assets/디텍토리_프론트.jpg) 백엔드![image](/assets/디렉토리_백엔드.jpg) |

<br />

<div id="4"></div>

## 🖥️ 주요기능

### 온라인수업
- 선생님이 수업을 개설하면 해당 수업을 수강하는 학생이 수업에 참여할 수 있습니다.
- 사용자는 비디오, 오디오 ON/OFF를 설정할 수 있습니다.
- 선생님은 원활한 수업진행을 위해 화면공유를 할 수 있습니다. 

### 스터디룸
- 학생은 원하는 이름의 스터디룸을 만들 수 있습니다.
- 학생들은 만들어진 스터디룸에 자유롭게 들어가고 나갈 수 있습니다.
- 스터디룸을 만든 학생은 화면공유를 할 수 있습니다.

### 시간표
- 학생들은 오늘의 시간표를 통하여 오늘 수강할 과목들을 확인 할 수 있습니다.
- 해당 시간의 시간표를 눌러서 강의실에 참여할 수 있습니다.
- 매 교시는 프로필 상단에 위치하여 있어서 지금이 몇 교시인지 확인할 수 있습니다.

|                              온라인 수업                                      |
| :---------------------------------------------------------------------------: |
|  <img src="/uploads/a5a8c8938025d96533d3dc791b17fd8d/온라인수업.gif" alt="온라인수업" />                |

|                              스터디룸                                      |
| :---------------------------------------------------------------------------: |
|  <img src="/uploads/4dde8bf0284cace81f9590af96cf96b5/스터디룸.gif" alt="스터디룸" />                |


### 공지사항
- 교사는 공지사항을 작성할 수 있습니다.
- 학생들은 공지사항에 적힌 내용들을 쉽게 확인할 수 있습니다.
- 첨부파일 기능을 넣어서, 첨부파일을 쉽게 첨부, 다운로드할 수 있습니다.

|                              공지사항(선생님)                  |
| :---------------------------------------------------------------------------: |
|  <img src="/uploads/514f4fc92d814fcd4625e661751d3af6/공지사항선생님.gif" alt="공지사항(선생님)" />  |

|                              공지사항(학생)                  |
| :---------------------------------------------------------------------------: |
|  <img src="/uploads/cafc5272f63c5b18d1472f55aa64fcd8/공지사항학생.gif" alt="공지사항(학생)" />  |
    
### 과제
- 선생님은 자신의 과목에 과제를 원하는 기간을 설정하여 올릴 수 있습니다.
- 학생들은 해당 과목에 댓글 형식으로 과제를 제출할 수 있습니다.
- 선생님과 학생 모두 파일을 첨부할 수 있습니다.

|                              과제(선생님)                     |
| :---------------------------------------------------------------------------: |
|  <img src="/uploads/c968df19132ebf47d80bcdc3a0ccc1ec/과제선생님.gif" alt="과제(선생님)" />  |

|                              과제(학생)                      |
| :---------------------------------------------------------------------------: |
|  <img src="/uploads/e7968eee8623ab2dfdcb8cac9221ef34/과제학생.gif" alt="과제(학생)" />  |

### 캘린더/우리반보기 기타등등
- 캘린더를 통하여 각각 날짜의 행사를 확인할 수 있습니다.
- 우리반보기를 통하여 우리반 학생들을 한 눈에 볼 수 있습니다.

|                              기타등등                    |
| :---------------------------------------------------------------------------: |
|  <img src="/uploads/954a56669881cd23004c5cb46c6947e6/기타등등.gif" alt="기타등등" />  |

<br/>

<div id="5"></div>

## 🎥 [UCC 보러가기](#) 

<br />

<div id="6"></div>

## 👥 협업 관리 

|                            Jira BurnDown Chart                      |
| :---------------------------------------------------------------------------: |
|  <img src="/uploads/0c13df10395b2c4b1745acd68aab440e/번다운차트.PNG" />  |

|                            Notion                      |
| :---------------------------------------------------------------------------: |
|  <img src="/uploads/edf6cea8ba6f3d7e652e5af3acaebd42/bandicam_2022-08-19_01-14-58-548.jpg" /><img src="/uploads/18114ff56dc79137c47e068fe84c14a5/bandicam_2022-08-19_01-14-23-188.jpg" />  |

<br />

<div id="7"></div>

## 👪 개발 멤버 소개 
<table>
    <tr>
        <td height="140px" align="center"> <a href="https://github.com/PowerBBear">
            <img src="/uploads/b0ab56b839be9246253b4053b33b373c/민성.jpg" width="140px" /> <br><br> 👑 김민성 <br>(Front-End) </a> <br></td>
        <td height="140px" align="center"> <a href="https://github.com/JunPark364">
            <img src="/uploads/62c8c647a9a7f0457f513f1e8b9c17fe/영준.jpg" width="140px" /> <br><br> 🙂 박영준 <br>(Front-End) </a> <br></td>
        <td height="140px" align="center"> <a href="https://github.com/pch8349">
            <img src="/uploads/bde99e85c40adf4a84d8a4b12a4e864b/찬혁.jpg" width="140px" /> <br><br> 😆 박찬혁 <br>(Front-End) </a> <br></td>
        <td height="140px" align="center"> <a href="https://github.com/SilverLight96">
            <img src="/uploads/b4261571e054933c2178a03f13e19f2d/경은.jpg" width="140px" /> <br><br> 😁 강경은 <br>(Back-End) </a> <br></td>
        <td height="140px" align="center"> <a href="https://github.com/heunhanireum">
            <img src="/uploads/ae19dde3e26a774bcef77adcc154f725/민지.jpg" width="140px" /> <br><br> 🙄 김민지 <br>(Back-End) </a> <br></td>
        <td height="140px" align="center"> <a href="https://github.com/kkh9700">
            <img src="/uploads/8a957c23971bab7ac9f3fec55e64c918/경환.jpg" width="140px" /> <br><br> 😶 김경환 <br>(Back-End) </a> <br></td>
    </tr>
    <tr>
        <td align="center">UI/UX<br/>React<br/>DB<br/>Infra<br/></td>
        <td align="center">UI/UX<br/>React<br/>WebRTC</td>
        <td align="center">UI/UX<br/>React</td>
        <td align="center">REST API<br/>WebRTC</td>
        <td align="center">REST API<br/>CI/CD<br/></td>
        <td align="center">REST API<br/>DB<br/>S3<br/>Infra<br/></td>
    </tr>
</table>

<br />

<div id="8"></div>

## 📆 프로젝트 기간
### 22.7.11 ~ 22.8.19
- 기획 및 설계 : 22.7.11 ~ 19
- 프로젝트 구현 : 22.7.20 ~ 22.8.18
- 버그 수정 및 산출물 정리 : 22.8.19


<br />

<div id="9"></div>

## 📋 프로젝트 관련 문서
|  구분  |  링크  |
| :--------------- | :---------------: |
| 와이어프레임 | [와이어프레임 바로가기](https://www.figma.com/file/UGLmvsrx12LGMRymKGRVPw/TERAS-STUDY?node-id=0%3A1) |
| ERD | [ERD 바로가기](https://drive.google.com/file/d/1PmUqEjwf3GyiuHPqTALUJH6emQohCJ5I/view?usp=sharing) |
| 빌드/배포 | [빌드/배포 바로가기](/exec/배포환경.md) |
| 시연 시나리오 | [시연 시나리오 바로가기](/exec/시연시나리오_대본.docx) |
| 발표자료 | [발표자료 바로가기](/exec/서울_7반_A706_발표자료.pdf)) |
