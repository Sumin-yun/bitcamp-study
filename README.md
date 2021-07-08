# bitcamp-study

##1일차(2021-06-28, 수)

	1) 웹 개발자 필요 역량

	2) 웹 개발자 진로 : SI/SM, 스타트업, 서비스, 공사 등		

	3) 소프트웨어 개요
	
	4) 개발학습 도구 준비

		1.webEx
		-온라인 화상 통신 설치	
	
		2.git hub
		-계정생성
		-git client 설치
		-client server로 연결
		-git 가져오기 (변경된 내용 백업)
		-git 로컬 저장소에 변경 내용 업로드
	


##2일차(2021-06-29, 화)

	1) git hub pul/push 복습
		-로컬저장소 파일 업로드: 백업명단 작성 ($git add .)  -> 백업 수행 ($git commit -m "설명") -> $git push
		-서버 저장소 변경내용 로컬 저장소로 가져오기: $git pull

	2) Programming 소개 
	
		1.컴파일 방식
		-소스파일을 기계어로 번역 - 운영체제로 전달 - cpu로 전달 및 명령어 처리
		-코드를 cpu가 인식할 수 있는 명령어로 번역하는 컴파일 과정이 필요.
		-같은 cpu일지라도 번역된 기계어를 cpu에서 처리하는 규칙이 다르기 때문에 실행 과정을 거쳐야 함. 
		-mingw64 윈도우 gcc 컴파일 설치

		2.인터프리터 방식
		-소스파일의 - interpreter - 운영체제
		-소스파일의 명령을 인터프리터를 이용하여 바로 실행한다.
		-node.js 자바스크립트 인터프리터 설치
		
 
##3일차(2021-06-30, 수)

	1)프로그래밍 언어와 컴파일
		-인터프리터 방식과 컴파일 방식의 차이 복습.
		-컴파일 방식은 소스 파일의 명령을 한 줄씩 읽어서 실행하기 떄문에, 기계어를 바로 실행하는 인터프리터 방식보다 속도가 느리다.
		-인터프리터 방식은 OS용 인터프리터만 있으면 언제든 실행가능하기 떄문에, 소스코드가 공개 된다.
		-컴파일 방식 (예.Webex, 예.네이버, 구글)

	2)수업도구설치
		-JDK설치 (java로 작성한 명령어를 byte코드로 번역)
		-PATH 환경변수 설정

	3)자바 애플리케이션 프로젝트 폴더 준비
		-애플리케이션과 프로젝트의 관계
		-git 저장소에서 프로젝트 관리 하기
		1단계: 소스파일과 .class 파일을 구분하지 않음
		2단계: src 폴더와 bin 폴더를 사용하여 소스 파일과 .class 파일을 분리한다.
		3단계: Maven 프로젝트 표준 디렉토리 구조
		4단계: git 저장소에 여러개의 프로젝트 두기	


##4일차(2021-07-01, 목)

	1)프로그래밍 도구 준비
		-Gradle 설치 
		-Gradle 환경변수 등록

	2)빌드 도구
		-빌드 도구 (Ant, Maven, Gradle)
		-Ant (build.xml) : 1세대 빌드도구. 
		-Maven (pom.xml) : 2세대 빌드도구. Ant에서 의존 라이브러리가 자동 다운됨.
		-Gradle(build.gradle) :3세대 빌드도구. Android App 개발시 필요 + Maven 호환

	3)Gradle 빌드 도구
		1.빌드 스크립트 파일 용도
			-setting.gradle : 여러 프로젝트에 공통으로 적용할 설정 정보.
			-app/build.gradle : 서브 프로젝트에만 적용하는 빌드 설정 정보.
		2.빌드도구 설정
			-init 작업을 통해 프로젝트 폴더 준비
			-build.script에 빌드 작업이 들어 있는 플러그인 설정.
			-각 플러그인의 작업을 실행할 때 필요한 정보 등록.
			-프로젝트에서 사용할 외부 라이브러리 파일 등록.
			-필요한 작업을 실행하여 애플리케이션 빌드.

##5일차(2021-07-02, 금)

	1)프로그래밍 도구 준비
		-eclipse.org에서 개발 도구 설치
		-eclipse IDE 환경설정

	2)git 다루기
		-로컬 저장소 만들기 : git init
		-서버 저장소 만들기 : github.com 에서 new
		-로컬 저장소에 서버 저장소 위치 등록 : git remote origin 서버URL
		-로컬 저장소 내용 서버에 올리기 : git push	

	3)자바 기초 문법
		1.ex01
			-패키지 구성하기 : 쓰임에 따라 알맞게 프로젝트를 분류한다.
			-자바 소스 파일과 클래스 블록: 자바에서 프로젝트를 컴파일하면, 프로젝트명이 아닌 클래스명으로 실행파일이 생성된다.
			-소스 파일의 인코딩 : window에서 소스파일이 ms949로 작성되었을 것이라 간주되기 때문에, -encoding utf-8 명령어를 이용하여 컴파일 해야 오류가 없다.
			-main() 메서드

		2.ex02
			-여러 줄 주석, 한 줄 주석: 여러줄 = /*, */  한줄 = //
			-javadoc : 소스코드에 있는 주석을 HTML문서로 만들어 준다.
			-애노테이션 : @


##6일차(2021-07-05, 월)

	1)프로그래밍 도구 준비
		-VSCode Live Share 확장팩 추가

	2)자바 기초 문법
		1.ex99
			-콘솔 다루기 : print(), println(), printf() 차이
				print() : 줄바꿈 없이 ()안 내용 출력
				pintln() : 줄바꾸며 ()안 내용 출력
				printf() : 저장된 위치에 삽입되어 하나의 문자열 생성
		2.ex03 
			-리터럴 표기법 요약 정리 : 정수리터럴, 부동소수점 리터럴, 논리 리터럴, 문자 리터럴, 문자열 리터럴
			-값을 메모리에 저장하는 방법 : RAM, HDD
			-10진수, 8진수, 2진수, 16진수 표기법
			-메모리 크기에 따른 값의 범위


##7일차(2021-07-06, 화)			

	1)프로그래밍 도구 준비
		-VSCode Hex Editor 플러그인 추가
		-.class 파일을 Hex Editor 이용하여 16진수로 출력해보기.
			->부동소수점이 2진수로 표현됐을 떄의 2진수 값 확인.
	
	2)자바 기초 문법
		1.ex03
			-부동 소수점을 2진수로 표현하는 법 : IEEE 754 명세
			-문자를 2진수로 표현하는 방법: ASCII, ISO-8859-2, EUC-KR, 조합형, Unicode, UTF-8 문자 집합 소개
			-이스케이프 문자 
			-Raster 폰트와 Vector 폰츠 비교
			-줄바꿈 코드: 0D(Carrage Return; CR), 0A(Line Feed; LF) 

	