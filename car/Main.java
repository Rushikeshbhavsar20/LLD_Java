public class Main{
    public static void main(String args[]){
    
         Car sportscar = new SportsCarDeco(new Ludeco(new Basiccar()));
         sportscar.assemble();
    }

}
