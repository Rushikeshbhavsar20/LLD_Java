public class Main{
    public static void main(String args[]){
       SocketAdapter Socket = new SocketAdapter();
       Volts V3 = Socket.get3Volt();
       System.out.println(V3.getVolts());
    }

}
