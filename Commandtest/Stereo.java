public class Stereo{
    boolean isOn;
    boolean withCd;
    
    public void turnon(){
        isOn = true;
        System.out.println("Steroe is Turned on");
    }

    public void turnoff(){
         isOn = false;
        System.out.println("Stereo is Turned off");
    
    }
    
    public void Stereowithcd(){
         withCd = true;
         System.out.println("Stereo has Cd inserted");
    }
 
}
