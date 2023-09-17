package decorator_pattern.good;

public class Mocha extends CondimentDecorator{

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", 모카";
  }

  @Override
  public double cost() {
    // 모카를 추가한 가격
    return beverage.cost() + 0.20;
  }
}
