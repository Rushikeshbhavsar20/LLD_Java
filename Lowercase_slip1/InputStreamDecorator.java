import java.io.*;


public class InputStreamDecorator extends FilterInputStream{
      

    public InputStreamDecorator(InputStream in){
           super(in);
    }
     public int read()throws IOException{
       
         int charac = super.read();
         if(charac == -1 ){
             return -1;
          }
         return Character.toLowerCase(charac);
     }
     
      
      public int read(byte []b , int off , int len)throws IOException{
        try{
          int bytesread = super.read(b,off,len);
           for(int i=off; i< off+bytesread; i++){
               b[i] = (byte) Character.toLowerCase((char) b[i]);
           }
           return bytesread;
        
        }catch(IOException e){
          System.out.println(e.toString());
          throw e;
        }

    }
      

}

