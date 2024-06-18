class Demo{
    private int a=5;
    private int b=6;
    public int getA(){
        return this.a;
    }
    public int getB(){//getter
        return this.b;
    }
    public void setB(int b){//setter
        this.b=b;
    }
}

public class EncapsulationStudy {
    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println(d.getA());
        d.setB(40);
        System.out.println(d.getB());
    }
}
