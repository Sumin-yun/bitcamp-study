# bitcamp-study curriculum

## 1일차(2021-06-28,수)

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
	


## 2일차(2021-06-29,화)

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
		
 
## 3일차(2021-06-30,수)

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


## 4일차(2021-07-01,목)

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

## 5일차(2021-07-02,금)

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


## 6일차(2021-07-05,월)

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


## 7일차(2021-07-06,화)			

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

	# bitcamp-20210621


## 8일차(2021-07-07,수)
- 자바 기초 문법(eomcs-java/com.eomcs.lang)
	- ex04
		- 변수와 변수 선언: 데이터 타입과 변수명
		- primitive data type: byte, short, int, long, float, double, boolean
	- ex99
		- Scanner 를 이용하여 키보드 입력 다루기
- 실전 프로젝트(eomcs-java-project)
	- 02-b. 값 다루기 : 변수와 키보드 입력

## 9일차(2021-07-08,목)
- 자바 기초 문법(eomcs-java/com.eomcs.lang)
	- com.eomcs.lang.ex04
		- 배열 다루기
	- com.eomcs.lang.ex06
		- if, if ~ else 
		- while, for
- 자바 기본 클래스(eomcs-java/com.eomcs.basic)		
	- com.eomcs.basic.ex10
		- java.util.Date 클래스 사용법
		- java.sql.Date 클래스 사용법
- 실전 프로젝트(eomcs-java-project)
	- 02-c. 값 다루기 : 배열과 흐름 제어문 활용

## 10일차(2021-07-09,금)
- 자바 기초 문법(eomcs-java/com.eomcs.lang)
	- ex04: 배열 다루기(계속)
	- ex05: 연산자 사용법

## 10일차(2021-07-09,금)
- 자바 기초 문법(eomcs-java/com.eomcs.lang)
	- ex04: 배열 다루기(계속): 배열 레퍼런스와 오프셋 주소
	- ex05: 연산자 사용법

## 11일차(2021-07-12,월)
- 자바 기초 문법(eomcs-java/com.eomcs.lang)
	- ex05: 연산자 사용법(계속) : 비트 이동 연산자
	- ex06: 조건문, 반복문
- 실전 프로젝트(eomcs-java-project)
	- 03-a. 메서드 사용법 : 프로그램의 시작점(entry point), `main()`, 조건문, 반복문

## 12일차(2021-07-13,화)
- 실전 프로젝트(eomcs-java-project)
	- 03-b. 메서드 사용법 : 메서드 활용

## 13일차(2021-07-14,수)
- 자바 기초 문법(eomcs-java/com.eomcs.lang)
	- ex07
		- 메서드 활용
		- call by value 와 call by reference
		- JVM의 메모리 영역: Method Area, JVM Stack, Heap
		- 클래스의 인스턴스 메모리
		
## 14일차(2021-07-15,목)
- 자바 기초 문법(eomcs-java/com.eomcs.lang)
	- ex07
		- 메서드에서 new 연산자를 사용하여 변수를 만들기: Heap 영역
		- 재귀호출과 스택 오버플로우
		- main() 메서드와 프로그램 아규먼트
		- JVM 아규먼트
- 알고리즘 (com.eomcs.algorithm)
	- quiz: Test001 ~ Test004

## 15일차(2021-07-16,금)
- 실전 프로젝트(eomcs-java-project)
	- 04-a. 클래스 사용법 : 메서드 분류
	- 04-b. 클래스 사용법 : 새 데이터 타입 정의 
	- 04-c. 클래스 사용법 : 패키지로 클래스 분류

## 16일차(2021-07-19,월)
- 실전 프로젝트(eomcs-java-project)
	- 04-d. 클래스 사용법 : 의존 관계
	- 05-a. 인스턴스 사용법 : 클래스 필드와 클래스 메서드의 한계
	- 05-b. 인스턴스 사용법 : 인스턴스 필드가 필요한 이유와 사용법

## 17일차(2021-07-20,화)
- 자바 객체지향 문법(eomcs-java/com.eomcs.oop)
	- ex02
		- 스태틱 필드, 인스턴스 필드, 로컬 변수 비교와 활용
		- 스태틱 메서드, 인스턴스 메서드 비교와 활용

