public class Tea {
    
    public void prepareTea() {
        System.out.println("Preparing basic tea with hot water and tea leaves...");
    }

    
    public void addMilk() {
        System.out.println("Adding milk to the tea...");
    }

    
    public void addSugar() {
        System.out.println("Adding sugar to the tea...");
    }

    public static void main(String[] args) {
        
        Tea myTea = new Tea();

        
        myTea.prepareTea();

        
        myTea.addMilk();

        
        myTea.addSugar();
    }
}
