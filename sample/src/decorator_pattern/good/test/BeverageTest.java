package decorator_pattern.good.test;

import decorator_pattern.good.Beverage;
import decorator_pattern.good.Espresso;
import decorator_pattern.good.HouseBlend;
import decorator_pattern.good.Mocha;
import decorator_pattern.good.Soy;
import decorator_pattern.good.Whip;
import org.junit.jupiter.api.Test;

public class BeverageTest {

  @Test
  void test(){

    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $ " + beverage.cost());

    Beverage beverage2 = new HouseBlend();
    beverage2 = new Soy(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);

    System.out.println( beverage2.getDescription() + " $ " + beverage2.cost());
  }

}
