package OOPS.Codes;

public class OOPS {
    public static void main(String[] args) {
        // Creating object for pen Class
        Pen reynolds = new Pen();
        reynolds.color = "red";
        System.out.println(reynolds.color);
        reynolds.setColor("Purple");
        System.out.println(reynolds.color);

        reynolds.tip = 6;
        System.out.println(reynolds.tip);
        reynolds.setTip(4);
        System.out.println(reynolds.tip);

        // Creating object for Bank Class
        BankAccount sbi = new BankAccount();
        sbi.username = "Sideonkaves";
        sbi.setPassword("this is the password");
        // sbi.password = "this";

    }
}

//
class BankAccount {
    // Access Specifiers
    public String username;
    private String password;

    public void setPassword(String pwd) {
        this.password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    public void setColor(String color) {
        this.color = color;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }
}