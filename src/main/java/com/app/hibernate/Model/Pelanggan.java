package com.app.hibernate.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "pelanggan")
public class Pelanggan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelanggan")
    private Long idPelanggan;

    @Column(name = "nama_pelanggan")
    private String namePelanggan;

    @Column(name = "alamat")
    private String alamat;
}
