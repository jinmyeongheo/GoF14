package template_method_pattern.ex1;

public class Tea extends CaffeineBeverage {
  //서브클래스에서 알고리즘 구현
  public void brew() {
    System.out.println("찻잎을 우려내는 중");
  }
  public void addCondiments() {
    System.out.println("레몬 추가 중");
  }
}
