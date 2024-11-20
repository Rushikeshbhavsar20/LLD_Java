import java.util.*;
public class WeatherDisplayObserver implements Observer{
  private String displayName;
  public WeatherDisplayObserver(String Display){
      this.displayName = Display;
  }
  public void update(Observable o , Object arg){
     if(o instanceof WeatherStationObservable){
        WeatherStationObservable weather = (WeatherStationObservable) o;
        System.out.println("Temp is "+weather.getTemp());
     }
     if(arg instanceof String){
        String info = (String)arg;
        System.out.println(info);
     }
    
  }

}
