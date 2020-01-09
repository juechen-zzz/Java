package data_structure;

public class PrintN {
    // 循环
    static void PrintN_1(int N){
        int i;
        for (i=1; i<=N; i++) {
            System.out.println(i);
        }
    }
    // 递归
    static void PrintN_2(int N){
        if (N>=0) {
            PrintN_2(N-1);
            System.out.print(N);
        }
    }

    public static void main(String[] args){
        PrintN_2(9);
    }
}
