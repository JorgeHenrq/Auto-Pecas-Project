package com.autopecas.autopecas.repository;

import com.autopecas.autopecas.model.Peca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PecaRepository extends JpaRepository<Peca, Integer>{
    
}
