public class Main{
    public static void main(String args[]){
        WeatherStationObservable weather = new WeatherStationObservable();
        WeatherDisplayObserver weatherdisplay = new WeatherDisplayObserver("Display-1");
        
        weather.addObserver(weatherdisplay);
        
        weather.setMeasurment(34,23,45);
         weather.setMeasurment(3,2,4);
          weather.setMeasurment(34,23,45);
           weather.setMeasurment(34,23,45);
            weather.setMeasurment(34,23,45);
             weather.setMeasurment(34,23,45);
       
    
    }

}
