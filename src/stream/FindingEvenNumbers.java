package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FindingEvenNumbers {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);

         List<Integer> evenNumbers =  numbers.stream()
                 .filter(number -> number % 2 == 0 )
                 .collect(Collectors.toList());

        System.out.println(evenNumbers);

        int sumOfEventOfSquares = numbers.stream()
                 .filter(n -> n % 2 == 0 )
                 .map(n -> n * n)
                 .reduce(0, Integer::sum) ;

        System.out.println(sumOfEventOfSquares);

    }
}
