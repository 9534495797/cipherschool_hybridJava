

interface M{
    int x=20;
    void fun();
}
interface N{
    int x=30;
    void fun();
}
class C implements M,N{
    public void fun(){
        System.out.println("i am funnction in c");
        System.out.println(M.x);
        System.out.println(N.x);
    }
}
//2nd way for multiple inheritance
interface O extends M,N{
void fun();
}
class D implements O{
    public void fun(){
        System.out.println("i am function in d");
    }
}
public class MultipleInheritance {
    
}
