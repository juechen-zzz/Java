package data_structure;

public class F_x {
    private static void f_x(int n, double[] a, double x){
        int i;
        double p = a[0];
        for (i=1; i<=n; i++){
            p += (a[i] * Math.pow(x, i));
        }
        System.out.println(p);
    }

    private static void f_x_2(int n, double[] a, double x){
        int i;
        double p = a[n];
        for (i=n; i>0; i--){
            p = a[i-1] + x * p;
        }
        System.out.println(p);
    }

    public static void main(String[] args){
        long startTime = System.currentTimeMillis(); //获取开始时间
        double[] A = {1, 2, 3, 4, 5};
        f_x(4, A, 2);                // 1+2*2+3*4+4*8+5*16
        f_x_2(4, A, 2);              // 1+(2+(3+(4+(5*2)*2)*2)*2)
        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms"); //输出程序运行时间
    }
}

