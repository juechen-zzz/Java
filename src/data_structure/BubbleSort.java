/*
    冒泡排序，每个大循环都是依次进行两两对比，对比结束时将最大或者最小搬到最后
 */

package data_structure;

public class BubbleSort {
    public static int[] begin_max(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] A = {2,5,3,1,4,6,7,8,9,10};
        begin_max(A);
        for(int i=0;i<A.length;i++) {
            System.out.print(A[i] + " ");
        }
    }
}

