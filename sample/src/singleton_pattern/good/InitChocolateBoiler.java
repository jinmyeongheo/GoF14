package singleton_pattern.good;

public class InitChocolateBoiler {
  private boolean empty;
  private boolean boiled;

  /**
   * 클래스가 로딩될 때 바로 인스턴스 생성*/
  private static InitChocolateBoiler uniqueInstance = new InitChocolateBoiler();

  private InitChocolateBoiler(){
    empty = true;
    boiled = false;
  }

  public static InitChocolateBoiler getInstance(){
    return uniqueInstance;
  }

  public void fill(){
    if(isEmpty()){
      empty = false;
      boiled = false;
    }
  }

  public void boil(){
    if(!isEmpty() && !isBoiled()){
      boiled = true;
    }
  }

  public boolean isEmpty(){
    return empty;
  }

  public boolean isBoiled(){
    return boiled;
  }

}
