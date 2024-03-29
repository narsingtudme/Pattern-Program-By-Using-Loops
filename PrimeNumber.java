import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
         int  count=0;
          System.out.println("enter a number");
        for (int i = num; i>0; i/=10) {
            count++;
            }
            System.out.println(count);
        }
    }
       
