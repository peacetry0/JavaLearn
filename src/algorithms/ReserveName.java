package algorithms;

import java.util.Scanner;

public class ReserveName {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Name") ;

       String reverseName = String.valueOf(stringBuilder.reverse());
        System.out.println("ReverseName :" + reverseName);

    /*    Scanner scanner = new Scanner(System.in) ;

        System.out.println("Please enter name : ");

        String name = scanner.nextLine() ;
        String reverseName = "" ;

         for (int i = name.length() - 1 ; i >= 0  ; i--){

            reverseName +=  name.charAt(i) ;
         }

        System.out.println("Name : " + name  +
                           " Reverse Name : " +reverseName);*/
    }
}
