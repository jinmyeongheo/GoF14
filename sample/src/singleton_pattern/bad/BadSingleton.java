package singleton_pattern.bad;

public class BadSingleton {
  private static BadSingleton badSingleton; // 하나뿐인 인스턴스를 저장하는 변수

  private BadSingleton() { // 노출x
  }

  public static BadSingleton getInstance(){
    if(badSingleton == null){ // 없으면 인스턴스를 만들어서 리턴!!!
      badSingleton = new BadSingleton();
    }
    return badSingleton;
  }
}
