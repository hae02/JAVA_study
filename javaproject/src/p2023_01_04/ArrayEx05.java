package p2023_01_04;

public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores;
		scores = new int[] { 83, 90, 87 };

		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합:" + sum1);

//		add메소드를 호출해서 리턴된 총점을 sum2에 저장
		int sum2 = add(new int[] { 83, 90, 87 }); // add메소드 호출
		System.out.println("총합:" + sum2); // 총합; 260
	} // main() end

//		사용자 정의 메소드: 합을 구해주는 역할
	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
