package com.example.eventi.model;

import jakarta.persistence.*;

@Entity
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private Ruolo ruolo;

    public Utente(){}

    public Long getId() {return id;}
    public String getUsername() {return username;}
    public String getPassword() {return password;}
    public Ruolo getRuolo() {return ruolo;}

    public void setUsername(String username) {this.username = username;}
    public void setPassword(String password) {this.password = password;}
    public void setRuolo(Ruolo ruolo) {this.ruolo = ruolo;}
}