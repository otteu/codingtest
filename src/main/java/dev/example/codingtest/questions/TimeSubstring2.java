package dev.example.codingtest.questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TimeSubstring2 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/file/questions/time_substring.txt");
        Scanner sc = new Scanner(file);
        String[] time = sc.nextLine().split(":");


        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);
        int second = Integer.parseInt(time[2]);

        System.out.println("hour = " + hour);
        System.out.println("minute = " + minute);
        System.out.println("second = " + second);

    }
}
