package hackerrank;

import java.util.Scanner;

public class StringIntroduction {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Please enter first word");
        String word = scanner.nextLine();

        System.out.println("Please enter Second word");
        String secondWord = scanner.nextLine();

        int totalLength = word.length() + secondWord.length() ;

        System.out.println("Total Length : " + totalLength);

        if (word.compareTo(secondWord) > 0 ){
            System.out.println("Yes ");
        }else{
            System.out.println("No");
        }

        String capitalWord = word.substring(0,1).toUpperCase() ;
        String capitalSecondWord = secondWord.substring(0,1).toUpperCase() ;

        System.out.println("Capital First Word : " + capitalWord +
                           "Capital Second Word : " + capitalSecondWord);

        scanner.close();


    }
}
