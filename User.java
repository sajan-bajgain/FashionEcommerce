public class User {
    protected String userId;
    protected String username;
    protected String password;
    protected String name;

    public User(String userId, String username, String password, String name) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.name = name;
    }
}