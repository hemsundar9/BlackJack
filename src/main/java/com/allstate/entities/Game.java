package com.allstate.entities;

import com.allstate.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "games")
@Data
public class Game {

    private int id;
    private Status status;
    private int version;
    private String cards_player;
    private String cards_dealer;
    private int player;
    private int bet;
    private Date creation_time;
    private Date modified;

    public int getId() {
        return id;
    }

    @Id
    @GeneratedValue
    @Column(nullable = false)
    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getVersion() {
        return version;
    }

    @Version
    public void setVersion(int version) {
        this.version = version;
    }

    public int getPlayer() {
        return player;
    }

    @ManyToOne
    @JoinColumn(name="user_id")
    @JsonIgnore
    public void setPlayer(int player) {
        this.player = player;
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
}
