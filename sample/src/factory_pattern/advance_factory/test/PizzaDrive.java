package factory_pattern.advance_factory.test;

import factory_pattern.advance_factory.ChicagoStylePizzaStore;
import factory_pattern.advance_factory.NYStylePizzaStore;
import factory_pattern.advance_factory.Pizza;
import org.junit.jupiter.api.Test;

public class PizzaDrive {

  @Test
  void test(){
    NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();
    ChicagoStylePizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();

    Pizza pizza = nyStylePizzaStore.orderPizza("cheese");
    System.out.println("뉴욕 스타일 pizza = " + pizza);

    pizza = chicagoStylePizzaStore.orderPizza("cheese");
    System.out.println("시카고 스타일 pizza = " + pizza);
  }

}
