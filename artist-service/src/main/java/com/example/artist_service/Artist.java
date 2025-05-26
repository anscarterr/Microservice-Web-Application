package com.example.artist_service;

import jakarta.persistence.*;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String country;

    @Column(name = "debut_year")
    private int debutYear;

    public Artist() {}

    public Artist(String name, String country, int debutYear) {
        this.name = name;
        this.country = country;
        this.debutYear = debutYear;
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public int getDebutYear() { return debutYear; }
    public void setDebutYear(int debutYear) { this.debutYear = debutYear; }
}