## 18일차(2021-07-21,수)
- 자바 객체지향 문법(eomcs-java/com.eomcs.oop)
	- ex00: 스태틱 필드/인스턴스 필드, 스태틱 메서드/인스턴스 메서드
- 실전 프로젝트(eomcs-java-project)
	- 05-c. 인스턴스 사용법 : 인스턴스 메서드가 필요한 이유와 사용법
	- 06-a. CRUD 구현하기 : 게시글 상세보기/변경

## 19일차(2021-07-22,목)
- 자바 객체지향 문법(eomcs-java/com.eomcs.oop)
	- ex00: 스태틱 필드/인스턴스 필드, 스태틱 메서드/인스턴스 메서드 활용 연습
- 실전 프로젝트(eomcs-java-project)
	- 06-a. CRUD 구현하기(계속) : 게시글 삭제

## 20일차(2021-07-23,금)
- 실전 프로젝트(eomcs-java-project)
	- 06-a. CRUD 구현하기(계속) : 회원/프로젝트/작업 CRUD 완성
	- 06-b. CRUD 구현하기 : 리팩토링

## 21일차(2021-07-26,월)
- 자바 객체지향 문법(eomcs-java/com.eomcs.oop)
	- ex01: 객체지향 문법 개요
- 실전 프로젝트(eomcs-java-project)
	- 07-a. 의존 객체 다루기 : 인스턴스 필드에 직접 주입
	- 07-b. 의존 객체 다루기 : 생성자로 주입

## 22일차(2021-07-27,화)
- 자바 객체지향 문법(eomcs-java/com.eomcs.oop)
	- ex03: 인스턴스 멤버와 스태틱 멤버 사용법

## 23일차(2021-07-28,수)
- 자바 객체지향 문법(eomcs-java/com.eomcs.oop)
	- ex04: 인스턴스 멤버와 스태틱 멤버 활용예
	- ex05.a ~ g : 상속 문법

## 24일차(2021-07-29,목)
- 자바 객체지향 문법(eomcs-java/com.eomcs.oop)
	- ex05: h ~ * : 상속 문법(계속)
	- ex06: a ~ c : 다형성(다형적 변수, 오버로딩, 오버라이딩)

## 25일차(2021-07-30,금)
- 자바 객체지향 문법(eomcs-java/com.eomcs.oop)
	- ex06: c ~ * : 다형성(다형적 변수, 오버로딩, 오버라이딩)(계속)
	- ex08: a ~ b : 캡슐화(private, (default), protected, public)
- 실전 프로젝트(eomcs-java-project)
	- 07-a. 의존 객체 다루기 : 인스턴스 필드에 직접 주입
	- 07-b. 의존 객체 다루기 : 생성자로 주입

## 26일차(2021-08-02,월)
- 실전 프로젝트(eomcs-java-project)
	- 08-a. `Composite` 디자인 패턴 : 적용 전
	- 08-b. `Composite` 디자인 패턴 : 적용 후

## 27일차(2021-08-03,화)
- 실전 프로젝트(eomcs-java-project)
	- 08-b. `Composite` 디자인 패턴 : 적용 후(계속)
	- 08-c. `Composite` 디자인 패턴 : 익명 클래스 활용
	- 08-d. `Composite` 디자인 패턴 : 스태틱 멤버를 인스턴스 멤버로 전환

## 28일차(2021-08-04,수)
- 자바 객체지향 문법(eomcs-java/com.eomcs.oop)
	- 상속 관계가 있는 클래스의 레퍼런스와 인스턴스
- 실전 프로젝트(eomcs-java-project)
	- 09-a. 데이터 처리 코드를 캡슐화 : 캡슐화 전 - 배열 크기 변경
	- 09-b. 데이터 처리 코드를 캡슐화 : 캡슐화 전 - 연결리스트 적용

