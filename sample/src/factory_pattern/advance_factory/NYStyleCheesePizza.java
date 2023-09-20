package factory_pattern.advance_factory;

public class NYStyleCheesePizza extends Pizza{

  public NYStyleCheesePizza() {
    name = "뉴욕 스타일 소스와 치즈 피자";
    dough = "씬 크러스트 도우";
    sauce = "마리나라 소스";

    toppings.add("잘게 썬 레지아놔 치즈");
  }

  @Override
  void prepare() {
    super.prepare();
  }

  @Override
  void bake() {
    super.bake();
  }

  @Override
  void cut() {
    super.cut();
  }

  @Override
  void box() {
    super.box();
  }
}
