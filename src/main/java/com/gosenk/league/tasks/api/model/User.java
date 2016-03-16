package com.gosenk.league.tasks.api.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @OneToMany(fetch=FetchType.EAGER)
    @JoinColumn(name="user_id")
    private Set<UserChampion> userChampions;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<UserChampion> getUserChampions() {
        return userChampions;
    }

    public void setUserChampions(Set<UserChampion> userChampions) {
        this.userChampions = userChampions;
    }
}
