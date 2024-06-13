class Student{
    String name;
    int marks;
    boolean checkpass(){
        if(marks>=40){
            return true;
        }
        else{
            return false;
        }
    }
}

public class ControlFlow {
    public static void main(String[] args) {
       Student s1=new Student();
s1.name="ram";
s1.marks=80;

Student s2=new Student();
s2.name="shyam";
s2.marks=30;
System.out.println(s1.checkpass());
System.out.println(s2.checkpass());
    }
}
