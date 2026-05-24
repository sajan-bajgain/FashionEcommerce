import java.util.*;

public class FashionECommerce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User currentUser = null;
        
        System.out.println("=== Welcome to Fashion E-Commerce Platform ===");

        while (true) {
            if (currentUser == null) {
                System.out.println("\n1. Login");
                System.out.println("2. Exit");
                System.out.print("Choose option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    currentUser = login(scanner);
                } else {
                    System.out.println("Thank you for using the platform!");
                    break;
                }
            } else {
                if (currentUser instanceof Customer) {
                    customerMenu((Customer) currentUser, scanner);
                } else if (currentUser instanceof Seller) {
                    sellerMenu((Seller) currentUser, scanner);
                } else if (currentUser instanceof Admin) {
                    adminMenu(scanner);
                }
                currentUser = null; // Logout after session
            }
        }
        scanner.close();
    }

    private static User login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals("customer") && password.equals("123")) {
            System.out.println("Login successful! Welcome Customer.");
            return new Customer("C001", "customer", "123", "John Doe");
        } else if (username.equals("seller") && password.equals("123")) {
            System.out.println("Login successful! Welcome Seller.");
            return new Seller("S001", "seller", "123", "Nike Store");
        } else if (username.equals("admin") && password.equals("123")) {
            System.out.println("Login successful! Welcome Admin.");
            return new Admin("A001", "admin", "123");
        } else {
            System.out.println("Invalid username or password!");
            return null;
        }
    }

    private static void customerMenu(Customer customer, Scanner scanner) {
        Cart cart = new Cart();
        while (true) {
            System.out.println("\n=== Customer Menu ===");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Place Order");
            System.out.println("5. Logout");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                Product.viewProducts();
            } else if (choice == 2) {
                Product.viewProducts();
                System.out.print("Enter Product ID (e.g. P001): ");
                String pid = scanner.nextLine();
                System.out.print("Enter Quantity: ");
                int qty = scanner.nextInt();
                scanner.nextLine();
                Product p = Product.getProduct(pid);
                if (p != null) {
                    cart.addItem(p, qty);
                }
            } else if (choice == 3) {
                cart.showCart();
            } else if (choice == 4) {
                if (!cart.items.isEmpty()) {
                    Order order = new Order(customer, cart);
                    order.placeOrder();
                } else {
                    System.out.println("Your cart is empty!");
                }
                break;
            } else if (choice == 5) {
                break;
            }
        }
    }

    private static void sellerMenu(Seller seller, Scanner scanner) {
        while (true) {
            System.out.println("\n=== Seller Menu ===");
            System.out.println("1. Add New Product");
            System.out.println("2. View Products");
            System.out.println("3. Logout");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                seller.addProduct();
            } else if (choice == 2) {
                Product.viewProducts();
            } else if (choice == 3) {
                break;
            }
        }
    }

    private static void adminMenu(Scanner scanner) {
        System.out.println("\n=== Admin Dashboard ===");
        System.out.println("Total Users: 15 | Total Orders Today: 8 | System Status: Running");
        System.out.println("Admin privileges active (Demo)");
    }
}