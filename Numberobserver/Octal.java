public class Octal implements NumberObserver{
      private int number;
      private Number num;
      public Octal(Number num){
         this.num = num;
         num.AddObserver(this);
      }
     public void update(int number){
         this.number = number;
         display();
      }
      
      public void display(){
        System.out.println("No converting to Octal is " + Integer.toOctalString(this.number));
      }
    
}
