package com.test.qusetion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q005 {
	public static void main(String[] args) throws IOException {
		
		/*
		자전거의 바퀴는 지름(직경)이 26인치이다. 
		사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
		1. 라벨 출력
		2. 입력 받기
		 - BufferedReader
		 - reader.readLine();
		3. 입력값으로 연산식 작성 - 원둘레 = 2 * π * 반지름(13): 81.681.4089933
		4. 결과값 단위 변경 (인치 -> 미터)
		5. 출력
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("사용자가 페달을 밟은 횟수: ");
		
		String a = reader.readLine(); // "1000" -> 1000 (문자열 -> int형)
		int count = Integer.parseInt(a);
		
		double num = (2 * 3.1415926535 * 13) * count; // 원둘레 * 횟수
		double meter = num * 0.0254; // 인치 -> 미터 단위 변경
		
		
		System.out.printf("사용자가 총 %,d회 페달을 밝아 자전거가 총 %,.3fm를 달렸습니다.", count, meter);
		
	}

}
