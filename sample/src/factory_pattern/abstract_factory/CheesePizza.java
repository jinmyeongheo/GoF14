package factory_pattern.abstract_factory;

public class CheesePizza extends Pizza {

  PizzaIngredientFactory ingredientFactory; // 팩토리

  public CheesePizza(PizzaIngredientFactory ingredientFactory) { // 생성자로부터 팩토리전달
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  void prepare() { // 어떤팩토리를 쓰는지 상관하지 않음.
    dough = ingredientFactory.creatDough();
    sauce = ingredientFactory.createSauce();
    clam = ingredientFactory.creatClam();
  }
}
