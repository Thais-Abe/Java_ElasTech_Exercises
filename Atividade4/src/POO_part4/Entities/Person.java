package POO_part4.Entities;

public abstract class Person {
    private String name;
    private Double annual_income;

    public Person(String name, Double annual_income) {
        this.name = name;
        this.annual_income = annual_income;
    }

    Person(){}

    public abstract double calculateTax();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnual_income() {
        return annual_income;
    }

    public void setAnnual_income(Double annual_income) {
        this.annual_income = annual_income;
    }
    @Override
    public String toString() {
        return getName()
                +": $ "
                +String.format("%.2f", calculateTax());
    }
}
