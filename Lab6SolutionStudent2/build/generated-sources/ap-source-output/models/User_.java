package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Role;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-11-14T13:21:31")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, Role> role;
    public static volatile SingularAttribute<User, Boolean> active;
    public static volatile SingularAttribute<User, String> email;

}