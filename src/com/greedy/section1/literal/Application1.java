package com.greedy.section1.literal;

public class Application1 {

	public static void main(String[] args) {
	
		/*여러 가지 값으 형태 출력*/
		/*1. 숫자
		  *	1-1 정수
		  *	1-2 실수
		 *2. 문자
		 *3. 문자열
		 *4. 논리 
		 */
		
		/*1. 숫자 형태의 값 출력*/
		/*1-1 정수 형태의 값 출력*/
		System.out.println(123); 		/*syso system.out.println(); 단축키*/
		
		/*1-2. 실수 형태의 값 출력*/
		System.out.println(1.23);
		
		/* 2.문자 형태의 값 출력*/
		System.out.println('a'); //문자 형태의 값은 혿따음표(single-quotation)으로 감싸주어야 한다.
//		System.out.println('ab'); //두 개 이상은 문자로 취급하지 않기 떄문에 에라가 발생한다.
//		System.out.println('');		//아무 문자로 기록되지 않는 경우도 에러가 발생한다.
		System.out.println('1');  //숫자 값이지만 혿따음표로 감싸져 있는 경우 문자 '1'이라도 판단한다.
		
		/* 3.문자열 형태의 값 출력*/
		System.out.println("안녕하세요"); //문자열은 문자 여러 개가 나열된 형태를 말하며 쌍따음표(dubble-quotation)으로 감싸주어야 한다.
		System.out.println("123");	   //정수이지만 쌍따음표로 감싸져 있기 떄문에 문자열로 보아야 한다.
		System.out.println("");  	   //아무 값도 없는 빈 쌍따음표도 문자열로 취급한다.
		System.out.println("a");	   //한 개의 문자도 쌍따음표로 감싸면 문자열이다.(문자a와는다름)
		
		/* 4. 논리 형태의 값 출력*/
		System.out.println(true);
		System.out.println(false); 		//true 혹은 false 값을 논리형이라고 한다.
	}

}
