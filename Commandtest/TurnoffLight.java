public class TurnoffLight implements Icommand{
   Light light;
   public TurnoffLight(Light light){
      this.light = new Light(); 
   }
   
   public void execute(){
        light.turnoff();
   }
   
  public void undo(){
        light.turnon();
   }
 
 


}
