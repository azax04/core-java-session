package day4;

public class BankAccount {
    String name;
    String accountType;
    String mobileNumber;
    String address;
    double accountBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    //open account
    //close account
    //withdraw
    //transferBalance

    // While transfer balance from one account to another account, function should be:
    public void transferBalance(BankAccount toAccount, double balance) {
        double fromFinalBalance = this.getAccountBalance() - balance;
        double toFinalBalance = toAccount.getAccountBalance() + balance;

        this.setAccountBalance(fromFinalBalance);
        toAccount.setAccountBalance(toFinalBalance);
    }


}