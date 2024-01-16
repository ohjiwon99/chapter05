package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex04 {

	public static void main(String[] args) throws IOException {

		// in
		InputStream in = new FileInputStream("C:\\javastudy\\MS949.txt");//데이터 보내기 인풋
		InputStreamReader isr = new InputStreamReader(in, "MS949");//번역기
		BufferedReader br = new BufferedReader(isr);//중간에 모아서 올리기 버퍼

		// out
		OutputStream out = new FileOutputStream("C:\\javastudy\\MS949-copy.txt");//내보내기 아웃풋
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");//번역기
		BufferedWriter bw = new BufferedWriter(osw);

		while (true) {
			String str = br.readLine();
			if (str == null) {

			}
			bw.write(str);
			bw.newLine();

			bw.close();
			br.close();
		}

	}
}
