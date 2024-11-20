
public class PizzaFactory{
 
  
  
  public  Pizza createPizza(String type){
      Pizza pizza = null;
      
      if(type.equalsIgnoreCase("Nypizza")){
        pizza = new NyPizza();
            pizza.getName();
               pizza.bake();  
        return pizza;
      }else if(type.equalsIgnoreCase("ChicagoPizza")){
          return pizza = new ChicagoPizza();
      }
      
      return pizza;
      
       
  }





}
