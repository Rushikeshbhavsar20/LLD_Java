public class Turnonfan implements Icommand{

    private Fan fan ;
     public Turnonfan(Fan fan){
        this.fan = fan;
     }
     
     public void execute(){
        fan.turnon();
     }
     
     public void undo(){
        fan.turnoff();
     }


}
