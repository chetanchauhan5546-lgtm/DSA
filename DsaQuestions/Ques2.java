public class Ques2 {
     static void sumOdd(int n){
    int sum = 0;
    for(int i=1;i<=n;i++){
        if(n%2!=0){
              sum = sum+i;
        }
    }
    System.out.println("Sum of odd num is "+ sum);
    }
    public static void main(String[] args) {
        sumOdd(10);
    }
}
