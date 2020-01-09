package data_structure;
/*
    实现一个单链表的定义、求长度、查找、插入和删除操作
 */

import java.util.Scanner;

public class SingleLinkedList {
    public static class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }

        void addToNext(Node node){
            node.next = this.next;
            this.next = node;
        }

        //重写toString
        @Override
        public String toString() {
            String val = Integer.toString(value);
            if(next != null){
                val = val.concat(" -- ");
                val = val.concat(next.toString());
            }
            return val;
        }

        // 获取链表长度
        static int len(Node node){
            int l = 0;
            Node curNode = node;
            while (curNode != null){
                curNode = curNode.next;
                l++;
            }
            return l;
        }

        // 按索引查找链表中某值
        static int findKth(Node node, int kth){
            if (kth > (len(node))) return -2;
            Node curNode = node;
            int i = 0;
            while (curNode != null){
                if (i == kth-1) break;
                else {
                    i++;
                    curNode = curNode.next;
                }
            }
            return curNode.value;
        }

        // 按值查找链表中的索引
        static int find(Node node, int val){
            Node curNode1 = node;
            int ans = 0;
            while (curNode1 != null){
                if (curNode1.value == val){
                    break;
                }
                ans++;
                curNode1 = curNode1.next;
            }
            return ans;
        }

        // 在链表中间指定位置插入一个节点
        static Node insert(Node node, int index, int value){
            int i;
            Node tmp = node;
            Node insertNode = new Node(value);
            if (len(node) == 0){
                node = insertNode;
            }
            if (index == 0){
                insertNode.next = node;
                return insertNode;
            }
            else {
                for (i = 0; i < index-1; i++){
                    tmp = tmp.next;
                }
                insertNode.next = tmp.next;
                tmp.next = insertNode;
                return node;
            }
        }

        // 在链表中间指定位置删除一个节点
        static Node delete(Node node, int index){
            int i;
            Node tmp = node;
            if (index == 0){
                return node.next;
            }
            for (i = 1; i < index; i++){
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            return node;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        // 第一个节点
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        secondNode.next = null;
        // 链接
        head.addToNext(firstNode);
        firstNode.addToNext(secondNode);

        // 测试
        System.out.println("当前链表为：" + head);
        System.out.println("链表长度为：" + Node.len(head));                      // 必须使用类名+函数名的形式
//        Scanner in = new Scanner(System.in);
        System.out.print("请输入想要查找的节点（从1开始）：");
//        int k = in.nextInt();
        System.out.println("查找节点的值:" + Node.findKth(head, 2));
        System.out.print("请输入想要查找的值：");
//        int j = in.nextInt();
        System.out.println("查找节点的索引" + Node.find(head, 2));
        System.out.println("当前节点的值：" + head.value);
        System.out.println("下一节点的值为：" + head.next.value);
        System.out.println("插入：" + Node.insert(head, 2, 5));
        System.out.println("删除:" + Node.delete(head, 0));
    }
}
