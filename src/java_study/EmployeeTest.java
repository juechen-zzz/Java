package java_study;


import java.time.LocalDate;

class Employee{
    private final String name;
    private double salary;
    private final LocalDate hireDay;

    Employee(String n, double s, int year, int mouth, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, mouth, day);
    }

    String getName(){return name;}

    double getSalary(){return salary;}

    LocalDate getHireDay(){return hireDay;}

    void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}


public class EmployeeTest {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("A", 75000, 1987, 12, 15);
        staff[1] = new Employee("B", 50000, 1989, 10, 1);
        staff[2] = new Employee("C", 40000, 1990, 3, 15);

        for (Employee e : staff) e.raiseSalary(5);

        for (Employee e : staff){
            System.out.println("name=" + e.getName() + ", salary" + e.getSalary() + ", hireDay=" + e.getHireDay());
        }
    }
}
