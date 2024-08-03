package com.autopecas.autopecas.repository;

import com.autopecas.autopecas.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Integer>{
    
}
