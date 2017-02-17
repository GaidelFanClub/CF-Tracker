package com.gaidelfanclub.cfapi.data;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class User {

    @Id
    private Long id;

    private String handle;
    private String firstName;
    private String lastName;
    private int rating;
    @Generated(hash = 1534151401)
    public User(Long id, String handle, String firstName, String lastName,
            int rating) {
        this.id = id;
        this.handle = handle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getHandle() {
        return this.handle;
    }
    public void setHandle(String handle) {
        this.handle = handle;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getRating() {
        return this.rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }


}
