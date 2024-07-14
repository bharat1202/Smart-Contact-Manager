package com.scm20.entities;
import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class contacts {
    @Id
    private String contactId;
    private String name;
    private String email;
    private String phonenumber;
    private String picture;
    @Column (length=1000)
    private String description;
    private boolean favourite=false;
    private String websitelink;
    private String linkedinlink;

    @ManyToOne
    private User user;

}
