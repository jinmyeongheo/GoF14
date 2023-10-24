package factory_pattern.method_factory;

public class ChicagoStylePizzaStore extends PizzaStore{

  @Override
  Pizza createPizza(String type) {
    if(type.equals("pepperoni")){
      return new ChicagoStylePepperoniPizza();
    }
    else if(type.equals("clam")){
      return new ChicagoStyleClamPizza();
    }
    else if(type.equals("cheese")){
      return new ChicagoStyleCheesePizza();
    }else return null;
  }
}
