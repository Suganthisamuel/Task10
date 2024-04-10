
class Tea {
    
    public void prepareTea() {
        System.out.println("Preparing basic tea with hot water and tea leaves...");
    }
}


class BlackTea extends Tea {
    

    public void prepareTea() {
        System.out.println("Preparing Black Tea with hot water and black tea leaves...");
        System.out.println("Brewing for 5 minutes...");
    }
}


class GreenTea extends Tea {
    
    
    public void prepareTea() {
        System.out.println("Preparing Green Tea with hot water and green tea leaves...");
        System.out.println("Brewing for 3 minutes...");
    }
}


class HerbalTea extends Tea {
    
    public void prepareTea() {
        System.out.println("Preparing Herbal Tea with hot water and herbal tea leaves...");
        System.out.println("Brewing for 7 minutes...");
    }
}

public class Teaimplement {
    public static void main(String[] args) {
        
        Tea[] teas = new Tea[3];
        teas[0] = new BlackTea();
        teas[1] = new GreenTea();
        teas[2] = new HerbalTea();

        
        for (Tea tea : teas) {
            tea.prepareTea();
            System.out.println();
        }
    }
}
