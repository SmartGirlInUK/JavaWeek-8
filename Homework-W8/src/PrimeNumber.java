import java.util.Scanner;

public class PrimeNumber {
    /*
    Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17... are the prime numbers.)
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int num=in.nextInt();
        if (isPrimeNumber(num)==-1){
            System.out.println("Number is not Prime Number.");
        }
        else
            System.out.println("Number is Prime Number.");
    }
    public static int isPrimeNumber(int num){
        int m=num/2;
        int i=0;
        if (num<=1){
            return -1;
        }
        else {
            for ( i = 2; i < m; i++) {
                if (num % i == 0) {
                    return -1;
                }
            }
        }
        return num;
    }
}