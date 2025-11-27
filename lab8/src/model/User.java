package model;

public class User {
    private int id;
    private String email;
    private boolean emailChanged;

    public User(int id, String email) {
        this.id = id;
        this.email = email;
    }

    public void changeEmail(){
        this.emailChanged = true;
    }

    public boolean isEmailChanged() {
        return emailChanged;
    }

    ///other code...
}
