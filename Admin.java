public class Admin extends User {
    
    private String adminId;

    public Admin(String adminId, String username, String password) {
        super(username, password);   // This now works
        this.adminId = adminId;
        this.role = "Admin";
    }

    public void showMenu() {
        System.out.println("\n=== Admin Dashboard ===");
        System.out.println("1. View All Users");
        System.out.println("2. View All Orders");
        System.out.println("3. Manage Products");
        System.out.println("4. Logout");
        System.out.print("Enter your choice: ");
    }
}