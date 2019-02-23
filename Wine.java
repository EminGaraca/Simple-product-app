package assignment2;

public class Wine extends Product {

    final double SPECIAL_PDV = 10;
    double volumeBottle;

    @Override
    public double calcPrice() {

        // return ((this.mainPrice*((this.PDV/100)+1)*((this.SPECIAL_PDV/100)+1)));
        return super.calcPrice() * ((this.SPECIAL_PDV / 100) + 1);
    }

    Wine() {

    }

    public Wine(double volumeBottle, String product, int barCode, double mainPrice) {
        super(product, barCode, mainPrice);
        this.volumeBottle = volumeBottle;

    }

    @Override
    public String toString() {
        return super.toString() + "\nVolume of the bottle is : " + this.volumeBottle;
    }

}
