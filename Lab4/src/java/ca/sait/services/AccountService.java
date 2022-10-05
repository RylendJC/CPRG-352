package ca.sait.services;

import ca.sait.models.User;

/**
 * Service provider for account
 * @author rylend
 */
public class AccountService {
    public AccountService() {
        
    }
    public User login(String username, String password) {
        if(username== null) {
            return null;
        }
            
        if("abe".equals(username) && "password".equals(password)) {
            return new User(username, password);
        } else if ("barb".equals(username) && "password".equals(password)) {
            return new User(username, password);
        } else {
            return null;
        }
    }
}
