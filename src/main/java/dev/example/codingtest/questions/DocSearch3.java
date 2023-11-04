package dev.example.codingtest.questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocSearch3 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/file/questions/doc_search.txt");
        Scanner sc = new Scanner(file);
        String doc = sc.nextLine();
        String word = sc.nextLine();
        int count =0;

        for (int i = 0; i < doc.length(); i++) {
            boolean isMatch = true;
            for( int j = 0; j < word.length(); j++) {
                if(i + j >= doc.length() ||
                        doc.charAt(i + j) != word.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }
            if(isMatch) {
                count++;
                i += word.length() - 1;
            }
        }

        System.out.println("count = " + count);
    }
}
