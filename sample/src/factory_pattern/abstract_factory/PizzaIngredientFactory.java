package factory_pattern.abstract_factory;

public interface PizzaIngredientFactory {
  public Dough creatDough();
  public Sauce createSauce();
  public Cheese creatCheese();
  public Veggies[] creatVeggies();
  public Pepperoni creatPepperoni();
  public Clam creatClam();
}
