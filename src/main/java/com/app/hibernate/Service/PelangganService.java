package com.app.hibernate.Service;


import com.app.hibernate.Model.Pelanggan;
import com.app.hibernate.Repository.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PelangganService {

    @Autowired
    private final PelangganRepository pelangganRepository;

    public PelangganService(PelangganRepository pelangganRepository) {

        this.pelangganRepository = pelangganRepository;
    }

    public Iterable<Pelanggan> getAllPelanggan() {

        return pelangganRepository.findAll();
    }

    public Pelanggan getPelangganId(Long id) {

        return pelangganRepository.findById(id).orElse(null);
    }

    public Pelanggan simpanPelanggan(Pelanggan pelanggan) {
        return pelangganRepository.save(pelanggan);
    }

    public void hapusPelanggan(Long id) {
        pelangganRepository.deleteById(id);
    }
}
