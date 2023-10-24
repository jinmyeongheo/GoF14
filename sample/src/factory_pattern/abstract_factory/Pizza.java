package factory_pattern.abstract_factory;

public abstract class Pizza {

  Dough dough;
  Sauce sauce;
  Veggies veggies[];
  Pepperoni pepperoni;
  Clam clam;

  abstract void prepare(); // 팩토리에서 필요한 재료를 가져온다.

  void bake(){
    System.out.println(" 175도에서 25분간 굽기");
  };
  void cut(){
    System.out.println("피자를 사선으로 자르기");
  };
  void box(){
    System.out.println(" 상자에 피자담기");
  };

}
