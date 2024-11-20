public class TurnonLight implements Icommand{
   Light light;
   public TurnonLight(Light light){
      this.light = new Light(); 
   }
   
   public void execute(){
        light.turnon();
   }
   
  public void undo(){
        light.turnoff();
   }
 
 


}
