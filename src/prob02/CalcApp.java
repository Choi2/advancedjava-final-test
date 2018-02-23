package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		
		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
		int answer = 0;
		
		switch(operation.charAt(0)) {
			case '+':
				Arithmetic add = new Add();
				answer = add.calculate(a, b);
				break;
			case '-':
				Arithmetic sub = new Sub();
				answer = sub.calculate(a, b);
				break;
			case '*':
				Arithmetic mul = new Mul();
				answer = mul.calculate(a, b);
				break;
			case '/':
				Arithmetic Div = new Div();
				answer = Div.calculate(a, b);
				break;
		}
		
		System.out.println(answer);
	}
}
