public class Main {
    public static void main(String[] args) {
        Account navAccount = new Account();
        navAccount.setNumber("12345");
        navAccount.setBalance(1000.00);
        navAccount.setCustomerName("Navin");
        navAccount.setCustomerEmail("navin123@gmail.com");
        navAccount.setCustomerPhone("9865466357");
        navAccount.withdrawFunds(100.0);
        navAccount.depositFunds(250);
        navAccount.withdrawFunds(50);
        navAccount.withdrawFunds(200);
        navAccount.depositFunds(100);
        navAccount.withdrawFunds(20.20);
        navAccount.withdrawFunds(10.34);
        navAccount.withdrawFunds(70);

    }
}
