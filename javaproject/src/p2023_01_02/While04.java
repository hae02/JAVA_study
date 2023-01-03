package p2023_01_02;

import java.util.Scanner;

public class While04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		while문을 이용해서 구구단(2~9단)을 출력하는 프로그램을 작서하세요

		int dan = 2, i=1;
		while (dan <= 9) {
			System.out.println("[" + dan + "단]");
			i=1;
			while (i <= 9) {
				System.out.println(dan + "*" + i + "=" + dan * i);
				i++; // 증감식
				
			}
			dan++;
			System.out.println();
		}
	}
}
