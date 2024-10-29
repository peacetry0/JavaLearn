package algorithms;

import java.util.Scanner;

public class PassOrFailed {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a visa note: ");

        double visaNote = scanner.nextDouble();

        System.out.print("Enter a final Note: ");
        double finalNote = scanner.nextDouble();

        double ortalama = (visaNote * 0.4) + (finalNote * 0.6);

        System.out.printf("Ortalama Not:", ortalama);

        if (ortalama >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }

        scanner.close();
    }
    }

