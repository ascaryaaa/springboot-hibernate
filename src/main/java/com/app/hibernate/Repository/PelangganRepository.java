package com.app.hibernate.Repository;

import com.app.hibernate.Model.Pelanggan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PelangganRepository extends CrudRepository<Pelanggan, Long> {
}
