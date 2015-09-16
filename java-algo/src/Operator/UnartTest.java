package Operator;
	/**
	 * 
	 * @file_name : UnartTest.java
	 * @author    : markks@naver.com
	 * @date      : 2015. 9. 16.
	 * @story     : 단항연산자 예제
	 */
public class UnartTest {	
	public static void main(String[] args) {
			
	/**
	 * 문제 : 정수형 변수 x=5, y=10, z=0 일 때
	 */
	int x = 5, y = 10, z = 0;
	// z= x후위 + x전위 + y후위 식을 연산자를 사용해서 완성하고
	// z의 결과 값을 출력하시오. 그리고 그 이유를 설명하시오.
//	
	System.out.println(x++);
	System.out.println(++x);
	z= (x++) + (++x) + (y++);
	System.out.println(z);
	
	}
	}