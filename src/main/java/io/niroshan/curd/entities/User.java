package io.niroshan.curd.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//make the user model first
@Entity//annotation implies that this user is an entity in the database
public class User {

    @Id//Long id is the primary key for the table
    @GeneratedValue//this says that id is auto incremented
    private Long id;
    private String fname;
    private String lname;

    //create the constructor with and without parameters
    public User(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public User() {
    }

    @Override//in order to debug
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
//getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
