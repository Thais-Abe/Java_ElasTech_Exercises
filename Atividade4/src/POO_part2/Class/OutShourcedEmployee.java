package POO_part2.Class;

public class OutShourcedEmployee extends Employee {

  private Double additionalCharge;

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutShourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
      return  (getValuePerHour()*getHours()) + (additionalCharge*1.1);
  }
}
