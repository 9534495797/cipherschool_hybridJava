public class PrintNTo1 {
    public static void main(String[] args) {
        int n = 10; // Starting number
        System.out.println("Numbers from " + n + " to 1:");
        printNTo1(n);
    }

    public static void printNTo1(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        printNTo1(n - 1);
    }
}
