public class Suprimentos {
    private int numberItem;
    private String descriptionItem;
    private int quantityBuyedFromItem;
    private int priceItem;

    public Suprimentos(int numberItem, String descriptionItem, int quantityItem, int priceItem) {
        this.numberItem = numberItem;
        this.descriptionItem = descriptionItem;
        setQuantityBuyedFromItem(quantityItem);
        setPriceItem(priceItem);
    }

    public int getNumberItem() {
        return numberItem;
    }

    public void setNumberItem(int numberItem) {
        this.numberItem = numberItem;
    }

    public String getDescriptionItem() {
        return descriptionItem;
    }

    public void setDescriptionItem(String descriptionItem) {
        this.descriptionItem = descriptionItem;
    }

    public int getQuantityBuyedFromItem() {
        return quantityBuyedFromItem;
    }

    public void setQuantityBuyedFromItem(int quantityItem) {
        if(quantityItem < 0){
            quantityItem = 0;
            this.quantityBuyedFromItem = quantityItem;
        }

    }

    public int getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(int priceItem) {
        if(this.priceItem < 0){
            priceItem = 0;
            this.priceItem = priceItem;
        }
    }

    public double getInvoiceAmount(){
        return this.quantityBuyedFromItem * priceItem;
    }
}
