package dev.example.codingtest.questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TimeSubstring {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/file/questions/time_substring.txt");
        Scanner sc = new Scanner(file);
        String time = sc.nextLine();


        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));
        int second = Integer.parseInt(time.substring(6, 8));

        System.out.println("hour = " + hour);
        System.out.println("minute = " + minute);
        System.out.println("second = " + second);

    }
}
