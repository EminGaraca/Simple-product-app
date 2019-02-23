package assignment2;

public abstract class Product {

    String product;
    int barCode;
    double mainPrice;
    final double PDV = 20;

    Product() {

    }

    Product(String product, int barCode, double mainPrice) {
        this.product = product;
        this.barCode = barCode;
        this.mainPrice = mainPrice;
    }

    @Override
    public String toString() {
        return "Product : " + product + "\nBar Code is : " + barCode + "\nThe main price of the product :" + calcPrice();
    }

    public double calcPrice() {

        return (this.mainPrice * ((this.PDV / 100) + 1));

    }

}
