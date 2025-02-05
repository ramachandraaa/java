package Udemy;

public class Motorbike {
   //callig the constructor by the other constructor
   public Motorbike()
   {
      this(50);
   }
   public Motorbike(int Speed)
   {
      if(Speed==100)
      {
this.Speed=Speed;
      }
   }
   private int Speed;
   
    
     public int  getspeed()

   {
  return this.Speed;
   }

    
}
