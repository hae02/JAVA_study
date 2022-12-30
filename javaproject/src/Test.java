import java.util.Date;
import java.util.Random;


public class Test {
//접근제어자(접근지정자)

//main()메소드는 자바가상머신(JVM,java.exe)이 가장 먼저 호출하는 메소드이다.
//1개의 클래스가 독립적으로 실행되기 위해서는 반드시 main메소드가 필요하다.
	public static void main(String[] args) {
	//접근제어자  공유           main메소드	
		
		// TODO Auto-generated method stub
		System.out.println("자바출력 성공");
		System.out.print("자바");
		System.out.print("오라클");
		
		Date d = new Date();
		System.out.println(d);
		//데이터 util패키지 import 해야함
		
		Random r = new Random();
		System.out.println(r.nextInt(10));// 정수형태 난수 0~9
		//util패키지 improt 해야함
		
	}
	
}

//단축키
//자동 정렬: ctrl + shift + F
// 자동 import: ctrl + shift + o                                                                                                                                                                                                                                o