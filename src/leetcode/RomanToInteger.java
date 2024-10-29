package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {

        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("V"));


    }

 public static int romanToInt(String roman){

        Map<Character,Integer> romanNumberMap = new HashMap<>() ;

        romanNumberMap.put('I',1) ;
        romanNumberMap.put('V',5) ;
        romanNumberMap.put('X',10) ;
        romanNumberMap.put('L',50) ;
        romanNumberMap.put('C',100) ;
        romanNumberMap.put('D',500) ;
        romanNumberMap.put('M',1000) ;

        int total = 0 ;
        int length = roman.length() ;

        for (int i = 0 ; i<length; i++){

            if (i < length - 1 && romanNumberMap.get(roman.charAt(i)) < romanNumberMap.get(roman.charAt(i + 1))) {

                total -= romanNumberMap.get(roman.charAt(i)) ;

            }else{

                total += romanNumberMap.get(roman.charAt(i)) ;

            }

        }

        return total ;

 }
}
