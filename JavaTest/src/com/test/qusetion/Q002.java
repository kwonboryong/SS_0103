package com.test.qusetion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q002 {
	public static void main(String[] args) throws IOException {
		
		/* 문제 2: 숫자 2개를 입력받아 아래의 연산식을 출력하시오.
		1. 라벨 출력
		2. 입력 받기
		- BufferedReader
		- reader.read / readLine
		3. 입력값으로 연산식 작성
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("첫 번째 숫자: ");
		
		String fisrt_num = reader.readLine();
		int num1 = Integer.parseInt(fisrt_num);
		
		
		System.out.print("두 번째 숫자: ");
		
		String second_num = reader.readLine();
		int num2 = Integer.parseInt(second_num);
		
		
		int plus = num1 + num2;
		int minus = num1 - num2;
		int multiply = num1 * num2;
		double division = (double)num1 / num2; // ㅠ
		int remainder = num1 % num2;
		
		
		System.out.printf("%,d + %,d = %,d\n", num1, num2, plus);
		System.out.printf("%,d - %,d = %,d\n", num1, num2, minus);
		System.out.printf("%,d * %,d = %,d\n", num1, num2, multiply);
		System.out.printf("%,d / %,d = %,.1f\n", num1, num2, division);
		System.out.printf("%,d %% %,d = %,d", num1, num2, remainder);
		
	}

}
