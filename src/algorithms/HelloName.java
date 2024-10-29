package algorithms;

import java.util.Scanner;

public class HelloName {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Please enter name : ");

        String name = scanner.nextLine() ;

        System.out.println("Hello " + name);

    }
}
