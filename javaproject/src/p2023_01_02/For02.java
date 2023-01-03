package p2023_01_02;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1~10까지 합은 구하는 프로그램을 작성하세요
		
		int sum = 0;  //지역변수(local variable)
		for(int i =1; i<=10; i++){
			sum = sum + i;  //sum += i;
		}
		System.out.println("sum=" + sum);
	}

}
