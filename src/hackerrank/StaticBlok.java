package hackerrank;

import java.util.Scanner;

public class StaticBlok {

    static int breadth ;
    static int height   ;
    static int area ;

    static {
        Scanner scanner = new Scanner(System.in) ;
        breadth = scanner.nextInt() ;
        height = scanner.nextInt() ;

        if (breadth <=0 || height <= 0 ){

            throw new IllegalArgumentException("java.lang.Exception Bread and height must be positive");
        }else{
            area = breadth * height ;
        }
    }

    public static void main(String[] args) {
        System.out.println(area);
    }
}
