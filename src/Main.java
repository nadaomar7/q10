public class Main {
    public static void main(String[] args) {

        Account ac2 = new Account ();
        Account ac1 = new Account (1122,20000);
        ac1.monthlyinterestrate();
        double x=ac1.monthlyinterest();
        ac1.withdraw(2500);
        ac1.deposit(3000);
        System.out.println("balance is "+ ac1.getbalance());
        System.out.println("monthly interest is "+x);
       // System.out.println("date is "+ac1.data());
        System.out.println("Date Created:" + new java.util.Date());
    }
}