## 29일차(2021-08-05,목)
- 실전 프로젝트(eomcs-java-project)
	- 09-c. 데이터 처리 코드를 캡슐화 : 캡슐화 수행
	- 09-d. 데이터 처리 코드를 캡슐화 : 캡슐화 후 -  배열 크기 변경
	- 09-e. 데이터 처리 코드를 캡슐화 : 캡슐화 후 -  연결리스트 적용
	- 10-a. 리팩토링 : Generalization
	- 10-b. 리팩토링 : Generalization II

## 30일차(2021-08-06,금)
- 실전 프로젝트(eomcs-java-project)
	- 10-c. 리팩토링 : ArrayList를 직접 사용하기
	- 10-d. 리팩토링 : LinkedList를 직접 사용하기
	- 10-e. 리팩토링 : Generalization + 다형성 + 의존 객체 주입(Dependecy Injection)
	- 10-f. 리팩토링 : 메서드 이동
	- 10-g. 리팩토링 : 인터페이스 적용
	- 10-h. 리팩토링 : 세터(setter), 게터(getter) 적용

## 31일차(2021-08-09,월)
- 자바 객체지향 문법(eomcs-java/com.eomcs.oop)
	- ex07: 추상 클래스와 추상 메서드
- 자바 기본 클래스 사용법(eomcs-java/com.eomcs.basic)
	- ex01: Object 클래스 사용법

## 32일차(2021-08-10,화)
- 자바 기본 클래스 사용법(eomcs-java/com.eomcs.basic)
	- ex01: Object 클래스 사용법(계속)
	- ex02: String 클래스 사용법
- 프로젝트 팀 결정 및 A/B 반 결정
- 팀 프로젝트 절차 소개
	- 프로젝트 주제 선정
		- 1차: 두 개 주제를 선정해서 소개
			- 프로젝트 설명(PPT)
				- 프로젝트명
				- 현황 및 문제점: 현재 해당 업무나 일을 처리하는 상황과 그에 따른 불편한 점
				- 해결방안 및 이점: 어떻게 해결할 것인지에 대한 목표와 그에 따른 사용자의 이점
			- UI 프로토타입 작성
				- 무료 웹 서비스를 이용하여 UI 프로토타입 작성
				- 프로젝트로 만들려는 서비스를 분명하게 공유하기 위함
		- 2차: 한 개 주제를 선정해서 상세하게 소개
			- 프로젝트 설명 개정
				- 기존 설명 보완
			- UI 프로토타입 상세화 
				- 기존 UI 프로토타입 보완
	- 요구사항 정의
		- 액터 식별 및 정의
		- 유스케이스 식별 및 정의
		- 유스케이스 명세서 작성
	- DB 모델링
		- ER 다이어그램 작성
		- 데이터베이스 생성 및 테이블 생성
	- 구현 
		- 애플리케이션 구현
	- 발표

## 33일차(2021-08-11,수)
- 자바 기본 클래스 사용법(eomcs-java/com.eomcs.basic)
	- ex02: Wrapper, Date, Calendar 클래스 사용법
- 자바 객체지향 문법(eomcs-java/com.eomcs.oop)
	- ex09(a1 ~ c): 인터페이스 문법

## 34일차(2021-08-12,목)
- 자바 객체지향 문법(eomcs-java/com.eomcs.oop)
	- ex09(d ~ h): 인터페이스와 추상 클래스의 협업, 인터페이스 활용

## 35일차(2021-08-13,금)
- 자바 객체지향 문법(eomcs-java/com.eomcs.oop)
	- ex09(i ~ j): 인터페이스 활용
	- ex11(a ~ c:Exam0240): 중첩 클래스 사용법
	
## 36일차(2021-08-17,화)
- 자바 객체지향 문법(eomcs-java/com.eomcs.oop)
	- ex11(c:Exam0310 ~ e): 중첩 클래스, 로컬 클래스 사용법

## 37일차(2021-08-18,수)
- 팀 프로젝트 
	- 1차: 프로젝트 주제 발표
- 프로젝트 개발 방법론
	- 요구사항 식별 방법
		- 액터와 유스케이스 식별 방법

## 38일차(2021-08-19,목)

