package algorithms;

import java.util.Scanner;

public class SumOfOddNumbersFromOneToN {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Please enter number");

         int number = scanner.nextInt() ;
         int sum  = 0 ;
         for (int i = 1 ; i <=number ; i++){

              if (i  % 2 != 0 ){

                      sum += i  ;
              }
         }

        System.out.println("Sum of Odd Numbers From One To N : " + sum);


    }
}
