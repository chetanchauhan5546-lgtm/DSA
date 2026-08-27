import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
    //     int i = 12;
    //     do{
    //         System.out.println("GGI");
    //     }while(i<11);
     

//Q. Print the Sum of First n Natural numbers.
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
    int sum =0;
    for(int i=0;i<=n;i++){
         sum = sum+i;
    }
    System.out.println(sum);

    }
}    