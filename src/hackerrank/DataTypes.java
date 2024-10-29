package hackerrank;

import java.util.Scanner;

public class DataTypes {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number  : ");

        int testNumber = scanner.nextInt();

        for (int i = 0; i < testNumber; i++)
        {
            String input = scanner.next();

            try {

                long number = Long.parseLong(input);

                System.out.printf("s can be fitted in:", input);


                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println(" byte");
                }
                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    System.out.println(" short");
                }
                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println("  int");
                }
                if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                    System.out.println(" long");
                }
            } catch (Exception e) {
                System.out.printf(" can't be fitted anywhere", input);
            }
        }
        scanner.close();
    }
    }

