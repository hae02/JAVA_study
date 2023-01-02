package p2022_12_29;

import java.util.Scanner;

public class pr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3, max, min, a, b;
		System.out.println("정수 3개를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();  //스페이스바 or 엔터키로 구분함
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		a = (n1 > n2) ? n1 : n2;
		b = (n1 < n2) ? n1 : n2;
		max = (a > n3) ? a : n3; // 최대값
		min = (b < n3) ? b : n3; // 최대값

		System.out.println("max: " + max);
		System.out.println("min: " + min);


	}

}
