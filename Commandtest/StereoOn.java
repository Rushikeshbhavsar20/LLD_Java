public class StereoOn implements Icommand{
   Stereo stereo;
   public StereoOn(){
      this.stereo = new Stereo(); 
   }
   
   public void execute(){
        stereo.turnon();
   }
   
  public void undo(){
        stereo.turnoff();
   }
 
 


}