- 프로젝트 개발 방법론
	- 요구사항 식별 방법
		- 액터와 유스케이스 식별 방법(계속)
- 실전 프로젝트(eomcs-java-project)
	- 10-i. 리팩토링 : 추상 클래스 적용
	- 11-a. 자료 구조 다루기 : 스택 구현과 사용

## 39일차(2021-08-20,금)

- 실전 프로젝트(eomcs-java-project)
	- 11-b. 자료 구조 다루기 : 리팩토링 - 클래스 및 패키지 이동
	- 11-c. 자료 구조 다루기 : 제네릭이 필요한 이유와 사용법
	- 11-d. 자료 구조 다루기 : 자바 컬렉션 API 사용하기
- 프로젝트 개발 방법론
	- 요구사항 식별 방법
		- 액터와 유스케이스 식별 방법(계속)
- 과제
	- com.eomcs.algorithm.data_structure 패키지의 예제를 학습
	- 각 스텝의 예제 파일을 따라하면서 학습할 것.
- 팀 프로젝트
	- 요구사항 정의: Usecase Model
		- 액터 다이어그램
		- 유스케이스 다이어그램
		- 핵심 유스케이스의 UI 프로토타입

## 40일차(2021-08-23,월)

- 제네릭 문법(eomcs-java/com.eomcs.generic)
	- ex01 ~ ex02: 제네릭 사용법
- 자바 컬렉션 API(eomcs-java/com.eomcs.basic)
	- ex03: ArrayList 사용법
- 자바 객체지향 문법(eomcs-java/com.eomcs.oop)
	- ex12(Exam0110 ~ Exam0160): 람다(lambda) 기본 사용법
- 팀 프로젝트
	- 요구사항 정의: Usecase Model(계속)

## 41일차(2021-08-24,화)

- 자바 객체지향 문법(eomcs-java/com.eomcs.oop)
	- ex12(Exam0210 ~ ): 람다(lambda) 기본 사용법
- 자바 컬렉션 API(eomcs-java/com.eomcs.basic)
	- ex03: ArrayList 사용법(계속)

## 42일차(2021-08-25,수)

- 자바 컬렉션 API(eomcs-java/com.eomcs.basic)
	- ex04 ~ ex06: LinkedList, Stack, Queue, Deque
- 팀 프로젝트 
	- 2차: 최종 프로젝트 주제 선정 발표 및 요구사항 모델 발표
		- 내용
			- 액터 다이어그램
			- 유스케이스 다이어그램
			- UI 프로토타입

## 43일차(2021-08-26,목)

- 자바 컬렉션 API(eomcs-java/com.eomcs.basic)
	- ex07 ~ ex08: HashSet, HashMap, Hashtable

## 44일차(2021-08-27,금)

- 팀 프로젝트 
	- 3차: 중간 구현 점검
- 실전 프로젝트(eomcs-java-project)
	- 12. 예외가 발생했을 때 시스템을 멈추지 않게 하는 방법

## 45일차(2021-08-30,월)

- 예외처리(eomcs-java/com.eomcs.exception)
- 실전 프로젝트(eomcs-java-project)
	- 13-a. 사용자 인증 : 로그인
	- 13-b. 사용자 인증 : 내 정보 보기 
	- 13-c. 사용자 인증 : 로그아웃
	- 13-d. 사용자 인증 : 로그인 여부에 따라 메뉴 출력 제어

## 46일차(2021-08-31,화)

- 예외처리(eomcs-java/com.eomcs.exception)(계속)
- 실전 프로젝트(eomcs-java-project)
	- 13-d. 사용자 인증 : 로그인 여부에 따라 메뉴 출력 제어(계속)
	- 13-e. 사용자 인증 : 로그인 정보 활용

## 47일차(2021-09-01,수)

- 실전 프로젝트(eomcs-java-project)
	- 14-a. `Command` 디자인 패턴 : 적용 전 문제점 확인
	- 14-b. `Command` 디자인 패턴 : 메서드를 객체로 분리
	- 14-c. `Command` 디자인 패턴 : 리팩토링
	- 14-d. `Command` 디자인 패턴 : 기능 추가를 통해 커맨드 패턴의 유용성 확인 

