public class Turnofffan implements Icommand{

    Fan fan ;
     public Turnofffan(Fan fan){
        this.fan = fan;
     }
     
     public void execute(){
        fan.turnoff();
     }
      
     public void undo(){
        fan.turnon();
     }



}
