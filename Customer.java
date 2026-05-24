public class Customer extends User {

    public Customer(String userId, String username, String password, String name) {
        super(userId, username, password, name);
        this.role = "Customer";
    }

    public void showMenu() {
        System.out.println("\n=== Customer Dashboard ===");
        System.out.println("1. Browse Products");
        System.out.println("2. Search Products");
        System.out.println("3. View Cart");
        System.out.println("4. Logout");
        System.out.print("Enter your choice: ");
    }
}