## 48일차(2021-09-02,목)

- 실전 프로젝트(eomcs-java-project)
	- 14-e. `Command` 디자인 패턴 : 인터페이스로 객체의 사용 규칙 통일
	- 14-f. `Command` 디자인 패턴 : `Map`으로 커맨드 객체 관리

## 49일차(2021-09-03,금)

- 실전 프로젝트(eomcs-java-project)
	- 15. 비트 연산자 활용: 메뉴 권한 관리
- 팀 프로젝트 
	- 4차: 중간 구현 점검

## 50일차(2021-09-06,월)

- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 51일차(2021-09-07,화)

- 실전 프로젝트(eomcs-java-project)
	- 16-a. 파일 입출력 다루기 : 바이너리 형식으로 데이터 입출력

## 52일차(2021-09-08,수)

- 자바 스트림 API(eomcs-java/com.eomcs.io)
	- ex01: File 클래스 사용법
	- ex02: FileInputStream/FileOutputStream 클래스 사용법
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 53일차(2021-09-09,목)

- 자바 스트림 API(eomcs-java/com.eomcs.io)
	- ex02: FileInputStream/FileOutputStream 클래스 사용법(계속)
	- ex03: FileReader/FileWriter 클래스 사용법
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 54일차(2021-09-10,금)

- 팀 프로젝트 
	- 팀별 프로젝트 구현
	- 5차: 중간 구현 점검
- 디자인 패턴(eomcs-java/com.eomcs.design_pattern)
	- decorator: 데코레이터 패턴 소개
- 자바 스트림 API(eomcs-java/com.eomcs.io)
	- ex04: FileInputStream/FileOutputStream 을 이용하여 객체의 필드 값 출력하기
	- ex05: FileInputStream/FileOutputStream 을 상속 받아서 기능을 확장하기

## 55일차(2021-09-13,월)

- 자바 스트림 API(eomcs-java/com.eomcs.io)
	- ex06: 버퍼를 활용하는 이유
	- ex07: 상속으로 기능을 확장하는 방식의 한계점 이해하기
	- ex08: 포함관계로 기능을 확장하기
	- ex09: 데코레이터 설계 패턴을 적용하기
	- ex10: 자바에서 제공하는 스트림 클래스 사용하기
	- ex11: 객체를 serialize/deserialize 하기
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 56일차(2021-09-14,화)

- 자바 스트림 API(eomcs-java/com.eomcs.io)
	- ex11: 객체를 serialize/deserialize 하기(계속)
	- ex12: 연습
	- ex13: 스트림 API를 사용하여 바이트 배열이나 스트링 버퍼에 출력하기
	- ex14: 입출력 예외처리
- 실전 프로젝트(eomcs-java-project)
	- 16-a. 파일 입출력 다루기 : 바이너리 형식으로 데이터 입출력(계속)
		- BufferedInputStream/BufferedOutputStream 클래스 사용하기
		- 제네릭 문법 활용하기
	- 16-b. 파일 입출력 다루기 : 텍스트 형식으로 데이터 입출력
		- FileReader/FileWriter 클래스 사용하기
		- BufferedReader/PrintWriter 데코레이터 클래스 사용하기
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 57일차(2021-09-15,수)

- 실전 프로젝트(eomcs-java-project)
	- 16-b. 파일 입출력 다루기 : 텍스트 형식으로 데이터 입출력(계속)
		- BufferedReader/BufferedWriter 데코레이터 클래스 사용하기
		- 리팩토링 : 'Information Expert' GRASP 적용
		- 리팩토링 : '메서드 추출'
		- 리팩토링 : 제네릭 적용

## 58일차(2021-09-16,목)

- JSON Open API 사용법(eomcs-java/com.eomcs.openapi.json)
	- Gson 라이브러리를 사용하여 JSON 문자열을 다루는 방법
- 실전 프로젝트(eomcs-java-project)
	- 16-b. 파일 입출력 다루기 : 텍스트 형식으로 데이터 입출력(계속)
		- 리팩토링 : Task 도메인 클래스에 CsvValue 인터페이스 적용
		- JSON 형식으로 데이터를 입출력하기

