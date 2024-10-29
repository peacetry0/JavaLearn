package algorithms.search;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

          int[] myArray = {1,2,3,4,5,6,7,8,9,10} ;

          int searchingArray = 10 ;

        Arrays.sort(myArray);

          int result =  Arrays.binarySearch(myArray,searchingArray) ;

        System.out.println(result);

         /* int result = binarySearch(myArray,searchingArray) ;

          if (result == - 1 ){
              System.out.println("The number is not found ");
          }else{
              System.out.println("The number is " + result + " index");
          } */
    }


    private static int binarySearch(int[] array,int searchingNumber){

        int left = 0 ;
        int right = array.length -1 ;

        while (left<right){

            int middle = (left + right) / 2 ;

            if (array[middle] == searchingNumber){

                 return middle ;
            }
            if (array[middle] < searchingNumber){

                   left = middle + 1 ;
            }else {

                right = middle - 1  ;

            }
        }
        return -1 ;
    }


}
