public class Hexadecimal implements NumberObserver{
      private int number;
      private Number num;
      public Hexadecimal(Number num){
         this.num = num;
         num.AddObserver(this);
      }
      public void update(int number){
         this.number = number;
         display();
      }
      
      public void display(){
        System.out.println("No converting to hexadecimal is  " + Integer.toBinaryString(this.number));
      }
    
}
