package template_method_pattern.ex1;

import java.util.Arrays;

public abstract class CaffeineBeverage {
  //음료를 만드는 알고리즘 템플릿
  // 템플릿 메서드
  final void prepareRecipe() { // 아무렇게나 오버라이드 못하도록 final 선언
    boilWater();
    brew();
    pourInCup();
    // 고객 요청이 있을 때만 호출 ⚓후크
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }

  // Coffee와 Tea에서 두 메소드를 서로 다른 방식으로 처리한다.
  // -> 추상 메소드로 선언
  // -> 서브클래스가 알아서 처리한다.
  abstract void brew();
  abstract void addCondiments();

  void boilWater() {
    System.out.println("물 끓이는 중");
  }

  void pourInCup() {
    System.out.println("컵에 따르는 중");
  }

  // ⚓후크
  // 별 내용이 없는 기본 메소드: true만 리턴
  // 서브클래스에서 필요할 때 오버라이드
  boolean customerWantsCondiments() {
    return true;
  }

  Arrays
}
