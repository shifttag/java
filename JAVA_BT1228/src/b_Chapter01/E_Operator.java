package b_Chapter01;

import java.util.Scanner;

// 자바의 연산자
//  : 산술 연산자, 대입 연산자, 비교 연산자, 논리 연산자, 삼항 연산자
public class E_Operator {

	public static void main(String[] args) {

//		1. 산술 연산자

//		- 덧셈 연산자 (+) : 좌항에 우항을 더한 값은 반환
		int addResult = 8 + 3;
		System.out.println(addResult);

//		- 뺄셈 연산자 (-) : 좌항에 우항을 뺀 값을 반환
		int minusResult = 8 - 3;
		System.out.println(minusResult);

//		- 곱셈 연산자 (*) : 좌항에 우항을 곱한 값을 반환
		int multiResult = 8 * 3;
		System.out.println(multiResult);

//		- 나눗셈 연산자 (/) : 좌항에 우항을 나눈 값은 반환
//		 : 나눈 결과의 몫을 저장
		int remainderResult = 8 / 3;
		System.out.println(remainderResult);

//		- 나머지 연산자 (%) : 좌항에 우항을 나눈 나머지를 반환
//		8 = 3 * 2(몫) + 2
		int remainderResult2 = 8 % 3;
		System.out.println(remainderResult2);

//		해당 수가 2의 배수인지를 확인
//		 : 해당 수를 2로 나누어서(%) 나머지가 0인 경우 확인 가능
		Scanner sc = new Scanner(System.in);
		int sc_number = sc.nextInt();
		if (sc_number % 2 == 0) {
			System.out.println("2의 배수이다");
		}

//		2. 증감 연산자
//		 : '변수' 그 자신에 1 증가 또는 감소
//		 : 상수에는 증감 연산자 사용x
		final int NUMBER = 10;
//		NUMBER++; - ERROR

//		- 증가 연산자 (++)
//		 : 연산자의 조항 혹은 우항의 값을 1 증가시킴
		int integer = 10;

		System.out.println(++integer); // 11 (증가 o)
//			: 변수명 앞에 증가 연산자 사용 시 해당 변수를 즉각 증가

		System.out.println(integer++); // 11 (증가 x)
//			: 변수명 뒤에 증가 연산자 사용 시 해당 변수를 다음 호출 시 증가
		System.out.println(integer); // 12

		integer++; // 12
		integer++; // 13
		++integer; // 15
		System.out.println(++integer); // 16

//		- 감소 연산자 (--)
//		 : 연산자의 조항 혹은 우항의 값을 1 감소시킴
		integer = 10;
		--integer; // 9 (즉각 감소)
		integer--; // 9 (다음 호출 시 감소)
		System.out.println(integer); // 8

		int num1 = 8;
		int num2 = 3;
		int sampleNumber = num1 / --num2; // 8 / 2
		System.out.println(sampleNumber); // 4

//		3. 대입 연산자
//		 : = 우항의 값을 좌항에 (누적)대입
//		 : 좌항의 변수에 좌항 변수와 우항을 연산한 결과를 대입

//		 = : 좌항에 우항을 대입
		int num = 10; // 10 이라는 값을 num(변수)에 대입

//		 += : 좌항에 우항을 더한값을 좌항에 대입
		num += 3; // num = num + 3; //13
//		 -= : 좌항에 우항을 뺀 값을 좌항에 대입
		num -= 6; // num = num - 6; //7
//		 *= : 좌항에 우항을 곱한 값을 좌항에 대입
		num *= 3; // num = num * 3; //21
//		 /= : 좌항에 우항을 나눈 값을 좌항에 대입
		num /= 5; // num = num / 5; //4
//		 %= : 좌항에 우항을 나눈 나머지를 좌항에 대입
		num %= 3; // num = num % 3; //1

		System.out.println(num);

//		 : 대입 연산자의 좌항에는 반드시 변수만 지정 가능

//		4. 비교 연산자
//		 : 좌항을 우항과 비교한 결과를 논리(true, false) 값으로 반환

//		 == : 좌항이 우항과 같다면 true, 다르면 false
		boolean bool1 = 10 == 12;
		System.out.println(bool1); // false

//		 != : 좌항이 우항과 다르다면 true, 같다면 false
		boolean bool2 = 10 != 12;
		System.out.println(bool2); // true

//		 > : 좌항이 우항보다 크면 true, 작으면 false
//		 >= : 좌항이 우항보다 크거나 같으면 true, 작으면 false
		boolean bool3 = 10 > 10; // false
		boolean bool4 = 10 >= 10; // true
		System.out.println(bool3);
		System.out.println(bool4);
		
//		< : 좌항이 우항보다 작으면 true, 크면 false
//		<= : 좌항이 우항보다 작거나 같으면 true, 크면 false
		boolean bool5 = 10 < 10;	//false
		boolean bool6 = 10 <= 10;	//true
		System.out.println(bool5);
		System.out.println(bool6);
		
//		5. 논리 연산자
//		 : 논리(boolean) 값을 연산하는 연산자

//		 &&(앰퍼샌드) : and 연산자 
//		 : 좌항과 우항이 모두 true일 때 true, 하나라도 false인 경우 false
		int andOper1 = 8;
		int andOper2 = 3;
		boolean andBool1 = (andOper1 > andOper2) && true;	//true
		boolean andBool2 = (andOper1 < andOper2) && true;	//false
		
		System.out.println(andBool1);	//true
		System.out.println(andBool2);	//false
		
//		 ||(vertical bar) : or 연산자
//		 : 좌항과 우항이 하나라도 true이면 true, 모두 false인 경우 false
		int orOper1 = 5;
		int orOper2 = 7;
		boolean orBool1 = (orOper1 < orOper2) || true;	//true
		boolean orBool2 = (orOper1 > orOper2) || true;	//true
		boolean orBool3 = (orOper1 > orOper2) || false;	//false
		
		System.out.println(orBool1);	//true
		System.out.println(orBool2);	//true
		System.out.println(orBool3);	//false
		
//		 ! : not 연산자
//		 : 논리값의 부정을 반환
		boolean notBool1 = true;
		boolean notBool2 = false;
		System.out.println(!notBool1);	//false
		System.out.println(!notBool2);	//true
		
	}

}
