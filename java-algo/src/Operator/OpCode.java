package Operator;	
	/**
	 * 
	 * @file_name : OpCode.java
	 * @author    : markks@naver.com
	 * @date      : 2015. 9. 16.
	 * @story     : 연산자 문법		
	 */

public class OpCode {	
	public static void main(String[] args) {
		/**
		 *  && : 둘다 참일 때
		 *  || : 둘 중 하나만 참일 때
		 */
		int a, b, c; // 타입이 동일한 변수를 선언할 때 묶음처리 가능
		a = b = 10;
		a = b = 10;
		c =  a + b;
		System.out.println("결과 값");
	}

}
