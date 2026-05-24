public class User {
    protected String userId;
    protected String username;
    protected String password;
    protected String name;
    protected String role;

    // Constructor for Admin (2 parameters)
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.role = "User";
    }

    // Constructor for Customer and Seller (4 parameters)
    public User(String userId, String username, String password, String name) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.role = "User";
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
}