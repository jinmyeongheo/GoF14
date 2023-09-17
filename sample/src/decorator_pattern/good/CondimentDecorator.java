package decorator_pattern.good;

public abstract class CondimentDecorator extends Beverage{

  Beverage beverage; // 각 데코레이터가 감쌀 음료, 어떤 음료든 감쌀 수 있도록 Beverage 슈퍼클래스 유형 사용
  public abstract String getDescription(); // 첨가물데코레이터에 설명 강제

}
