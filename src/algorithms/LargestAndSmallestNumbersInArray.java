package algorithms;

import java.util.Scanner;

public class LargestAndSmallestNumbersInArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println(" enter number of numbers");

         int n = scanner.nextInt() ;
        int[] array = new int[n] ;

        System.out.println("Please " + n + " enter numbers");

        for (int i = 0  ;i< n ; i ++){

            array[i] = scanner.nextInt();
        }
        int smallest = array[0] ;
        int largest = array[0] ;

        for (int i = 1 ; i< n ; i ++){
            if (array[i] < smallest){
                smallest = array[i] ;
            }
            if (array[i] > largest){
                largest = array[i] ;
            }
        }

        System.out.println("The Largest : " + largest);
        System.out.println("The Smallest : " + smallest);

        scanner.close();

        }
    }

