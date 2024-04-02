package POO_part3.Entities;

public class ImportedProduct extends Product{

    private Double customsFee;
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + "(Custom fee:  $" + String.format("%.2f",customsFee);
    }

    public Double totalPrice(){
        return 0.00;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
}
