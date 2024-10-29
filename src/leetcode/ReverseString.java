package leetcode;

import java.util.Arrays;

public class ReverseString {


    public static void main(String[] args) {

        String[] strings = {"b", "c","d"};
        String[] strings1 ={"e", "f","g"};

        reverseString(strings);
        reverseString(strings1);

        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(strings1));

    }


    public static void reverseString(String[] strings){
        int left = 0 ;
        int right = strings.length - 1 ;


        while (left< right){

            String temp = strings[left] ;

            strings[left] = strings[right] ;
            strings[right] = temp ;


            left ++ ;
            right -- ;


        }
    }
}
