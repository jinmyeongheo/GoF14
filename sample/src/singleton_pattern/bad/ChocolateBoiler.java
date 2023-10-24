package singleton_pattern.bad;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;

  private static ChocolateBoiler uniqueInstance;

  private ChocolateBoiler(){
    empty = true;
    boiled = false;
  }

  public static ChocolateBoiler getInstance(){ // 싱글톤 방어코드 적용
    if(uniqueInstance == null){
      uniqueInstance = new ChocolateBoiler();
    }
    return uniqueInstance;
  }

  // 보일러가 비었을 때만 초코넣음
  public void fill(){
    if(isEmpty()){
      empty = false;
      boiled = false;
    }
  }

  // 비어있지않고 끓지않을때만 끓임
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
