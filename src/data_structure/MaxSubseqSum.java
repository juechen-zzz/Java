/*
    给定N个整数的序列，求其中自列和的最大值
 */


package data_structure;

import static java.lang.Math.*;

public class MaxSubseqSum {
    // 暴力搜索，        O(n^3)
    public static void ans_1(int[] arr){
        int ThisSum = 0;
        int MaxSum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                ThisSum = 0;
                for(int k=i;k<=j;k++){
                    ThisSum += arr[k];
                    if(ThisSum > MaxSum) MaxSum = ThisSum;
                }
            }
        }
        System.out.println("(1)最大子列和为：" + MaxSum);
    }

    // 删除k循环，在每次j的时候只要再加一个a[j]，     O(n^2)
    public static void ans_2(int[] arr){
        int ThisSum = 0;
        int MaxSum = 0;
        for(int i=0;i<arr.length;i++){
            ThisSum = 0;
            for(int j=i;j<arr.length;j++){
                ThisSum += arr[j];
                if(ThisSum > MaxSum) MaxSum = ThisSum;
            }
        }
        System.out.println("(2)最大自列和为：" + MaxSum);
    }

    // 分治算法，将问题进行分解         O(nlogn)
    public static int ans_3(int[] arr, int left, int right){
        int MaxLeftSum, MaxRightSum;                // 存放左右子问题的解
        int MaxLeftBorderSum, MaxRightBorderSum;    // 存放跨分界线的左右结果

        int LeftBorderSum, RightBorderSum;
        int center;

        if(left == right){                          // 递归的终止条件：子列只有1个数字
            if(arr[left] > 0) return arr[left];
            else return 0;
        }

        center = (left + right) / 2;                // 找到中分点

        MaxLeftSum = ans_3(arr, left, center);
        MaxRightSum = ans_3(arr, center+1, right);

        MaxLeftBorderSum = 0;
        LeftBorderSum = 0;
        for(int j=center; j>=left; j--){
            LeftBorderSum += arr[j];
            if (LeftBorderSum > MaxLeftBorderSum) MaxLeftBorderSum = LeftBorderSum;
        }

        MaxRightBorderSum = 0;
        RightBorderSum = 0;
        for(int j=center+1; j<=right; j++){
            RightBorderSum += arr[j];
            if (RightBorderSum > MaxRightBorderSum) MaxRightBorderSum = RightBorderSum;
        }
        int A = max(MaxLeftSum, MaxRightSum);
        int B = max(A, MaxLeftBorderSum + MaxRightBorderSum);
        return B;
    }

    // 在线处理，从前往后加，保存最大值，一旦子列和出现0则放弃前面的全部子列，重置为0，        O(n)
    // "在线"指每输入一个数据就能进行即时处理，在任何一个地方终止输入，算法都能给出当前的正确的解
    public static void ans_4(int[] arr){
        int ThisSum = 0;
        int MaxSum = 0;
        for(int i=0;i<arr.length;i++){
            ThisSum += arr[i];
            if(ThisSum > MaxSum) MaxSum = ThisSum;
            else if(ThisSum < 0) ThisSum = 0;
        }
        System.out.println("(3)最大子列和为：" + MaxSum);
    }

    public static void main(String[] args){
        int[] A = {2,5,1,7,1,-7,2,4};
        ans_1(A);
        ans_2(A);
        System.out.println("(4)最大子列和为：" + ans_3(A, 0, 7));
        ans_4(A);
    }
}
