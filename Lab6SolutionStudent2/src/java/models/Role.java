/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ry;end
 */
@Entity
@Table(name = "role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Role.findAll", query = "SELECT r FROM Role r"), 
    @NamedQuery(name = "Role.findByNoteId", query = "SELECT r FROM Role r WHERE n.id = :role_id"), @NamedQuery(name = "Note.findByTitle", query = "SELECT n FROM Note n WHERE n.title = :title"),
    @NamedQuery(name = "Role.findByContents", query = "SELECT n FROM Note n WHERE n.name = :role_name")})
public class Role implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "role_id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "role_name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "role")
    private List<User> userList;



    public Role(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
