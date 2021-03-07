/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open  the template in the editor.
 */
package accounts.hotel;

/**
 *
 * @author Brandon Skrabanek
 */
public class User {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String address;

    public User(String username, String password, String firstName,
            String lastName, String email, String address) {
        if (username.equals("") || password.equals("") || firstName.equals("")
                || lastName.equals("") || email.equals("") || address.equals("")) {
            throw new NullPointerException();
        }
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