## 59일차(2021-09-17,금)

- 실전 프로젝트(eomcs-java-project)
	- 17-a. 메뉴 리팩토링: 상세보기에서 변경, 삭제 기능 수행하기
	- 17-b. 메뉴 리팩토링: Command 인터페이스의 execute()에 파라미터 넘기기
	- 17-c. 메뉴 리팩토링: Command 객체 간에 종속성 제거하기


## 60일차(2021-09-23,목)

- 실전 프로젝트(eomcs-java-project)
	- 18-a. `Observer` 디자인 패턴 : 옵저버 패턴이 필요한 이유
	- 18-b. `Observer` 디자인 패턴 : 옵저버 패턴으로 구조를 바꾸기
	- 18-c. `Observer` 디자인 패턴 : 옵저버로 파일 입출력 처리하기
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 61일차(2021-09-24,금)

- 실전 프로젝트(eomcs-java-project)
	- 19-a. 데이터 관리 서버 만들기 : 클라이언트/서버 프로젝트 준비
- 팀 프로젝트 
	- 팀별 프로젝트 구현
	- 6차: 중간 구현 점검

## 62일차(2021-09-27,월)

- 실전 프로젝트(eomcs-java-project)
	- 19-b. 데이터 관리 서버 만들기 : 간단한 메시지 송수신
	- 19-c. 데이터 관리 서버 만들기 : 사용자가 입력한 명령처리
	- 19-d. 데이터 관리 서버 만들기 : 프로토콜 정의 및 적용
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 63일차(2021-09-28,화)

- 실전 프로젝트(eomcs-java-project)
	- 19-e. 데이터 관리 서버 만들기 : 통신 기능을 캡슐화
	- 19-f. 데이터 관리 서버 만들기 : 파일 및 데이터 처리 기능을 서버로 이전
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 64일차(2021-09-29,수)

- 실전 프로젝트(eomcs-java-project)
	- 19-f. 데이터 관리 서버 만들기 : 파일 및 데이터 처리 기능을 서버로 이전(계속)
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 65일차(2021-09-30,목)

- 실전 프로젝트(eomcs-java-project)
	- 19-f. 데이터 관리 서버 만들기 : 파일 및 데이터 처리 기능을 서버로 이전(계속)
	- 19-g. 데이터 관리 서버 만들기 : 다중 클라이언트의 접속 처리(Stateful)
	- 19-h. 데이터 관리 서버 만들기 : 다중 클라이언트의 접속 처리(Stateless)
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 66일차(2021-10-01,금)

- 실전 프로젝트(eomcs-java-project)
	- 20-a. 데이터 처리 코드를 캡슐화하기 : DAO 클래스 도입
- 팀 프로젝트 
	- 팀별 프로젝트 구현
- 팀 프로젝트 
	- 팀별 프로젝트 구현
	- 7차: 중간 구현 점검
		
## 67일차(2021-10-05,화)

- DBMS(eomcs-docs)
	- DBMS 개요
	- MariaDB 설치 및 설정
	- SQL : DDL

- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 68일차(2021-10-06,수)

- DBMS(eomcs-docs)
	- SQL : DDL(계속)
	- SQL : DML
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 69일차(2021-10-07,목)

- DBMS(eomcs-docs)
	- SQL : DML(계속)
	- SQL : DQL
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 70일차(2021-10-08,금)

- DBMS(eomcs-docs)
	- SQL : DQL(계속)
	- JDBC 프로그래밍 개요
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 71일차(2021-10-12,화)

- DBMS(eomcs-java) : com.eomcs.jdbc
	- JDBC 프로그래밍: ex01 ~ ex02 
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 72일차(2021-10-13,수)

- DBMS(eomcs-java) : com.eomcs.jdbc
	- JDBC 프로그래밍: ex03 ~ ex04
		- Statement vs PreparedStatement
		- 자동 증가 PK 값 알아내기
		- 트랜잭션 다루기
- DB 모델링
	- ER-Diagram 도구 설치: exerd.com 에서 다운로드
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 73일차(2021-10-14,목)

