package com.autopecas.autopecas.service;

import com.autopecas.autopecas.model.Peca;
import com.autopecas.autopecas.repository.PecaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PecaService {
    @Autowired
    PecaRepository pecaRepository;
    
    public Peca buscarPorId(Integer id){
        return pecaRepository.findById(id).orElseThrow();
    }
    
    public Peca criar(Peca peca){
        peca.setId(null);
        pecaRepository.save(peca);
        return peca;
        
    }
    public List<Peca> buscarTodos(){
        return pecaRepository.findAll();
    }
    
    public void excluir(Integer id) {
        Peca pecaEncontrada = buscarPorId(id);
        pecaRepository.deleteById(pecaEncontrada.getId());
    }
    
    public Peca atualizar(Integer id, Peca pecaEnviada){
       Peca pecaEncontrada = buscarPorId(id);
       
       pecaEncontrada.setDiscricao(pecaEnviada.getDiscricao());
       pecaEncontrada.setMarca(pecaEnviada.getMarca());
       pecaEncontrada.setAplicacao(pecaEnviada.getAplicacao());
       pecaEncontrada.setValorCompra(pecaEnviada.getValorCompra());
       pecaEncontrada.setValorVenda(pecaEnviada.getValorVenda());
       pecaRepository.save(pecaEncontrada);
       return pecaEncontrada;
   }   
    
    
}

