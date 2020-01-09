package java_study;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.Date;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args){
        int a = 60;     // 60 = 0011 1100
        int b = 13;     // 13 = 0000 1101
        int c = 0;
        c = a & b;      // 12 = 0000 1100
        System.out.println("a & b = " + c);

        c = a | b;      // 61 = 0011 1101
        System.out.println("a | b = " + c);

        c = a ^ b;      // 49 = 0011 0001
        System.out.println("a ^ b = " + c);

        c = ~a;         // -61 = 1100 0011
        System.out.println("~a = " + c);

        c = a << 2;     // 240 = 1111 0000
        System.out.println("a << 2 = " + c);

        c = a >> 2;     // 15 = 1111
        System.out.println("a >> 2 = " + c);

        c = a >>>2;     // 15 = 0000 1111
        System.out.println("a >>> 2 = " + c);

        String A = "asdfg";
        int g = A.codePointCount(1,2);
        System.out.println(g);
        String B = A.replace('a', 'e');
        System.out.println(B);

        System.out.println(new Date());
        String s = new Date().toString();
        System.out.println(s);

    }
}

