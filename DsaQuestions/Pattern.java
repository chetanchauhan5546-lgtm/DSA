import java.util.Scanner;

public class Pattern {
    // public static void main(String[] args) {
    //     for(int i=1;i<=4;i++){
    //         for(int j=1;j<=4;j++){
    //             System.out.print(" * ");
    //         }
    //         System.out.println(" ");
    //     }
    // }

    // if you want to take input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                System.out.print(" * ");

            }
            System.out.println(" ");
        }
    }
}
