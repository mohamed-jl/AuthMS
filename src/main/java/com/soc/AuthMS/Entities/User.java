package com.soc.AuthMS.Entities;


import javax.persistence.*;

@Entity
@Table(name="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="uname")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="urole")
    private Role role;

    @Column(name="login")
    private String login;

    @Column(name="password")
    private String password;

    public User() {
    }

    public User(Long id, String name, String email, Role role, String login, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
