interface Shape {
    double pi = 3.14; // public static final
    double getArea(double r); // renamed to a more appropriate method name
}

class Circle implements Shape {
    public double getArea(double r) { // method signature matches the interface
        return r * r * pi; // calculate area of the circle
    }

    void fun() {
        System.out.println("Hey, I implemented an interface called Shape");
    }
}

public class InterfaceStudy {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getArea(5)); // calling the method getArea
        c.fun();
    }
}
