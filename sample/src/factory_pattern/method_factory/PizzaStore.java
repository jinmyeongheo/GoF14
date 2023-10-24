package factory_pattern.method_factory;

public abstract class PizzaStore {

  public Pizza orderPizza(String type){

    Pizza pizza;

    // 팩토리가아닌 추상메서드 호출
    pizza = createPizza(type);

    // 어떤 피자가 나올지 알 수 없음. 그저 정해진 작업을 처리할 뿐(일괄된서비스가능)
    // 어떤 구상클래스가 오는지 알 수 없음.
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  abstract Pizza createPizza(String type); // 팩토리가 추상메서드로 바뀜. 즉, 서브클래스가 처리함.(팩토리역할)
}
