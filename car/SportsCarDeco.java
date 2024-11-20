class SportsCarDeco  extends CarDecorator{
    
    public SportsCarDeco(Car car){
       super(car);
    }
    
    public void assemble(){
        super.assemble();
        System.out.println("Adding  Sportscar features");
    }
  
} 
