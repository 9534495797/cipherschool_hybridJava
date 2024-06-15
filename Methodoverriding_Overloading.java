//import javax.sound.sampled.SourceDataLine;

class Parent{
    void fun(){
        System.out.println("hi i am A");
    }
}
class Child extends Parent{
    void fun(){
        System.out.println("hi i am b");
    }
}
public class Methodoverriding_Overloading {
    public static void main(String[] args) {
        Child c=new Child();
        c.fun();


        //method overloading
        System.out.println("here is eample of method overloading");
        
    }
}
