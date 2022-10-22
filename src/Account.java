import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualinterestrate;
    private Date datacreated;
    public Account() {
    }
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    // Getter
    public double getbalance() {
        return balance;
    }
    // Setter
    public void setbalance(double balance) {
        this.balance = balance;
    }
    // Getter
    public int getid() {
        return id;
    }
    // Setter
    public void setid(int id) {
        this.id = id;
    }
    // Getter
    public double annual() {
        return annualinterestrate;
    }
    // Setter
    public void setName(double annualinterestrate) {
        this.annualinterestrate = annualinterestrate;
    }
    public Date data(){
        return datacreated;
    }
    public double monthlyinterestrate(){
        return annualinterestrate/12;
    }
    public double withdraw (double amount ){
        return balance-amount;
    }
    public double deposit (double amount){
        return balance+amount ;
    }
    public double monthlyinterest(){
        return 0.045*balance ;
    }
}