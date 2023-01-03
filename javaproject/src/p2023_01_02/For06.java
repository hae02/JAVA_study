package p2023_01_02;

public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		구구단(2~9단)을 출력하는 프로그램을 작성하세요

		for (int dan = 2; dan <= 9; dan++) { // 단
			System.out.println("[" + dan + "단]");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
			} // 다중for문
			System.out.println(); // 각단 줄간격 벌리기
		}
	}

}
