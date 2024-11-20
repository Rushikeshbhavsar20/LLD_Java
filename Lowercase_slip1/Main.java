import java.io.*;
import java.util.*;

public class Main{
   public static void main(String args[]){
      InputStreamDecorator input = new InputStreamDecorator(System.in);
     Scanner sc = new Scanner(input);
      System.out.println("Enter the word to Convert it to the Lowercase or Type exit to return");
        
      while(true){
       
        System.out.print("Enter the text :-");
        
        String ans = sc.nextLine();
        
        if(ans.equalsIgnoreCase("exit")){
           System.out.println("Exiting");
           break;
        }else{
          System.out.println("Converted text is :- "+ans);
        }
        
      }
       
        
   }

}
