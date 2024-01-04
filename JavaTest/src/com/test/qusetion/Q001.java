package com.test.qusetion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q001 {
	public static void main(String[] args) throws IOException {
		
		/* 문제 1 : 태어난 년도를 입력받아 나이를 출력하시오.
		입력 - 태어난 년도: 1999 
		출력 - 나이: 25세
		
		시나리오
		1. 라벨 출력
		2. 입력 받기
		2-1. BufferedReader
		2-2. reader.readLine();
		3. 문자열 -> 숫자로 변환
		4. 출력
		
		*/
		
		System.out.print("태어난 년도를 입력하세요: ");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String a = reader.readLine(); // "1999" -> 1999
		int bornYear = Integer.parseInt(a);
		
		int thisYear = 2024;
		
		int age = thisYear - bornYear;

		
		System.out.printf("나이는 %d세 입니다.", age);
		
	}

}
