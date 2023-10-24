package singleton_pattern.good;

public class DCLChocolateBoiler {
  private boolean empty;
  private boolean boiled;

  /** Double-Checked Locking
   * volatile : 키워드사용
   * 인스턴스가 생서되어 있는지 확인한 다음
   * 생성되지 않았을 때만 동기화!!
   * 즉, 처음에만 동기화를 사용한다.*/
  private static volatile DCLChocolateBoiler uniqueInstance;

  private DCLChocolateBoiler(){
    empty = true;
    boiled = false;
  }

  /**
   * synchronized :
   * 한 스레드가 메소드 사용을 끝내기 전까지 다른 스레드가 기다려야함.
   * 멀티 스레드 사용 시 2개의 인스턴스가 생성이 안되게함.
   * 속도저하 이슈
   */
  public static DCLChocolateBoiler getInstance(){
    if(uniqueInstance == null){ // 1. 인스턴스가 있는지 확인
      synchronized (DCLChocolateBoiler.class){ // 2. 처음에만 동기화
        if(uniqueInstance == null){ // 3. 다시한 번 null인지 체크
            uniqueInstance = new DCLChocolateBoiler(); // 4. 인스턴스 생성
        }
      }
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
