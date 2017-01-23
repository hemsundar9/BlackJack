package com.allstate.entities;

import com.sun.istack.internal.Nullable;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
@Data
public class Player {

//    CREATE TABLE `users` (
//            `user_id` INT NOT NULL AUTO_INCREMENT,
//  `user_name` varchar(45) NOT NULL,
//  `version` INT NOT NULL,
//            `balance` bigint(7) DEFAULT NULL,
//  `total_games` INT DEFAULT NULL,
//            `games_won` INT DEFAULT NULL,
//            `creation_time` TIMESTAMP NULL DEFAULT NOW(),
//  `modified` TIMESTAMP NULL DEFAULT NOW(),
//  `email` varchar(45) NOT NULL,
//    PRIMARY KEY (`user_id`),
//    UNIQUE KEY `email_UNIQUE` (`email`)
//            ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

    private int user_id;
    private String user_name;
    private int version;
    private double balance;
    private int total_games;
    private int games_won;
    private Date creation_time;
    private Date modified;
    private String email;

    public int getUser_id() {
        return user_id;
    }

    @Id
    @GeneratedValue
    @Column(nullable = false)
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    @Column(nullable = false)
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getVersion() {
        return version;
    }

    @Version
    public void setVersion(int version) {
        this.version = version;
    }

    public Date getCreation_time() {
        return creation_time;
    }

    @CreationTimestamp
    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    public Date getModified() {
        return modified;
    }

    @UpdateTimestamp
    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getEmail() {
        return email;
    }
    @Column(nullable = false, unique = true)
    public void setEmail(String email) {
        this.email = email;
    }

}
