// package packages.main;

class Account {
    public String username;
    protected String text;
    private String password;
    // access using getters and setters

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Package {
    public static void main(String[] args) {

        Account acc = new Account();
        acc.username = "lorem";
        acc.text = "lorem ipsum dolor sit amet"; //
        // acc.password = "lorem123"; // it will not accessable out side if its parent
        acc.setPassword("pass");
        System.out.println(acc.getPassword());

    }
}
