package decorator_pattern.good;

public class Espresso extends Beverage{

  public Espresso() {
    super.description = "에스프레소";
  }

  @Override
  public double cost() {
    // 첨가물 가격고민 ㄴㄴ, 그냥 에스프레소 가격만 리턴하면 됩니당.
    return 1.99;
  }
}
