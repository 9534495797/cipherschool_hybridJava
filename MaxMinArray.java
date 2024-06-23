import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        // Declare array and take inputs
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        // Initialize max and min variables
        int max = array[0];
        int min = array[0];
        
        // Loop through the array to find max and min
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        // Output the result
        System.out.println("Maximum element in the array: " + max);
        System.out.println("Minimum element in the array: " + min);
    }
}

