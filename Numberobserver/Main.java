import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
       Number number = new Number();
       Hexadecimal hex = new Hexadecimal(number);
       Octal oc = new Octal(number);
       number.setNumber(23);
       number.setNumber(3);
       number.setNumber(235);
       number.setNumber(3);
    }
}
