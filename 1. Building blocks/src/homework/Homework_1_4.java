package homework;

public class Homework_1_4 {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(1, "Ivan", "Ivanovich", 14, 140, "Trader");
        Employee e3 = new Employee("Maxim", "Maximovich", 15);

        e1.showInfo();
        e2.showInfo();
        e3.showInfo();

        System.out.printf("Было создано %d сотрудника(ов).", Employee.counter);

        e1 = null;
        e2 = null;
        System.gc();
    }

}

class Employee {
    long id;
    String name;
    String surname;
    int age;
    int salary;
    String department;
    public static int counter = 0;

    {
        this.id = -1;
        this.name = "No name";
        this.surname = "No surname";
        this.age = -1;
        this.salary = -1;
        this.department = "None";
        Employee.counter += 1;
    }

    public Employee() {
    }

    public Employee(long id, String name, String surname, int age, int salary, String department) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Id - " + this.id);
        System.out.println("Name - " + this.name);
        System.out.println("Surname - " + this.surname);
        System.out.println("Age - " + this.age);
        System.out.println("Salary - " + this.salary);
        System.out.println("Department - " + this.department);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Сотрудник %d - %s %s был удален.", this.id, this.name, this.surname);
    }
}