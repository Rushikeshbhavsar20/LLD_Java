import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
      
       Remote remote1 = new Remote();
           Light light = new Light();

       remote1.setCommand(new TurnonLight(light));
       remote1.press();
        remote1.setCommand(new TurnonLight(light));
         remote1.press();
          remote1.undo();
        
       
       
    
    
    }


}
