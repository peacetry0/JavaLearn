package algorithms;

import java.util.Scanner;

public class PalindromWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Please enter word ");

        String word = scanner.nextLine() ;

        if (isItPalindromWord(word)){
            System.out.println("The word is palindrom");
        }else{
            System.out.println("The word is not palindrom ");
        }
    }

    private static boolean isItPalindromWord(String word){

        String temp = "" ;

        for (int i  = word.length() - 1 ; i >= 0 ; i--){

             temp += word.charAt(i) ;
        }

        return word.equalsIgnoreCase(temp) ;
    }
}
