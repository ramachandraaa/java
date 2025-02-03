package Udemy;

public class MotorbikeRunner {
    public static void main(String[] args) {
        Motorbike hero=new Motorbike();
        Motorbike honda=new Motorbike(); 
        hero.Start();
        honda.Start(); 
     hero.Speed=100;
     honda.Speed=200;
     System.out.println(hero.Speed);

    }

    
}
