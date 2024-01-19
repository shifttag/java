package l_Chapter11;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

// 지역 내부 클래스(로컬 클래스)
// : 메서드 내부에 위치하는 클래스
// : 지역 변수와 같은 성질을 가짐 (매서드 내부에서만 한정적으로 사용)
// : 해당 메서드 실행 외에는 클래스 접근 및 사용 불가
// : >> 접근제한자와 static을 붙일 수 x
// : 메서드를 실행하는 동안만 인스턴스화되고 사용 가능

class Restaurant {
	// 레스토랑의 기본 메뉴
	String constantMenu;

	// 특정 호출이 아니면 사용 x
	// : 로컬 클래스는 특정 메서드 내에서만 의미, 그 범위를 벗어나면 존재 x
	void prepareSpecialMenu(String day) {
		class SpecialMenu {
			String menuName;

			SpecialMenu(String name) {
				this.menuName = name;
			}

			void display() {
				System.out.println("Today's special menu : " + menuName);
			}
		}

		// 로컬 클래스의 경우 해당 메서드 내에서 인스턴스화
		// 메서드의 동작 로직에 따라 인스턴스화가 진행되도록 설정
		if (day.equals("White Day")) {
			SpecialMenu special = new SpecialMenu("소고기");
			special.display();
		} else if (day.equals("Valentine Day")) {
			SpecialMenu special = new SpecialMenu("돼지고기");
			special.display();
		}
	}
}

public class D_LocalClass {
	public static void main(String[] args) {
		Restaurant myRestaurant = new Restaurant();
		myRestaurant.constantMenu = " 삼겹살 ";
//		myRestaurant.menuName; - Error

		myRestaurant.prepareSpecialMenu("Valentine Day");
		myRestaurant.prepareSpecialMenu("White Day");

	}
}
