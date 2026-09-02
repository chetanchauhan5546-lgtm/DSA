// Enter 3 number from the user & make a function to print their average

import java.util.Scanner;

public class Ques1 {
      static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the first number: ");
        int b = sc.nextInt();
        System.out.println("Enter the first number: ");
        int c = sc.nextInt();
        
        double result = average(a, b, c);
        System.out.println("Average"+result);
    }
}
