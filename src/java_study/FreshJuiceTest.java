package java_study;

class FreshJuice{
    enum FreshJuicesize{Small, Medium, Large}
    FreshJuicesize size;
}


public class FreshJuiceTest {
    public static void main(String[] args){
        FreshJuice juice = new FreshJuice();                // 单行注释
        juice.size = FreshJuice.FreshJuicesize.Medium;
    }
}
