package java_study;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class localDate_test {
    public static void main(String[] args){
        // 构造一个对象变量
        LocalDate ans = LocalDate.now();
        int year = ans.getYear();
        int mouth = ans.getMonthValue();
        int day = ans.getDayOfMonth();
        System.out.println(year + " " + mouth + " " + day);
        // 1000天后读取年月日
        LocalDate ans_1 = ans.plusDays(1000);
        int year_1 = ans_1.getYear();
        int mouth_1 = ans_1.getMonthValue();
        int day_1 = ans_1.getDayOfMonth();
        System.out.println(year_1 + " " + mouth_1 + " " + day_1);

        // 打印日历
        LocalDate date = LocalDate.now();
        int mouth_2 = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Str Sun");
        for (int i = 1; i < value; i++){
            System.out.print("    ");
        }
        while (date.getMonthValue() == mouth_2){
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) System.out.print("*");
            else System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        // if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
