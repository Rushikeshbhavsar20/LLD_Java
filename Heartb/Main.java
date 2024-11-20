public class Main{
    public static void main(String args[]){
        HeartBeat heart = new HeartBeat();
        Beatplayt Beat = new HeartAdapter(heart);
        Beat.playbeat();
        
      
    }
}
