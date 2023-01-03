package p2023_01_02;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		키보드로 입력한 구구단 1개단을 while문으로 출력하는 프로그램을 작성하세요
		
		int i = 1;  //초기값
		System.out.println("원하는 단을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();

		while (i < 9) {  //조건식
			System.out.println(dan + "*" + i + "=" + dan * i);
			i++;  //증감식
		}  
	}

}
