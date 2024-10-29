package algorithms;

import java.util.Scanner;

public class DivideThreeOrFive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Please enter number ");

        int number = scanner.nextInt() ;

  divideThreeOrFiveNumber(number);
  scanner.close();
    }


     public static void divideThreeOrFiveNumber(int number ){

        for (int i = 1 ; i <= number ; i++){

            System.out.println(i);
            if (i % 5 == 0 && i % 3 == 0 ){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 ) {
                System.out.println("Fizz");
            } else if (i % 5 == 0  ) {
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
     }



}
