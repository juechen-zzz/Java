/*
    用分治算法实现在一个数组中寻找到最大子序列和
 */

package data_structure;

import static java.lang.Math.*;

public class DivideAlgorithm {
    public static int algorithm(int[] arr, int left, int right){
        int MaxLeft, MaxRight;
        int MaxBorderLeft, MaxBorderRight;
        int BorderLeft, BorderRight;

        int center;

        center = (left + right) / 2;

        if(left == right){
            if(arr[left] > 0) return arr[left];
            else return 0;
        }

        MaxLeft = algorithm(arr, left, center);
        MaxRight = algorithm(arr, center+1, right);

        MaxBorderLeft = 0;
        BorderLeft = 0;
        for (int i = center; i>=left; i--){
            BorderLeft += arr[i];
            if(BorderLeft > MaxBorderLeft) MaxBorderLeft = BorderLeft;
        }

        MaxBorderRight = 0;
        BorderRight = 0;
        for (int i = center+1; i<=right; i++){
            BorderRight += arr[i];
            if (BorderRight > MaxBorderRight) MaxBorderRight = BorderRight;
        }

        int A = max(MaxLeft, MaxRight);
        int B = max(A, MaxBorderLeft + MaxBorderRight);
        return B;
    }

    public static void main(String[] args){
        int[] A = {2,5,1,7,1,-7,2,4};
        System.out.println("最大子列和为：" + algorithm(A, 0, 7));
    }
}

