public class Colaborador {
    private String name;
    private String lastName;
    private int salary;

    public Colaborador(String name, String lastName, int salary) {
        this.name = name;
        this.lastName = lastName;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(this.salary < 0){
            this.salary = 0;
        }
        this.salary = salary;
    }

    public double increaseSalary(double salary){
        double result = salary + salary * 0.1;
        return result;

    }
}
