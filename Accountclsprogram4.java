public class Accountclsprogram4 {

    private double balance;

    public Accountclsprogram4(){
        this.balance = 200;
    }

    public Accountclsprogram4(double initialbalance){
        this.balance = initialbalance;
    }

    public void withdraw(double amount){
        if (amount> 0 && amount <=balance){
        balance-= amount;
        System.out.println(" withdrawal successful. current balace: " +balance);
    } else  {

        System.out.println("Withdrawal unsucessful. Insuficient funds");

    }
}

    public void deposit(double amount){
        if (amount> 0){
        balance+= amount;
        System.out.println(" Deposit successful. current balace: " +balance);
    } else {

        System.out.println("Deposit failed . Invalid amount");

    }
}
    public static void main(String[] args) {
        Accountclsprogram4 acc1 =  new Accountclsprogram4();
        acc1.deposit(1000);
        acc1.withdraw(500);


        Accountclsprogram4 acc2 = new Accountclsprogram4();
        acc2.deposit(1000);
        acc2.withdraw(100);
    }


    }




    
    

