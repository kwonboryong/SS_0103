package com.test.qusetion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q003 {
	public static void main(String[] args) throws IOException {
		
		/*
		 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
		 - 사각형 넓이 = 너비 * 높이
		 - 사각형 둘레 = 너비 * 2 + 높이 * 2
		 
		 1. 라벨 출력
		 2. 입력 받기
		 - BufferedReader
		 - reader.readLine();
		 3. 입력값으로 연산식 작성
		 4. 출력
		 
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("너비(cm): ");
		
		String a = reader.readLine(); // "20" -> 20 (문자열 -> 숫자 = Integer.parseInt)
		int width = Integer.parseInt(a);
		
		
		System.out.print("높이(cm): ");
		
		String b = reader.readLine(); // "20"
		int height = Integer.parseInt(b);
		
		
		int extend = width * height;
		int circle = width * 2 + height * 2;
		
		
		System.out.printf("사각형의 넓이는 %d㎠입니다.\n", extend);
		System.out.printf("사각형의 둘레는 %dcm입니다.", circle);
		
	}
	
}
