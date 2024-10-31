package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LengthGraterThenFive {


    public static void main(String[] args) {

         List<String> fruits = Arrays.asList("elma","armut","çilek","ananas","avokado","muz") ;

      List<String>  lengthGreaterThenFive =   fruits.stream().filter(fruit -> fruit.length() > 5 ).collect(Collectors.toList());

        System.out.println(lengthGreaterThenFive);

       List<String> reverseWordsLengthGreaterThenFive = fruits.stream()
                .filter(fruit -> fruit.length() > 5 )
                .sorted(Comparator.comparingInt(String::length)
                        .reversed())
                .collect(Collectors.toList());

        System.out.println(reverseWordsLengthGreaterThenFive);

    }
}
