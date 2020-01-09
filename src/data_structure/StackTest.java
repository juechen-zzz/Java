/*
    实现堆栈的顺序存储结构，用数组实现，包含创建、isEmpty、push和pop操作
 */
package data_structure;

public class StackTest {
    private int[] elements;
    public int elementSize = 0;

    private StackTest(int capacity){
        elements = new int[capacity];
    }

    // 检查是否为空
    private Boolean IsEmpty(){
        return elementSize == 0;
    }

    // push
    private void push(int value){
        int[] temp = new int[elements.length + 1];                                         // 创建一个新的数组，大小比原来大1
        System.arraycopy(elements, 0, temp, 1, elements.length);            // 进行数组的复制
        elements = temp;
        elements[0] = value;
        elementSize++;
    }

    // pop
    private void pop(){
        int[] temp = new int[elements.length - 1];
        System.arraycopy(elements, 1, temp, 0, elements.length - 1);
        elements = temp;
        elementSize--;
    }

    private void write(){
        for (int i=0; i<elementSize; i++){
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        StackTest S = new StackTest(8);
        System.out.println(S.IsEmpty());    // 检测是否为空
        S.push(1);
        S.write();
        S.push(2);
        S.write();
        S.pop();
        S.write();
        System.out.println("目前堆栈中所包含元素个数为：" + S.elementSize);
    }
}
