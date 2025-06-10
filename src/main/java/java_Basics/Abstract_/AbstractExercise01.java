package java_Basics.Abstract_;

/**
 * @author 张林凯
 * @version 1.0
 */
public class AbstractExercise01  {
    public static void main(String[] args) {
        //测试
        Manager zlk = new Manager("zlk", 1, 4599);
        zlk.setBonus(1000);
        zlk.work();

        System.out.println("========");

        CommonEmployee jly = new CommonEmployee("jly", 2, 14124);
        jly.work();


    }
}

abstract class Employee{
    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public abstract void work();
}

class Manager extends Employee{
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public String toString() {
        return "Manager{" +
                super.toString() +
                ",bonus=" + bonus +
                '}';
    }

    @Override
    public void work() {
        System.out.println("经理："+"name="+getName()+"id="+getId()+"salary="+getSalary()+"bonus="+bonus);
    }
}

class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }
    @Override
    public void work() {
        System.out.println("普通员工："+"name="+getName()+"id="+getId()+"salary="+getSalary());
    }

    @Override
    public String toString() {
        return "CommonEmployee{"+ super.toString()+"}" ;
    }
}