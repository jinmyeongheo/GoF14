package observer_pattern;

public interface Subject {

  /** 옵저버 등록 */
  void registerObserver(Observer o);

  /** 옵저버 제거 */
  void removeObserver(Observer o);

  /** 변경상태를 알리는 함수*/
  void notifyObservers();
}
