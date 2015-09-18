package Comparison;

import java.util.Scanner;

/**
	 * 
	 * @file_name : Iftest3Demo.java
	 * @author    : markks@naver.com
	 * @date      : 2015. 9. 17.
	 * @story     : 1등 구하기
	 */
public class Iftest2Demo {		
	/**
	 * To. 박광석님
	 * 프로그램을 하나 개발해야 합니다.
	 * 교수는 3명의 이름과 각 학생 평균을 입력하면 1등을 알려주는 기능을 추가해 달라고 합니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 1등은 김유신이다.
	 * 단) 학생은 총 3명입니다. 그리고 평균점수는 0이상 100 이하입이다.
	 * 교수가 실수로 120점이라든지 하는 범위 밖 점수를 입력하면 "다시 입력하세요"
	 * 라고 알려주시길 바랍니다.
	 * 동점자는 없다.
	 *
	 */
	
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1번 학생의 이름을 입력하세요");
			String name1 = scanner.next();
			System.out.println("1번 학생의 평균을 입력하세요");
			int avg1 = scanner.nextInt();
			
			System.out.println("2번 학생의 이름을 입력하세요");
			String name2 = scanner.next();
			System.out.println("2번 학생의  평균을 입력하세요");
			int avg2 = scanner.nextInt();
			System.out.println("3번 학생의 이름을 입력하세요");
			String name3 = scanner.next();
			System.out.println("3번학생의 평균을 입력하세요");
			int avg3 = scanner.nextInt();
						
			if(avg1>100 || avg1<0 ||avg2>100 || avg2<0 ||avg3>100 || avg3<0 ){
				System.out.println("안됨");
			}
			else if (avg1>avg2 && avg1>avg3){
				System.out.println("1등은 : " + name1);
			}else if(avg2>avg3){
				System.out.println("1등은 : " + name2);
			}else{System.out.println("1등은 : " + name3);}	
		
	
			
		}

}
