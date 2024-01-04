package com.test.qusetion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q004 {
	public static void main(String[] args) throws IOException {
		
		/*
		 섭씨 온도를 입력받아서 화씨 온도로 변환하시오.
		 - ℉ = ℃ × 1.8 + 32
		 - 소수 입력 가능
		 - 소수 이하 1자리까지 출력하시오.
		 
		 1. 라벨 출력
		 2. 입력 받기
		 - BufferedReader
		 - reader.readLine();
		 3. 입력값으로 연산식 작성 - ℉ = ℃ × 1.8 + 32
		 4. 출력
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("섭씨(℃): ");
		
		String a = reader.readLine(); // "29" -> 29 (문자열 -> 숫자 = Integer.parseInt)
		double celsius = Double.parseDouble(a); // 29
		
		double fahrenheit = celsius * 1.8 + 32;
		
		
		System.out.printf("섭씨는 %,.1f℃는 화씨 %,.1f℉입니다.", celsius, fahrenheit);
		
	}

}