- DB 모델링
	- DB 모델링 개요 및 실습
	- mini-pms DB 모델링 및 테이블 준비
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 74일차(2021-10-15,금)

- DB 모델링
	- 팀별 프로젝트의 DB 모델링 리뷰
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 75일차(2021-10-18,월)

- DB 모델링
	- 팀별 프로젝트의 DB 모델링 리뷰(계속)
- 실전 프로젝트(eomcs-java-project)
	- 21-a. 데이터 관리를 DBMS에게 맡기기 : JDBC API 사용
- 팀 프로젝트 
	- 팀별 프로젝트 구현

## 76일차(2021-10-19,화)

- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- JDBC 적용

## 77일차(2021-10-20,수)

- DBMS(eomcs-java) : com.eomcs.mybatis
	- Mybatis 퍼시스턴스 프레임어크 사용법: ex01 ~ ex03.c
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- Mybatis 퍼시스턴스 프레임워크 적용

## 78일차(2021-10-21,목)

- DBMS(eomcs-java) : com.eomcs.mybatis (계속)
	- Mybatis 퍼시스턴스 프레임어크 사용법: ex03.c ~ 
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- Mybatis 퍼시스턴스 프레임워크 적용

## 79일차(2021-10-22,금)

- DBMS(eomcs-java) : com.eomcs.mybatis (계속)
	- Mybatis 퍼시스턴스 프레임어크 사용법: ex03.c ~ 
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- Mybatis 퍼시스턴스 프레임워크 적용(계속): DAO 구현체를 자동으로 생성하는 방법

## 80일차(2021-10-25,월)

- 서블릿 프로그래밍(eomcs-java) : eomcs-servlet
	- 서블릿 프로그래밍 개요 및 실습
- 실전 프로젝트(eomcs-java-project)
	- 23-a. 웹 애플리케이션 서버 아키텍처로 전환하기 : Servlet 기술 도입
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- Mybatis 퍼시스턴스 프레임워크 적용(계속): DAO 구현체를 자동으로 생성하는 방법


## 81일차(2021-10-26,화)

- 서블릿 프로그래밍(eomcs-java) : eomcs-servlet
	- 서블릿 프로그래밍 개요 및 실습
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- 서블릿 기술 적용
- 실전 프로젝트(eomcs-java-project)
	- 23-a. 웹 애플리케이션 서버 아키텍처로 전환하기 : Servlet/JSP 기술 도입

## 82일차(2021-10-27,수)

- 서블릿 프로그래밍(eomcs-java) : eomcs-servlet
	- HTML 사용법
- 실전 프로젝트(eomcs-java-project)
	- 23-a. 웹 애플리케이션 서버 아키텍처로 전환하기 : Servlet/JSP 기술 도입(계속)
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- 서블릿 기술 적용(계속)

## 83일차(2021-10-28,목)

- 서블릿 프로그래밍(eomcs-java) : eomcs-servlet
	- JSP 프로그래밍
- 실전 프로젝트(eomcs-java-project)
	- 23-a. 웹 애플리케이션 서버 아키텍처로 전환하기 : Servlet/JSP 기술 도입(계속)
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- 서블릿 기술 적용(계속)

## 84일차(2021-10-29,금)

- 서블릿 프로그래밍(eomcs-java) : eomcs-servlet
	- JSP 프로그래밍
- 실전 프로젝트(eomcs-java-project)
	- 23-b. 웹 애플리케이션 서버 아키텍처로 전환하기 : MVC 패턴 적용
	- 23-c. 웹 애플리케이션 서버 아키텍처로 전환하기 : EL, JSTL 적용
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- MVC + EL + JSTL 기술 적용


## 85일차(2021-11-01,월)

- CSS(eomcs-java) : eomcs-servlet
	- CSS 사용법
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- MVC + EL + JSTL 기술 적용		

## 86일차(2021-11-02,화)

- 자소서 작성법

## 87일차(2021-11-03,수)

- CSS(eomcs-java) : eomcs-servlet
	- CSS 사용법(계속)
	- Bootstrap CSS 라이브러리 적용
