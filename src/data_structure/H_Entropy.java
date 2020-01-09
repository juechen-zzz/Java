package data_structure;

public class H_Entropy {
    public static void h_x(double [] a){
        double ans = 0;
        for (int i = 0; i < a.length; i++){
            ans += (-a[i] * (Math.log(a[i]) / Math.log(2)));
        }
        System.out.println("所求的熵值为：" + ans);
    }

    public static void main(String[] args){
        double[] A = {0.5,0.5};
        h_x(A);
    }
}
