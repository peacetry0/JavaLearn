package algorithms.search;

public class LinearSearch {

    public static void main(String[] args) {

         int[] array = {1,2,5,85,96,105,125,155};

         int searchingNumber = 5 ;

         int result =  linearSearch(array,searchingNumber) ;

         if (result == -1){
             System.out.println("The Number is not found");
         }else{
             System.out.println("Number : " + result + " indeks");
         }

    }


    private static Integer linearSearch(int[] array,int searchingNumber ){


        for (int i = 0 ;  i < array.length ; i++){

            if (array[i] == searchingNumber ) {

                return i  ;
            }
        }
        return  - 1 ;
    }
}
