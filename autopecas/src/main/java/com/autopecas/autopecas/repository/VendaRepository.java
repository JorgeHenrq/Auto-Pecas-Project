package com.autopecas.autopecas.repository;

import com.autopecas.autopecas.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer>{
        
}
