package factory_pattern.advance_factory;

import factory_pattern.simple_factory.CheesePizza;
import factory_pattern.simple_factory.ClamPizza;
import factory_pattern.simple_factory.PepperoniPizza;

public class NYStylePizzaStore extends PizzaStore{

  @Override
  Pizza createPizza(String type) {
    if(type.equals("pepperoni")){
      return new NYStylePepperoniPizza();
    }
    else if(type.equals("clam")){
      return new NYStyleClamPizza();
    }
    else if(type.equals("cheese")){
      return new NYStyleCheesePizza();
    }else return null;
  }
}
