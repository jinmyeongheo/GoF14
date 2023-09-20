package factory_pattern.simple_factory.test;

import factory_pattern.simple_factory.Pizza;
import factory_pattern.simple_factory.PizzaStore;
import factory_pattern.simple_factory.SimplePizzaFactory;
import org.junit.jupiter.api.Test;

public class PizzaDrive {

  @Test
  void test(){
    PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

    // 주입된 피자팩토리를 통해 피자가 생성된다.
    Pizza pizza = pizzaStore.orderPizza("cheese");
  }

}
