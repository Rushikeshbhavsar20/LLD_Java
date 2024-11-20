import java.io.*;
import java.util.*;
public class Remote{
 Icommand command;
 Stack<Icommand>  lastCommand;
 Remote(){
   lastCommand = new Stack<>();
 }
 public void setCommand(Icommand command){
    this.command = command; 
 }
 public void PressButton(){
    this.command.execute();
    lastCommand.push(command);
 }
 
 public void undo(){
   if(!lastCommand.isEmpty()){
      Icommand lc = lastCommand.pop();
      lc.undo();
   }
 }

}
