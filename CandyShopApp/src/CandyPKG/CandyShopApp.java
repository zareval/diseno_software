package CandyPKG;

public class CandyShopApp {
    public static void main(String[] args) {
        CandyShop shop = new CandyShop("Sweet Delights", 3);

        Candy candy1 = new Candy("Chocolate Bar", "Vainilla", true);
        Candy candy2 = new Candy("Gummy Bears", "Chocolate Chips", false);

        shop.addCandy(candy1);
        shop.addCandy(candy2);

        System.out.println("\n" + shop.name + " - Candy Information:");
        shop.displayCandies();
    }
}