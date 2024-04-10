// Parent class
class Tea7 {
    // Method to prepare basic tea
    public void prepareTea() {
        System.out.println("Preparing basic tea with hot water and tea leaves...");
    }
}

// Subclass for Black Tea
class BlackTea extends Tea7 {
    // Override prepareTea() method to prepare Black Tea
    @Override
    public void prepareTea() {
        System.out.println("Preparing Black Tea with hot water and black tea leaves...");
        System.out.println("Brewing for 5 minutes...");
    }
}

// Subclass for Green Tea
class GreenTea extends Tea7 {
    // Override prepareTea() method to prepare Green Tea
    @Override
    public void prepareTea() {
        System.out.println("Preparing Green Tea with hot water and green tea leaves...");
        System.out.println("Brewing for 3 minutes...");
    }
}

// Subclass for Herbal Tea
class HerbalTea extends Tea7 {
    // Override prepareTea() method to prepare Herbal Tea
    @Override
    public void prepareTea() {
        System.out.println("Preparing Herbal Tea with hot water and herbal tea leaves...");
        System.out.println("Brewing for 7 minutes...");
    }
}

public class Teaimplementation {
    public static void main(String[] args) {
        // Create instances of each type of tea
        BlackTea blackTea = new BlackTea();
        GreenTea greenTea = new GreenTea();
        HerbalTea herbalTea = new HerbalTea();

        // Prepare and print each type of tea
        System.out.println("Preparing Black Tea:");
        blackTea.prepareTea();
        System.out.println();

        System.out.println("Preparing Green Tea:");
        greenTea.prepareTea();
        System.out.println();

        System.out.println("Preparing Herbal Tea:");
        herbalTea.prepareTea();
        System.out.println();
    }
}
