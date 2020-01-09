package java_study;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

/*
    读取文件
 */
public class ReadFileTest {
    private static void readFile() {
        String pathname = "/Users/nihaopeng/个人/Git/Java/src/java_study/testSet.txt";
        // 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw;
        // 不关闭文件会导致资源的泄露，读写文件都同理
        // Java7的try-with-resources可以优雅关闭文件，异常时自动关闭文件
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile();
    }
}
