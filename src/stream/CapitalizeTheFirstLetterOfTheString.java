package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizeTheFirstLetterOfTheString {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("ali","ayse","ahmet","burak","can") ;

       List<String> solution =  names.stream().filter(name -> name.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

       List<String > result = names.stream()
               .map(String::toUpperCase)
               .collect(Collectors.toList());

        System.out.println(solution);
        System.out.println(result);
    }
}
