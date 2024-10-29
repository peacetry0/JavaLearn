package algorithms;

public class TheBiggestSecondNumberArray {

    public static void main(String[] args) {

         int[] array = {1,23,4,5,6,8,11,15,19,2} ;

        System.out.println(theBiggestSecondNumberArray(array));

    }



    public static int theBiggestSecondNumberArray(int[] array){

         int theBiggest = Integer.MIN_VALUE ;
         int theSecondBiggest = Integer.MIN_VALUE  ;


        for (int i = 0 ; i< array.length; i++){

            if (array[i] > theBiggest){

                 theSecondBiggest = theBiggest ;

                  theBiggest = array[i] ;

            } else if (array[i] > theSecondBiggest && array[i] < theBiggest) {

                theSecondBiggest = array[i] ;
            }
        }
            if (theSecondBiggest == Integer.MAX_VALUE){
                return  -1 ;
            }else{
                return theSecondBiggest ;
            }

           }

}
