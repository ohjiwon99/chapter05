package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneBookApp {

	public static void main(String[] args) throws IOException {

		// Reder준비
		// 리더+버퍼-->빨대 PhoneDB.txt UTF-8

		Reader fr = new FileReader("C:\\javastudy\\PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(fr);

		// String str = br.readLine();

		// 반복
		while (true) {
			// 파일을 한줄씩 읽는다.
			String str = br.readLine();

			// null이면 반목문을 나간다.(글자가 없으면)
			if (str == null) {
				break;

			}

			String[] personInfo = str.split(",");
			// 이효리,010-2222-3333,031-2323-4441
			// ["이효리"]["010-2222-3333"]["031-2323-4441"]-->personInfo

			/*
			 * System.out.println(personInfo[0]); 
			 * System.out.println(personInfo[1]);
			 * System.out.println(personInfo[2]);
			 */ // 변수에 담음

			String name = personInfo[0];
			String hp = personInfo[1];
			String compony = personInfo[2];

			// 출력한다.
			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + compony);
			System.out.println("");

			// input파일을 한줄 읽는다.

			// ,로 분리한다
			// --> name=정우성
			// hp=010-0000-1111
			// company=010-2222-2222

			// 출력한다

			// null이면 반복종료
			
		}
		br.close();
	}
}