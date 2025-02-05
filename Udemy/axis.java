package Udemy;

public class axis {
    private double  x;
    private double  y;
    private double  x1;
    private double  y1;
    public axis(double  x,double  y)
    {
        this.x=x;
        this.y=y;

        
    }
   public double   getxaxis()
    {
return x1;
    }
    public double   getyaxis()
    {
return y1;
    }
    public void move(double dx,double  dy)
    {
        this.x1=this.x+dx;
        this.y1=this.y+dy;
    }
public double distance()
{
    return(Math.sqrt((x1-x)*((x1-x))+((y1-y)*(y1-y))));
}


    
}
