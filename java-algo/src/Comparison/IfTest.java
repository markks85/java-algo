package Comparison;

import java.util.Scanner;

/**
	 * 
	 * @file_name : IfTest.java
	 * @author    : markks@naver.com
	 * @date      : 2015. 9. 17.
	 * @story     : 성적표 프로그램
	 */
public class IfTest {	
	/**
	 * To. 박광석님
	 * 프로그램을 하나 개발해야 합니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 교수는 학생과 국어, 영어, 수학점수만 입력하면
	 * 총점, 평균, 합격여부가 출력되는 프로그램 입니다.
	 * 
	 * 학생 	국어 		영어 		수학 		총점 		평군 		합격여부
	 * ===================================================
	 * 홍길동 90		90		90		90		90		(장학생)
	 * 
	 * 합격여부는 다음과 같다고 합니다.
	 * 평균아 90점 이상이면 장학생
	 * 70점 이상 90점 미만이면 합격
	 * 70미만이면 불합격이라고 합니다.
	 * 단) 평균에서 소수점 이하는 절삭입니다.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생의 이름을 입력해 주세요");
		String name = scanner.nextLine();
		System.out.println("국어점수를 입력해주세요");
		int kor =scanner.nextInt();
		System.out.println("영어점수를 입력해주세요");
		int eng =scanner.nextInt();
	    System.out.println("수학점수를 입력해주세요");
	    int math = scanner.nextInt();
	    int sum = kor+eng+math;
	    int avg = sum/3;
	    String suc;
	    
	   if (avg>=90) {
	   	suc ="장학생";
		}
	   else if (avg>=70) {
	   	suc ="합격";
		}
	   else  {
	   	suc ="불합격";
	   }
	    	
	    
		System.out.println( "학생 	    국어 	      영어 			수학 			총점 	  	평균		합격여부             ");
		System.out.println("===================================================================       ");
		System.out.println( name+"\t\t"+kor+"\t\t"+eng+"\t\t"+math+"\t\t"+sum+"\t\t"+avg+"\t\t"+suc );
	}

}
