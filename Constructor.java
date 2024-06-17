class Loan{
    int rate=20;
    Loan(){
        System.out.println("i am default constructor of class loan");
    }
}
class Cartoon extends Loan{
    int rate;
    Cartoon(){
        System.out.println("i am default constructor of class cartoon");
    
        System.out.println(super.rate);}
    Cartoon(int rate){
            super(7);
            this.rate=rate;
        }
        void printrate(){
System.out.println(this.rate);
super.printrate();
System.out.println(super.rate);
        }
    }


public class Constructor {
    public static void main(String[] args) {
        Cartoon c1=new Cartoon();
        c1.printrate();
        
        }
}
