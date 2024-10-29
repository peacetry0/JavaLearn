package algorithms;

import java.util.Scanner;

public class TheBiggestThreeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Please enter three number : ");

        int number = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        System.out.println("Your Numbers : " + number + " " + numberTwo + " "+ numberThree);

        if (number> numberTwo && number> numberThree){

            System.out.println("The biggest number  : " + number);
        } else if (numberTwo> number && numberTwo>numberThree ) {

            System.out.println("The biggest number : " + numberTwo);

        } else if (numberThree>number && numberThree> numberTwo) {

            System.out.println("The biggest number : "  + numberThree);
        }else{
            System.out.println("One of Number is equals");
        }
        scanner.close();

    }



}
