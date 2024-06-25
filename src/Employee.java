import java.util.Objects;

public class Employee {
    private String name;
    private int salary;
    private int department;
    private static int id;
    private static int nextId = 1;

    public Employee(String name, int salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public int getDepartment() {
        return department;
    }
    public int getId() {
        return id;
    }
    public int setDepartment() {
        return department;
    }
    public int setSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && department == employee.department && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, department);
    }

}
