package entities.ex2;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static void validate(String username, String password) {
        if (username == null || username.length() < 5) {
            throw new InvalidUsernameException("O nome de usuário deve ter pelo menos 5 caracteres. Enviado: " + (username != null ? username.length() : 0));
        }

        if (password == null || password.length() < 8) {
            throw new WeakPasswordException("A senha deve ter pelo menos 8 caracteres.");
        }

        boolean hasDigit = password.chars().anyMatch(Character::isDigit);
        if (!hasDigit) {
            throw new WeakPasswordException("A senha deve conter pelo menos um dígito (número).");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}