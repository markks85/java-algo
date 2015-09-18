package Comparison;

import java.util.Scanner;

/**
  * 
  * @file_name : IfDemo.java
  * @author    : markks@naver.com
  * @date      : 2015. 9. 17.
  * @story     :
  */
public class IfDemo {	
	public static void main(String[] args) {
		/**
		 * 변수명은 num
		 * 컨디션은 10 이상이면
		 * 입력한 수는 10 이상입니다.
		 * 
		 * 
		 */
		/**
		 * continue, break(스위치 문에서만 사용, return(스위치 문을 제외한 나머지 구문에서 end)
		 */
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("판별하려는 숫자를 입력하세요");
		
		//int num = scanner.nextInt();
		//System.out.println("기준값을 입력하세요");
		//int g = scanner.nextInt();
		
		//if (num > g){
		//	System.out.println("입력한 수는 기준값 초과입니다.");
		//	}
		//else if (num == g ) {
		//	System.out.println("입력한 수는 기준값과 같습니다.");
		//}
		//else {
		//	System.out.println("입력한 수는 기준값 미만입니다.");
		//}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("판별하는 숫자를 입력하세요");
		
		int num = scanner.nextInt();
		System.out.println("기준값을 입력하세요.");
		int g = scanner.nextInt();
		
		if (num>g) { System.out.println("입력한 수는 기준값 미만입니다.");}
		else if (num==g){System.out.println("입력한 수는 기준값과 같습니다.");}
		else {System.out.println("입력한 수는 기준값을 초과합니다.");}
				
			
			
			
			
			
			
			
			
			
			
			
			
		//else if(num == 10){
		//		System.out.println(num+"은"+gijun+ "초과입니다.");}
		//else(num == 10) {
		//		System.out.println(num+"은"+gijun+ "초과입니다.");}
				
		}
	}

