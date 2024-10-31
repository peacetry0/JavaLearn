package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizeTheFirstLetterOfTheStringInk {


    public static void main(String[] args) {

        List<String> words = Arrays.asList("elma","armut","KİRAZ","erik","erlik","çilek","kavun","karpuz") ;
        System.out.println(words);

      List<String>  filtered =   words.stream()
              .filter(word -> word.toLowerCase()
              .contains("k"))
                .map(word -> word.substring(0,1)
                        .toUpperCase()
                        + word.substring(1)
                        .toLowerCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filtered);
    }
}
