import java.util.*;


public class WeatherStationObservable extends Observable{
  private int  temp;
  private int humidity;
  private int pressure;
  
  public void setMeasurment(int temp,int humidity,int pressure){
      this.temp= temp;
      this.humidity= humidity;
      this.pressure=pressure;
       mc();
 
  }


  public void mc(){

       setChanged();
      notifyObservers("New  updated");
  }
 
  public int  getTemp(){
      return this.temp;
  }
}
