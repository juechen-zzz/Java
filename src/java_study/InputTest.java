package java_study;
import java.time.*;
import java.util.*;
/*
    测试java从命令行的输入进行相关操作
 */

import java.util.*;

public class InputTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // get first input
        System.out.println("What's your name?");
        String name = in.nextLine();

        // get second input
        System.out.println("How old are you?");
        int age = in.nextInt();

        // display output on console
        System.out.println("hello, " + name + " " + age);

        System.out.printf("%tc", new Date());
    }
}
