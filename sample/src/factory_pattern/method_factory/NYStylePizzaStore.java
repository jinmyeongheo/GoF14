package factory_pattern.method_factory;

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
