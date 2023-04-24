/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapplication4;

/**
 *
 * @author RISUNA
 */
class User {
    private String username;
    private String firstName;
    private String password;

    public User() {
        this.username = "";
        this.firstName = "";
        this.password = "";
    }

    public User(String username, String firstname, String password) {
        setUsername(username);
        setFirstName(firstname);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
