package com.app.hibernate.Model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
