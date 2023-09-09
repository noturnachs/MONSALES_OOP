public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("0001");
        account.setCustomerName("Dan Lius");
        account.setAccountBalance(1000000000);
        account.setEmail("danlius@usc.edu.ph");
        account.setPhoneNumber("09083374938");


        System.out.println("=======================================\n");
        System.out.println("Account Number: "+ account.getAccountNumber() + "\nCustomer Name: "+account.getCustomerName()+"\nCustomer Email: "+account.getEmail()+"\nCustomer Phone: "+account.getPhoneNumber());
        System.out.println("\n=======================================");
        System.out.println("Outstanding Balance: ₱" + String.format("%.2f", account.getAccountBalance()));
        System.out.println("=======================================");
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(800);
        System.out.println("=======================================");
        System.out.println("New Balance: ₱" + String.format("%.2f", account.getAccountBalance()));
    }
}