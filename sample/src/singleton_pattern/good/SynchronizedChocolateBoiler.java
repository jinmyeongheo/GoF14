package singleton_pattern.good;

import singleton_pattern.bad.ChocolateBoiler;

public class SynchronizedChocolateBoiler {
  private boolean empty;
  private boolean boiled;

  private static SynchronizedChocolateBoiler uniqueInstance;

  private SynchronizedChocolateBoiler(){
    empty = true;
    boiled = false;
  }

  /**
   * synchronized :
   * 한 스레드가 메소드 사용을 끝내기 전까지 다른 스레드가 기다려야함.
   * 멀티 스레드 사용 시 2개의 인스턴스가 생성이 안되게함.
   * 속도저하 이슈
   */
  public static synchronized SynchronizedChocolateBoiler getInstance(){
    if(uniqueInstance == null){
      uniqueInstance = new SynchronizedChocolateBoiler();
    }
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
