package assignment2;

public class TestClass {

    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate();
        chocolate.product = "Milkent";
        chocolate.barCode = 555;
        chocolate.mainPrice = 10;
        chocolate.weightChocolate = 0.5;
        System.out.println(chocolate.toString());

        System.out.println("");

        Wine wine = new Wine();
        wine.product = "Žilavka";
        wine.barCode = 666;
        wine.mainPrice = 60;
        wine.volumeBottle = 0.75;
        System.out.println(wine.toString());

    }

}
