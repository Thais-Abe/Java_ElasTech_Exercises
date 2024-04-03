package POO_part4.Entities;

public class Corporation extends Person {

    private int employees;
    public Corporation(String name, Double annual_income, int employees) {
        super(name, annual_income);
        this.employees = employees;
    }

    @Override
    public double calculateTax() {
        if(employees>10){
            return getAnnual_income()*0.14;
        }else{
            return getAnnual_income()*0.16;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
