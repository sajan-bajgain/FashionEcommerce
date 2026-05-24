import java.util.Scanner;

class Seller extends User {
    public Seller(String userId, String username, String password, String name) {
        super(userId, username, password, name);
    }
    
    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Category: ");
        String category = sc.nextLine();
        
        Product p = new Product("P" + (Product.products.size() + 1), name, price, 50, category);
        Product.products.add(p);
        System.out.println("✅ Product added successfully!");
    }
}