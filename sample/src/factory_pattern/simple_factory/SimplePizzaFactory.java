package factory_pattern.simple_factory;

public class SimplePizzaFactory {
  // 피자를 만들쟈!
  public Pizza createPizza(String type) {
    Pizza pizza = null;

  if(type.equals("pepperoni")){
    pizza = new PepperoniPizza();
  }
  else if(type.equals("clam")){
    pizza = new ClamPizza();
  }
  else if(type.equals("cheese")){
    pizza = new CheesePizza();
  }

  return pizza;
  }



}
