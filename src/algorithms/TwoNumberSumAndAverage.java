package algorithms;

import java.util.Scanner;

public class TwoNumberSumAndAverage {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;


        System.out.println("Please enter two number : ");

        int number = scanner.nextInt() ;
        int numberTwo = scanner.nextInt();

        System.out.println("Your Numbers : " + number +  " "  + numberTwo );

        int sum = number + numberTwo ;
        int average = sum / 2 ;

        System.out.println("Sum of Your number : " + sum +
                           " Average of Your number : " + average   );


    }
}
