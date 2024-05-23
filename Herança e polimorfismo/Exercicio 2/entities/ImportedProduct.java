package entities;

public class ImportedProduct extends Product {

    private Double customFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomsFee(Double customFee) {
        this.customFee = customFee;
    }

    public Double totalPrice() {
        return this.getPrice() + this.getCustomFee();
    }

    @Override
    public String priceTag() {
        return super.getName()
                + " $ "
                + String.format("%.2f", this.totalPrice())
                + " (Customs Fee: $ " + String.format("%.2f", this.getCustomFee()) + ")";
    }
}
