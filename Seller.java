public class Seller extends User {

    public Seller(String userId, String username, String password, String name) {
        super(userId, username, password, name);
        this.role = "Seller";
    }

    public void showMenu() {
        System.out.println("\n=== Seller Dashboard ===");
        System.out.println("1. Add New Product");
        System.out.println("2. View My Products");
        System.out.println("3. View Orders");
        System.out.println("4. Logout");
        System.out.print("Enter your choice: ");
    }

    // Added this method to fix the error
    public void addProduct() {
        System.out.println("\n=== Add New Product ===");
        System.out.print("Enter product name: ");
        // For now, just showing the function (you can expand later)
        System.out.println("Product added successfully! (Demo)");
    }
}