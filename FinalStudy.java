class A{
    final int noofalphabets=26;
    final int noofdigits;
    A(){
        noofdigits=10;
    }
    final void fun(){
        System.out.println("hi i am a function in class A");
    }
}
public class FinalStudy {
    public static void main(String[] args) {
        A bc=new A();
        bc.fun();
    }
}
