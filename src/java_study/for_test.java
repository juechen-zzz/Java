package java_study;

public class for_test {
    public static void main(String args[]){
        int [] numbers = {10, 20, 30, 40, 50};

        // for 的用法
        for (int x : numbers){
            System.out.print(x + " ");
        }
        System.out.println();
        String [] names = {"a", "b", "c", "d"};
        for (int x = 10; x < 20; x = x + 1){
            System.out.print(x + " ");
        }

        // if~else的用法
        int s = 10;
        if (s < 20){
            System.out.println(s);
        }

        //switch的用法
        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.println('A');
                break;
            case 'B':
            case 'C':
                System.out.println('C');
                break;
            default:
                System.out.println("no answer");
        }
    }
}
