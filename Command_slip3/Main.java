public class Main{
  public static void main(String args[]){
 
      Remote remote = new Remote();
      Light light = new Light();
      remote.setCommand(new TurnonLight(light));
   
      remote.PressButton();
      remote.setCommand(new TurnoffLight(light));
      remote.PressButton();
      remote.undo();
  
  }

}
