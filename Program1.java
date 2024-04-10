public class Program1 {

    //Attributes declaration

    private String name;
    private int age;

    // Constructor declaration

    public Program1(String name, int age){

        this.name = name;
        this.age = age;
    }
    
    // getter method declaration

    public String getName(){
        return name;
    }

    public int getAge(){

    return age;
    }

    public static void main(String [] args){

        Program1 pro = new Program1("Sanjeev", 29);


        System.out.println("Name:  " +pro.getName() );
        System.out.println("Age: " + pro.getAge());



    }
}
