package java_study;

public class StaticTest {
    public static void main(String[] args){
        // 填充staff数组用三个employee对象
        Employee_1[] staff = new Employee_1[3];

        staff[0] = new Employee_1("Tom", 40000);
        staff[1] = new Employee_1("Dick", 60000);
        staff[2] = new Employee_1("Harry", 65000);

        // 打印信息
        for (Employee_1 e : staff) System.out.println("name=" + e.getName() + ", id=" + e.getId() + ", salary=" + e.getSalary());

        int n = Employee_1.getNextId();
        System.out.println("Next available id=" + n);
    }
}

class Employee_1{
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    Employee_1(String n, double s){
        name = n;
        salary = s;
        id = 0;
    }

    String getName(){
        return name;
    }

    double getSalary(){
        return salary;
    }

    int getId(){
        return id;
    }

    public void setId(){
        id = nextId;
        nextId++;
    }

    static int getNextId(){
        return nextId;
    }

//    public static void main(String[] args){
//        Employee_1 e = new Employee_1("Harry1", 50000);
//        System.out.println(e.getName() + " " + e.getSalary());
//    }
}
