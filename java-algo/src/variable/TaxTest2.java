package variable;

import java.util.Scanner;

public class TaxTest2 {
	public static void main(String[] args) {
		final int ONE_HUNDRED = 100;
		final double  TAX_RATE = 9.7;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scanner.next();
		System.out.println("연봉을 입력하세요");
		int salary = scanner.nextInt();
		
		int tax = (int) (salary * TAX_RATE);
		System.out.println(name+"씨가 내야 할 세금은"+tax+"만원입니다");
		final int ONE = 1;
		String str = "str";
	}
}
