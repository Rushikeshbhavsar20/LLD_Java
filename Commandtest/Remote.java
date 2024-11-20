import java.io.*;
import java.util.*;
public class Remote{
 Icommand command;
 Stack<Icommand> com;
 Remote(){
   com = new Stack<>();
 }
 
 public void setCommand(Icommand command){
    this.command = command;
    com.push(command);
 }
 
 public void press(){
    command.execute();
 }
 
 public void undo(){
   if(!com.isEmpty()){
     Icommand comm = com.pop();
     comm.undo();
   }
 }

}
