import java.util.Scanner;

public class MinAndMaxInputChallenge {
    /*
2.-Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
     */
    public static void main(String[] args) {
        MinAndMaxInputChallenge m=new  MinAndMaxInputChallenge();
        m.MinAndMax();
    }
    public void MinAndMax() {
        int i=0;
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers you want to enter? : ");
        int a=in.nextInt();
        int[] array=new int[a];
        while(i<a){
            try{
                System.out.print("Please Enter Number-"+(i+1)+" : ");
                array[i]=in.nextInt();
                i++;

            } catch (Exception e) {
                System.out.println("Invalid Input.\nPlease Enter Only Integer Numbers.");
                break;
            }
        }
        int max = array[0];
        int min = array[0];
        for(i=0; i<a; i++){
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
    }
}
