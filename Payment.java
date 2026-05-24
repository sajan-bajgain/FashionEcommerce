class Payment {
    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public boolean processPayment() {
        System.out.println("Payment of $" + amount + " processed successfully (Demo Mode)");
        return true;
    }
}