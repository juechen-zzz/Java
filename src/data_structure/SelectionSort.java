/*
    选择排序，定义从小到大进行排列，每次大循环都是从2往后找一个值和1比，选出最小
 */

package data_structure;

import java.util.Arrays;

public class SelectionSort {
    public static int[] begin_min(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int k=i+1;k<arr.length;k++){
                if(arr[k]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] A = {2,5,3,1,4,6,7,8,9,10};
        begin_min(A);
        for(int i:A) {
            System.out.print(i + " ");
        }
    }
}
