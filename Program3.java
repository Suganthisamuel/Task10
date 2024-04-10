public class Program3 {

    private double radius;


    public Program3(){
        this.radius = 1.0;
    }

    public Program3(double radius){

        this.radius = radius;
    }

    public double calculateCirucumference(){

        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Program3 Pro1 = new Program3();
        System.out.println("Circumference of circle1 : " +Pro1.calculateCirucumference());
    
        Program3 pro2 = new Program3();
        System.out.println("Circumference of circle2 : "+pro2.calculateCirucumference());
    }

    }

    
