public class HeartAdapter implements Beatplayt{
     private HeartBeat heart;
    public HeartAdapter(HeartBeat heart){
        this.heart = heart;
    }
    
    public void playbeat(){
        heart.beat();
    }

}
