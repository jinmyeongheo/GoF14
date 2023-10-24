package factory_pattern.abstract_factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough creatDough() {
    return null;
  }

  @Override
  public Sauce createSauce() {
    return null;
  }

  @Override
  public Cheese creatCheese() {
    return null;
  }

  @Override
  public Veggies[] creatVeggies() {
    return new Veggies[0];
  }

  @Override
  public Pepperoni creatPepperoni() {
    return null;
  }

  @Override
  public Clam creatClam() {
    return null;
  }
}
