package com.app.hibernate.Model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nama")
    private String nama;

    @Column(name = "usia")
    private Long usia;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public User(Long id, String nama, Long usia) {
        this.id = id;
        this.nama = nama;
        this.usia = usia;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Long getUsia() {
        return usia;
    }

    public void setUsia(Long usia) {
        this.usia = usia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
