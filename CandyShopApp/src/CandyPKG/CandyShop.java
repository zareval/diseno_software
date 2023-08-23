package CandyPKG;

class CandyShop {
    String name;
    Candy[] candies;
    int numCandies;

    public CandyShop(String name, int maxSize) {
        this.name = name;
        candies = new Candy[maxSize];
        numCandies = 0;
    }

    void addCandy(Candy candy) {
        if (numCandies < candies.length) {
            candies[numCandies] = candy;
            numCandies++;
            System.out.println("Candy '" + candy.name + "' added to the shop.");
        } else {
            System.out.println("Shop is full. Cannot add more candies.");
        }
    }

    void displayCandies() {
        System.out.println("Candies at " + name + ":");
        for (int i = 0; i < numCandies; i++) {
            candies[i].displayInfo();
            System.out.println();
        }
    }
}