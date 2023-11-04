package dev.example.codingtest.questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocSearch2 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/file/questions/doc_search.txt");
        Scanner sc = new Scanner(file);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        String replaced = doc.replace(word, "");
        int length = doc.length() - replaced.length();
        int count = length / word.length();
        System.out.println("count = " + count);
    }
}
