public class PizzaStore{
 private PizzaFactory pizzaFactory;
 
 public PizzaStore(){
     this.pizzaFactory = new PizzaFactory();
 }
  
  
  public  Pizza orderPizza(String type){
          Pizza pizza =  pizzaFactory.createPizza(type);
          
          if(pizza == null){
            System.out.println("Sorry "+type +"  pizza is not available");
            return pizza;
          }
           
               return pizza;
          
      

       
  }





}
