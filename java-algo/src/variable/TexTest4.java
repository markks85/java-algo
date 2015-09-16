package variable;

import java.util.Scanner;

public class TexTest4 { 	
	public static void main(String[] args) {
	final int ONE_HUNDRED = 100;
	final double TAX_RATE = 9.7;
	System.out.println("이름을 입력해주세요");
	Scanner scanner = new Scanner(System.in);
	String name = scanner.next();
	System.out.println("연봉을 입력하세요");
	int salary = scanner.nextInt();
	int tax = (int) (salary * TAX_RATE);
	System.out.println(name+"씨가 납부할 세금은"+tax+" 입니다.");
}

}
