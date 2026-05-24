import java.util.ArrayList;

class Cart {
    ArrayList<CartItem> items = new ArrayList<>();

    public void addItem(Product product, int quantity) {
        if (product.stock >= quantity) {
            items.add(new CartItem(product, quantity));
            product.stock -= quantity;
            System.out.println("✅ " + quantity + " " + product.name + " added to cart!");
        } else {
            System.out.println("❌ Not enough stock available!");
        }
    }

    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty!");
            return;
        }
        double total = 0;
        System.out.println("\n=== Your Shopping Cart ===");
        for (CartItem item : items) {
            double subtotal = item.product.price * item.quantity;
            System.out.println(item.product.name + " x " + item.quantity + " = $" + subtotal);
            total += subtotal;
        }
        System.out.println("---------------------------");
        System.out.println("Total Amount: $" + total);
    }

    public double getTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.product.price * item.quantity;
        }
        return total;
    }
}