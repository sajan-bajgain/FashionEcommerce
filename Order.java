class Order {
    static int orderCounter = 1;
    String orderId;
    Customer customer;
    Cart cart;
    String status = "Pending";

    public Order(Customer customer, Cart cart) {
        this.orderId = "ORD" + orderCounter++;
        this.customer = customer;
        this.cart = cart;
    }

    public void placeOrder() {
        cart.showCart();
        System.out.println("\nProcessing Payment...");
        
        Payment payment = new Payment(cart.getTotal());
        if (payment.processPayment()) {
            status = "Completed";
            System.out.println("Order " + orderId + " placed successfully! Thank you for shopping.");
        }
    }
}