public class StereoOff implements Icommand{
   Stereo stereo;
   public StereoOff(){
      this.stereo = new Stereo(); 
   }
   
   public void execute(){
        stereo.turnoff();
   }
   
  public void undo(){
        stereo.turnon();
   }
 
 


}
