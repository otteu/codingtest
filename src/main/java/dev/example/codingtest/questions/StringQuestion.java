package dev.example.codingtest.questions;

public class StringQuestion {

    public static void main(String[] args) {

        String str = "ABCDEFG";
        int index = 3;

        // 1. 참조값을 변경 하기
        stringAndIndex(str);

        // 2. 새로운 문자열 배울을 만들어 indexing 하여 사용 하기
        stringAndIndexChange(str, index, 'X');

        // StringSubstring 사용하기
        stringSubstring(str, 'X');


        // 리터럴과 오브젝트 타입의 차이 리터럴은 constant String pool에 저장 되고,
        // 오브젝트 자료형은 Java Heap 영역 전역에 저장
        // Java Heap 내부에 constant String pool 영역이 존재 함
        // constant String pool 영역에 저장 되면 그것을 참조 하여,
        // == 연산을 할 경우 같은 위치를 참조 하니 true 결과를 도출
        // 오브젝트 자려형은 (new )는 서로 다르게 생성 되며, 서로드란 위치에 생성됨

        String str1 = "test";
        String str2 = "test";
        // 결과 true
        System.out.println(str1 == str2);

        String o1 = new String("test");
        String o2 = new String("test");

        // 결과 false
        System.out.println(o1 == o2);
        // 위치로 판펼하는 것이 아닌, 값을 참조 하여 같은지를 비교 하여 ture 나옴
        System.out.println(o1.equals(o2));

    }

    public static void stringAndIndex(String str) {
        str = "ACCES";
        System.out.println(str);
    }

    public static void stringAndIndexChange(String str, int index, Character chageValue) {
        char[] temp_arr = str.toCharArray();
        temp_arr[index] = chageValue;
        String s = new String(temp_arr);
        System.out.println(s);
    }

    public static void stringSubstring(String str, char chageValue) {
        str = str.substring(0,4) + chageValue + str.substring(5,7);
        System.out.println(str);
    }

}
