package authentificationPage;

public enum User {
    VALID_USER("test.auto12", "test"),
    INVALID_USER("test", "test");

    private final String username;
    private final String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
