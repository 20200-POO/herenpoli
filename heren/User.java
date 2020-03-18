/**
 * User
 */
package heren;

public class User extends Person {
    private String username;
    private String paswd;

    public void add() {
        System.out.println("Add en User");
    }

    public void signIn() {
        System.out.println("Login en User");
    }

    public void signOut() {
        System.out.println("Salir en User");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPaswd() {
        return paswd;
    }

    public void setPaswd(String paswd) {
        this.paswd = paswd;
    }
}