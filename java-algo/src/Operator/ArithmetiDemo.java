package Operator;
	/**
	 * 
	 * @file_name : ArithmetiDemo.java
	 * @author    : markks@naver.com
	 * @date      : 2015. 9. 16.
	 * @story     : [COOKBOOK-java5.0] p91-2 단항연산자 예제
	 */
public class ArithmetiDemo {	
	public static void main(String[] args) {
		int a  = 10, b = 20;
		System.out.println(++a);
		System.out.println(++a + b++);
		System.out.println((++a%3)+(a*++b));
		
		//프로그래밍에서 나눗셈은 두가지 결과값을 가진다
		//하나는 몫만 취하는 것이고, 다른 하나는 나머지 값만 취한다.
	}
	

}
