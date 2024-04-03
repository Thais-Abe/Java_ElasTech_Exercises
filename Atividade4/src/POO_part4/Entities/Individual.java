package POO_part4.Entities;

public class Individual extends Person {
    private double wasteTaxWithHealth;
    public Individual(String name, Double annual_income, double wasteTaxWithHealth) {
        super(name, annual_income);
        this.wasteTaxWithHealth = wasteTaxWithHealth;
    }

    public double getWasteTaxWithHealth() {
        return wasteTaxWithHealth;
    }

    public void setWasteTaxWithHealth(double wasteTaxWithHealth) {
        this.wasteTaxWithHealth = wasteTaxWithHealth;
    }

    @Override
    public double calculateTax() {
        if(getAnnual_income() < 20000.00){
            return (getAnnual_income()* 0.15) - (wasteTaxWithHealth*0.5);
        }else {
            return (getAnnual_income()* 0.25) - (wasteTaxWithHealth*0.5);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
