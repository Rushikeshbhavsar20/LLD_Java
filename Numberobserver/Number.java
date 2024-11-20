import java.io.*;
import java.util.*;
public class Number implements NumberObservable{
     
     private int number;
     
     List<NumberObserver> observer;
     public Number(){
         observer = new ArrayList<>();
     }
     
     public void AddObserver(NumberObserver observer){
         this.observer.add(observer);
     }
     
    public void RemoveObserver(NumberObserver obs){
          if( observer.contains(obs)){
              observer.remove(observer);
          }
     }
     
    public void setNumber(int number){
        this.number = number;
        NotifyObserver();
    } 
     
     public void NotifyObserver(){
        for(NumberObserver observer : observer){
           observer.update(this.number);
        }
     }

}
