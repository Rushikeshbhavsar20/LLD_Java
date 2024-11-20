class Main{
   public static void main(String args[]){
   
   
      Runnable task = () -> {
          Singleton instance = Singleton.getInstance();
        instance.display();
        
        System.out.println(instance.hashCode());

        
    
      };
      
      Thread t1 = new Thread(task);
      Thread t2 = new Thread(task);
      Thread t3 = new Thread(task);
      Thread t4 = new Thread(task);
      Thread t5 = new Thread(task);
      Thread t6 = new Thread(task);
      t1.start();
  t2.start();
  t3.start();
  t4.start();
  t5.start();
  t6.start();
  
        
   }

}
