package dev.example.codingtest.questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// String 문자 2개를 비교 하여 같지 안은 문자를 가지고 있다면 그 갯수를 구하는 문제
// a 문자에서 가지고 있는 문자 하나하나의 갯수를 센다.
// b 무자도 갯수를 센다
// 그 수를 뺀다,



public class StringCompare {

    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        return count;
    }


    public static void main(String[] args) throws FileNotFoundException {

        int totalCount = 0;
        File file = new File("src/file/questions/text.txt");

        Scanner sc = new Scanner(file);
        // 공백을 기준으로 가져오기
        String a = sc.next();
        String b = sc.next();

        // 알파벳을 기준으로 한다.
        int[] countA = getAlphabetCount(a);
        int[] countB = getAlphabetCount(b);

        for(int i = 0; i < 26; i++) {
            totalCount += Math.abs(countA[i] - countB[i]);
        }
        System.out.println("totalCount = " + totalCount);

    }
}
