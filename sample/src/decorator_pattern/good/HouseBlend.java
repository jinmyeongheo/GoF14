package decorator_pattern.good;

public class HouseBlend extends Beverage{

  public HouseBlend() {
    super.description = "하우스 블랜드 커피";
  }

  @Override
  public double cost() {
    return 0.89;
  }
}
