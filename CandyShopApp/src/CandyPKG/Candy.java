package CandyPKG;

class Candy {
    String name;
    String flavor;
    boolean isChocolaty;

    public Candy(String name, String flavor, boolean isChocolaty) {
        this.name = name;
        this.flavor = flavor;
        this.isChocolaty = isChocolaty;
    }

    void displayInfo() {
        System.out.println("Candy: " + name);
        System.out.println("Flavor: " + flavor);
        System.out.println("Chocolaty: " + (isChocolaty ? "Yes" : "No"));
    }
}