- 실전 프로젝트(eomcs-java-project)
	- 23-d. 웹 애플리케이션 서버 아키텍처로 전환하기 : Bootstrap 적용
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- Bootstrap 기술 적용	

## 88일차(2021-11-04,목)

- javascript(eomcs-java) : eomcs-servlet
	- JavaScript 프로그래밍
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- Bootstrap 기술 적용

## 89일차(2021-11-05,금)

- javascript(eomcs-java) : eomcs-servlet
	- JavaScript 프로그래밍(계속)
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- 자바스크립트 기술 적용

## 90일차(2021-11-08,월)

- javascript(eomcs-java) : eomcs-servlet
	- JavaScript 프로그래밍(계속)
- 실전 프로젝트(eomcs-java-project)
	- 23-e. 웹 애플리케이션 서버 아키텍처로 전환하기 : JavaScript 적용 + POST + 필터 적용
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- 자바스크립트 기술 적용

## 91일차(2021-11-09,화)

- 서블릿 프로그래밍(eomcs-java) : eomcs-servlet
- 실전 프로젝트(eomcs-java-project)
	- 23-e. 웹 애플리케이션 서버 아키텍처로 전환하기 : JavaScript 적용 + POST + 필터 적용(계속)	
	- 23-f. 웹 애플리케이션 서버 아키텍처로 전환하기 : 템플릿 적용
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- 자바스크립트 기술 적용

## 92일차(2021-11-10,수)
- 서블릿 프로그래밍(eomcs-java) : eomcs-servlet
- 실전 프로젝트(eomcs-java-project)
	- 23-g. 웹 애플리케이션 서버 아키텍처로 전환하기 : get/post, 파일 업로드, 썸네일, 로그인/로그아웃 적용
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- 자바스크립트 기술 적용

## 93일차(2021-11-11,목)
- 서블릿 프로그래밍(eomcs-java) : eomcs-servlet
- 실전 프로젝트(eomcs-java-project)
	- 23-g. 웹 애플리케이션 서버 아키텍처로 전환하기 : get/post, 파일 업로드, 썸네일, 로그인/로그아웃, 쿠키 적용(계속)
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- 자바스크립트 기술 적용

## 94일차(2021-11-12,금)
- 서블릿 프로그래밍(eomcs-java) : eomcs-servlet
- 실전 프로젝트(eomcs-java-project)
	- 24-a. Spring WebMVC 프레임워크 도입하기 : 프레임워크 적용
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- 스프링 프레임워크 적용

## 95일차(2021-11-15,월)
- 스프링 프레임워크(eomcs-java-project) :
	- 프론트 컨트롤러 만들기
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- 스프링 프레임워크 적용

## 96일차(2021-11-16,화)
- 스프링 프레임워크(eomcs-java) : eomcs-spring-webmvc
	- 스프링 IoC 컨테이너 사용법
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- 스프링 프레임워크 적용
## 97일차(2021-11-17,수)
- 스프링 프레임워크(eomcs-java) : eomcs-spring-webmvc
	- 스프링 IoC 컨테이너 사용법(계속)
- 이수자평가
- 팀 프로젝트 
	- 팀별 프로젝트 구현
		- 스프링 프레임워크 적용

## 98일차(2021-11-18,목)
- 스프링 프레임워크(eomcs-java) : eomcs-spring-webmvc
	- 스프링 WebMVC 프레임워크 사용법
- 팀 프로젝트  
	- 팀별 프로젝트 구현
		- 스프링 프레임워크 적용

## 99일차(2021-11-19,금)
- 스프링 프레임워크(eomcs-java) : eomcs-spring-webmvc
	- 스프링 WebMVC 프레임워크 사용법
- 팀 프로젝트  
	- 팀별 프로젝트 구현
		- 스프링 프레임워크 적용

## 100일차(2021-11-22,월)
- 스프링 프레임워크(eomcs-java) : eomcs-spring-webmvc
	- 스프링 WebMVC 프레임워크 사용법
- 팀 프로젝트  
	- 팀별 프로젝트 구현
		- 스프링 프레임워크 적용


