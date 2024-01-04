package com.test.qusetion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q006 {
	public static void main(String[] args) throws IOException {
		
		/*
		사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
		- 세금: 수입의 3.3%
		
		1. 라벨 출력
		2. 입력 받기
		 - BufferedReader
		 - reader.readLine();
		3. 입력값으로 연산식 작성 = 입력한 금액 - 세금(수입의 3.3%)
		4. 출력
		*/
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("한달 수입 금액(원): ");
		
		String a = reader.readLine(); // "1000000" -> 1000000
		int month = Integer.parseInt(a);
		
		int tax = 33000; // 세금
		int after = month - tax; // 세후 금액
		
		
		System.out.printf("세후 금액(원): %,d원\r\n세금(원): %,d", after, tax);
		
	}

}
