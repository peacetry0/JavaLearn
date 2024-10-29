package algorithms;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number:");

        int number = scanner.nextInt();

        if (armStrongNumber(number)) {
            System.out.println(number + "  is an armstrong number .");
        } else {
            System.out.println(number + "  is not an armstrong number ");
        }

        scanner.close();
    }


   private static boolean armStrongNumber(int number){


          int reallNumber = number ;

          int numberDigit = String.valueOf(number).length() ;
           int sum = 0 ;

           while (number != 0 ){

                int digit = number % 10 ;
                sum += Math.pow(digit,numberDigit) ;

                number /= 10 ;


           }
           return sum == reallNumber ;


   }
}
