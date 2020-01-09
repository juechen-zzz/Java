/*
    线性表及其表示，实现数组的查找、插入和删除
 */

package data_structure;

public class LinearTable {
    private static int find(int[] arr, int value){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==value)   return i;
        }
        return Integer.parseInt(null);
    }

    private static int[] insert(int[] arr, int value, int index){
        int[] ans = new int[arr.length+1];
        if (index >= 0) System.arraycopy(arr, 0, ans, 0, index);
        ans[index] = value;
        if (arr.length - index - 1 >= 0) System.arraycopy(arr, index + 1, ans, index + 1, arr.length - index - 1);
        return ans;
    }

    private static int[] delete(int[] arr, int value){
        int count = 0;
        for (int item : arr) {
            if (item == value) count += 1;
        }
        int[] ans = new int[arr.length-count];
        int index = 0;
        for (int i : arr) {
            if (i != value) ans[index++] = i;
        }
        return ans;
    }


    public static void main(String[] args){
        int[] A = {214,12,521,124,634,234,34,51,35};
        System.out.println(find(A, 35));
        System.out.println(insert(A, 19, 1)[1]);
        System.out.println(delete(A, 12)[1]);
    }
}
