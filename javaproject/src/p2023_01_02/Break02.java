package p2023_01_02;

public class Break02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//무한루프: while문
//break: 반복문을 빠져나오는 역할

		int i = 1;
		while (true) {
			System.out.println(i + "무한출력");
			if(i==100)
				break;
			i++;
		}

	}

}
