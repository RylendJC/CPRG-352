/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sait.lab6.models;

import java.io.Serializable;

/**
 * Represents a user
 * @author rylend
 */
public class User implements Serializable {
    private String email;
    private boolean active;
    private String first;
    private String last;
    private String password;
    private Role role;
    
    public User() {
        
    }
    
    public User(String email, boolean active, String first, String last, String password, Role role) {
        this.email = email;
        this.active = active;
        this.first = first;
        this.last = last;
        this.password = password;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
