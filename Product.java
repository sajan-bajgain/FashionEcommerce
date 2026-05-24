import java.util.ArrayList;

class Product {
    static ArrayList<Product> products = new ArrayList<>();
    
    String productId;
    String name;
    double price;
    int stock;
    String category;

    public Product(String productId, String name, double price, int stock, String category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    static {
        products.add(new Product("P001", "T-Shirt", 29.99, 100, "Clothing"));
        products.add(new Product("P002", "Jeans", 59.99, 50, "Clothing"));
        products.add(new Product("P003", "Sneakers", 89.99, 30, "Footwear"));
        products.add(new Product("P004", "Hoodie", 49.99, 80, "Clothing"));
    }

    public static void viewProducts() {
        System.out.println("\n=== Available Products ===");
        for (Product p : products) {
            System.out.println(p.productId + " | " + p.name + " | $" + p.price + " | Stock: " + p.stock);
        }
    }

    public static Product getProduct(String id) {
        for (Product p : products) {
            if (p.productId.equals(id)) return p;
        }
        System.out.println("Product not found!");
        return null;
    }
}