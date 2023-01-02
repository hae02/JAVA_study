package p2022_12_29;

import java.util.Scanner;

public class pr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3, max, min, a;
		System.out.println("정수 3개를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();  //스페이스바 or 엔터키로 구분함
		n2 = sc.nextInt();
		n3 = sc.nextInt();
	
		
		if(n1>n2) {
			a = n1;
		}
		else {
			a = n2;	
		}
		if(a>n3) {
			max = a;
		}
		else {
			max = n3;
			
		}
		if(n1<n2) {
			a = n1;
		}
		else {
			a = n2;	
		}
		if(a<n3) {
			min = a;
		}
		else {
			min = n3;
			
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);

		
		

	}

}
