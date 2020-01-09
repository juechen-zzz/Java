/*
   基本的创建对象，声明，实例化，初始化
 */

package java_study;

public class Puppy {
    int puppyAge;
    public Puppy(String name){
        //这个构造器只有一个参数：name
        System.out.println("小狗的名字是：" + name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("小狗的年龄为：" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args){
        //创建一个对象
        Puppy myPuppy = new Puppy("abc");
        //通过方法设定age
        myPuppy.setAge(2);
        //调用另一个方法获取age
        myPuppy.getAge();
        //访问成员变量
        System.out.println("变量值：" + myPuppy.puppyAge);
    }
}
