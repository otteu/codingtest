package dev.example.codingtest.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringBigAndSmall {

    public static void main(String[] args) {

        String str = "AbCdEfG";

//        stringBigAndSmall(str);
        asciiCode(str);

    }


    public static void asciiCode(String str) {

        for(int i =0; i < str.length(); i++){
            if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                System.out.println((char)('a' + str.charAt(i) - 'A'));
            } else {
                System.out.println((char)('A' + str.charAt(i) - 'a'));
            }
        }


    }


    public static void stringBigAndSmall(String str) {
        int ascii = 0;
        StringBuffer result = new StringBuffer("");
        char[] temp_arr = str.toCharArray();
        // ASCII 코드 값을 통한 대소문자 변환
        for(int i = 0; i < temp_arr.length; i++) {
            if((65 <= temp_arr[i]) && (temp_arr[i] <= 90)){
                result.append(String.valueOf(temp_arr[i]).toLowerCase());
            } else {
                result.append(String.valueOf(temp_arr[i]).toUpperCase());
            }
        }
        System.out.println(result);
    }

}
