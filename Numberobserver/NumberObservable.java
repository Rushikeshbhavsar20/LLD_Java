public interface NumberObservable{
   public void AddObserver(NumberObserver observer);
   public void RemoveObserver(NumberObserver observer);
   public void NotifyObserver();

}
