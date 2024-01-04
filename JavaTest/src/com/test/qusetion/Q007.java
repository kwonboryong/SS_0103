package com.test.qusetion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q007 {
	public static void main(String[] args) throws IOException {
		
		/*
		 영문 소문자를 1글자 입력받은 후 대문자로 변환해서 출력하시오.
		 - 대문자와 소문자의 문자 코드값의 관계
		 
		 1. 라벨 출력
		 2. 입력 받기
		  - BufferedReader
		  - reader.readLine(); // 영소문자 유니코드
		 3. 변환 (영소문자 유니코드 -> 대문자 유니코드)
		 4. 출력
		 */

		// 소문자 a ~ z (97 ~ 122)
		// 대문자 A ~ Z (65 ~ 90)
		// 서로 32 차이
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("문자 입력: ");
		
		int code1 = reader.read(); // 유니코드로 저장 (%c로 출력)
		
		int big1 = code1 - 32;
		
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다.", code1, big1);
		
	}

}
