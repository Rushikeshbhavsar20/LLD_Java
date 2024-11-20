class Ludeco extends CarDecorator{
    
    public Ludeco(Car car){
       super(car);
    }
    
    public void assemble(){
        super.assemble();
        System.out.println("Adding is Luxury features");
    }
  
} 
