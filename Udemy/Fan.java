package Udemy;

public class Fan {
    //state
    private String make;
    private double radius;
    private String color;
   
    private boolean ison;
    private byte speed;
    public Fan(String make,double radius,String color)
    {
        this.make=make;
        this.radius=radius;
        this.color=color;
    }
    
}
