package day4;

public class AbstractionMethod {
    public static void main(String[] args) {
        BankAccount ramAccount = new BankAccount();
        ramAccount.setName("Ram");
        ramAccount.setAccountType("Checking");
        ramAccount.setMobileNumber("9878656864");
        ramAccount.setAddress("Chicago, USA");
        ramAccount.setAccountBalance(50000);


        BankAccount shyamAccount = new BankAccount();
        shyamAccount.setName("Shyam");
        shyamAccount.setAccountType("Saving");
        shyamAccount.setMobileNumber("3216789540");
        shyamAccount.setAddress("California");
        shyamAccount.setAccountBalance(15000);


        BankAccount hariAccount = new BankAccount();
        hariAccount.setName("Hari");
        hariAccount.setAccountType("Saving");
        hariAccount.setMobileNumber("9897881997");
        hariAccount.setAddress("Nebraska");
        hariAccount.setAccountBalance(80000);


        // System.out.println(ramAccount.getAccountBalance());
        // System.out.println(shyamAccount.getAccountBalance());


//        BankAccount dummyAccount = new BankAccount();
        ramAccount.transferBalance(hariAccount, 10000);

        double ramFinalBalance = ramAccount.getAccountBalance() - 10000;
        double shyamFinalBalance = shyamAccount.getAccountBalance() + 10000;
        double hariFinalBalance = hariAccount.getAccountBalance() + 10000;

        //ramAccount.setAccountBalance(ramFinalBalance);
        //shyamAccount.setAccountBalance(shyamFinalBalance);

        System.out.println(ramAccount.getAccountBalance());
        System.out.println(shyamAccount.getAccountBalance());
        System.out.println(hariAccount.getAccountBalance());


    }

}
