package com.autopecas.autopecas.service;

import com.autopecas.autopecas.model.Compra;
import com.autopecas.autopecas.repository.CompraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CompraService {
    @Autowired
    CompraRepository compraRepository;
       
    public Compra buscarPorId(Integer id){
        return compraRepository.findById(id).orElseThrow();
    }
    
    public Compra criar(Compra compra){
        compra.setId(null);
        compraRepository.save(compra);
        return compra;
        
    }
    public List<Compra> buscarTodos(){
        return compraRepository.findAll();
    }
    
    public void excluir(Integer id) {
        Compra compraEncontrada = buscarPorId(id);
        compraRepository.deleteById(compraEncontrada.getId());
    }
    
    public Compra atualizar(Integer id, Compra compraEnviada){
       Compra compraEncontrada = buscarPorId(id);
       
       compraEncontrada.setDiscricaoCompra(compraEnviada.getDiscricaoCompra());
       compraEncontrada.setQuantidade(compraEnviada.getQuantidade());
       compraEncontrada.setValorCompra(compraEnviada.getValorCompra());
       compraEncontrada.setDataCompra(compraEnviada.getDataCompra());
       compraRepository.save(compraEncontrada);
       return compraEncontrada;
       
   }   
    
    
}
