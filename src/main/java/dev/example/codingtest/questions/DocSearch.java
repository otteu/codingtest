package dev.example.codingtest.questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocSearch {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/file/questions/doc_search.txt");
        Scanner sc = new Scanner(file);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        int count = 0;
        int startIndex = 0;
        while (true) {
            // indexOf( 찾을 단어, 시작 위치 ) : 찾은 단어의 첫번째 위치 반환
            // 없으면 -1 반환 하니, break를 이용하여 탈출
            int findIndex = doc.indexOf(word, startIndex);
            if (findIndex < 0) {
                break;
            }
            count++;
            startIndex = findIndex + word.length();
        }
        System.out.println("count = " + count);

    }


}
