package a_basic;

// 주석 처리된 부분
// : 코드에 대한 설명과 메모를 담당하는 기능
// : 주석은 따옴표 안에 작성할 경우 주석으로 인식되지 X
// : 단축키 - ctrl + / 
/*
 이것은
 여러줄
 주석입니다
 */
// 자바 프로그램의 기본 구조
// 클래스 > 메서드 > 실행문
public class A_Hellojava1 {
// 메서드의 시작
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바 기본 문법
		// 실행문을 끝낼 때는 항상 세미클론(;) 작성

		// 자바의 중괄호 사용은 클래스, 메서드의 구조를 작성하는 기호
		// 항상 열리는 중괄호와 닫히는 중괄호가 세트

		// 프로그램에게 해당 실행문이 종료되었음을 알려주는 기호
		// 컴퓨터에게 전달할 명령(실행문)을 작성
		// - 자바의 출력
		System.out.println("Hello JAVA!!");
		System.out.println("Hello Coding");

		// 자바 파일 실행 전 반드시 저장 - 단축키 : ctrl + s

		// 이클립스 단축키
		// 1. 자바 실행 : ctrl + f11 or f11
		// 2. 행 이동 : alt + 방향키(위, 아래)
		// 3. 단어간 커서 이동 : ctrl + 방향키(좌, 우)
		// 4. 자바 자동 완성 : ctrl + space
		// 5. 자동 형식 맞추기 : ctrl + shift + f
		// 6. 줄 복사 : ctrl + alt + 방향키(위, 아래)
		// 7. 들여쓰기 : tap
		// 8. 반대로 들여쓰기 : shift + tap
		
		int A=1, B=2, C;
		C = A+B;
		System.out.print("A+B = ");
		System.out.println(C);

	
	}

}
