package assignment2;

public class Chocolate extends Product {

    double weightChocolate;

    Chocolate() {

    }

    Chocolate(double weightChocolate, String product, int barCode, double mainPrice) {
        super(product, barCode, mainPrice);
        this.weightChocolate = weightChocolate;

    }

    @Override
    public String toString() {
        return super.toString() + "\nWeight of the chocolate is : " + this.weightChocolate;
    }

}
