package com.example.eventi.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titolo;
    private String descrizione;
    private LocalDate data;
    private String luogo;
    private int postiDisponibili;

    @ManyToOne
    private Utente organizzatore;

    public Evento(){}

    public Long getId(){return id;}
    public String getTitolo(){return titolo;}
    public String getDescrizione(){return descrizione;}
    public LocalDate getData(){return data;}
    public String getLuogo(){return luogo;}
    public int getPostiDisponibili(){return postiDisponibili;}
    public Utente getOrganizzatore(){return organizzatore;}

    public void setTitolo(String titolo){this.titolo = titolo;}
    public void setDescrizione(String descrizione){this.descrizione = descrizione;}
    public void setData(LocalDate data){this.data = data;}
    public void setLuogo(String luogo){this.luogo = luogo;}
    public void setPostiDisponibili(int postiDisponibili){this.postiDisponibili = postiDisponibili;}
    public void setOrganizzatore(Utente organizzatore){this.organizzatore = organizzatore;}
}