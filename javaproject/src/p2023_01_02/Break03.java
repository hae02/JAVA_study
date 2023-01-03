package p2023_01_02;

public class Break03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		while (true) {
			i++;
			int num = (int) (Math.random() * 6) + 1; // 난수발생: 1~6
			System.out.println(num);
			
			if (num == 6)
				break;  // 무한 루프를 빠져나옴
			
		}
		System.out.println("루프횟수:" + (i-1));
		System.out.println("프로그램 종료");
	}

}
