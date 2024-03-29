package c_Chapter02;

// 중첩된 반복문 = nested loop (이중 for문)

// 중첩 루프
// : 반복문 안에 또 다른 반복문이 있는 구조
// : 각 반복마다 내부 루프가 전체를 완전히 반복
public class E_NestedLoop {

	public static void main(String[] args) {
		// 기본 구조
//		for(초기화1 ; 조건1 ; 증감1) {
//			for(초기화2 ; 조건2 ; 증감2) {
//				// 중첩 루프 내부의 명령문
//			}
//			// 외부 루프 내부의 명령문
//		}

		// 중첩 루프 예제
		// : 5 * 5 별 찍기
		
		// 외부 루프 : 0부터 4까지 반복(5번)
		for(int i = 0; i < 5; i ++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		// 중첩 for문을 사용하여 구구단 출력
		// 2단 부터 9단 까지 반복
		System.out.println("구구단");
		for(int i = 1; i<= 9; i++) {	//각 단마다 1부터 9까지 반복
			for(int j = 1; j <=9; j++) {
				System.out.print(i*j + "  ");
				if((i*j)/10 == 0) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// 중첩 for문을 사용하여
		// *
		// **
		// ***
		// ****
		// *****
		System.out.println("별 찍기 예제 1");
		for(int i = 1 ; i <= 5 ; i ++) {
			for(int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		// 별 찍기 연습문제
		// 1.
		// *****
		// ****
		// ***
		// **
		// *
		System.out.println("별 찍기 예제 2");
		for(int i = 0 ; i < 5 ; i ++) {
			for(int j = 5; j > i ; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// 2. 
		//   *  
		//  *** 
		// *****
		System.out.println("별 찍기 예제 3");
		for(int i = 1; i <= 3 ; i++) {
			for(int j = 3; j > i ; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < (2*i)-1 ; k++ ) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
	}

}
