class SocketAdapter extends Socket{
  
  
  public Volts get3Volt(){
     Volts v = getVolts();
     return Convert(v,20);
  }
  
  public Volts Convert(Volts v , int div){
      return new Volts(v.getVolts()/div);
  }


}
