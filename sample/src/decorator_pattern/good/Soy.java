package decorator_pattern.good;

import com.sun.crypto.provider.PBEWithMD5AndDESCipher;

public class Soy extends CondimentDecorator{

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.50;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", 두유";
  }
}
