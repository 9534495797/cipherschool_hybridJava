abstract class Car{
    int maxspeed;
    abstract void accelerate();
}
class Bmw extends Car{
    void accelerate(){
        System.out.println("BMW is accelerating");
    }
}
public class Abstract {
    public static void main(String[] args) {
       Bmw b=new Bmw();
       b.accelerate(); 
    }
}
