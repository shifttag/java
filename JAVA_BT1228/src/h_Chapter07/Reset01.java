package h_Chapter07;

// 변수의 초기화
// : 변수를 선언하고 처음으로 값을 저장하는 것
// : 가능하면 선언과 동시에 적절한 값으로 초기화 하는 것을 권장

// 인스턴스 변수는 초기화 하지 않아도 자동으로 변수의 자료형에 맞는 기본값으로 초기화가 이루어짐
// >> 초기화 필수 x

// 지역 변수는 사용하기 전에 반드시 초기화해야 한다.

// 멤버변수 (클래스 변수와 인스턴스 변수)와 배열의 초기화는 선택
// 지역 변수의 초기화는 필수

// 각 타입의 기본값
// boolean - false, int - 0, char - '\u0000'(공백)
// byte, short - 0
// long - 0L
// float - 0.0f
// double - 0.0 또는 0.0d
// 참조형 - null
class Text{
	// 멤버 변수
	// : 인스턴수 변수, 클래스 변수
	// 1. 클래스 변수 초기화 > 인스턴스 변수 초기화
	// 2. 자동 초기화 > 명시적 초기화 > 초기화 블럭, 생성자
	
	// (명시적) 초기화
	int number = 4;
	String message = "Hello";
	
	// 초기화 블럭
	// : 클래스 초기화 블럭, 인스턴스 초기화 블럭
	// 인스턴스 초기화 블럭 - 클래스 내에 블럭 {} 만들고 그 안에서 코드 작성
	// 클래스 초기화 블럭 - 인스턴스 최고하 블럭 형태 앞에 static 키워드 작성
	{
		System.out.println("{ }");	// 인스턴스 초기화 블럭
	}
	static {
		System.out.println("Static { }");	// 클래스 초기화 블럭
	}
	Text(){
		System.out.println("생성자");
	}
	
	// 인스턴스 변수
	int x;
	int y = x;	// x는 초기화 하지 않아도 int형의 기본값인 0으로 초기화
	
	void method () {
		int i;	// 선언 가능 (사용하기 전)
//		int j = i;	// i변수를 사용하기 전에 초기화 하지 않아 오류 -Error
	}
}
public class Reset01 {
public static void main(String[] args) {
	// 클래스 초기화 블럭이 가장 먼저 수행
	// main 메서드 수행으로 인한 인스턴스 초기화 블럭 수행
	// 마지막으로 생성자 수행
	Text test1 = new Text();
	
	// 클래스 초기화 블럭은 처음 메모리에 로딩될 때 한번만 수행
	// 인스턴스 초기화 블럭은 인스턴스가 생성될 때마다 수행
	Text test2 = new Text();
}
}
