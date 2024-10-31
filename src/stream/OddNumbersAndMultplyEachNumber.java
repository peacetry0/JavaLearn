package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersAndMultplyEachNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,5,58,12,15,18,21,24);

       List<Integer> solution = numbers.stream()
                .filter(number -> number % 2 != 0 )
                .map(number -> number * 3 )
                .sorted()
                .collect(Collectors.toList());

        System.out.println(solution);

    }
}
