package com.autopecas.autopecas.service;

import com.autopecas.autopecas.model.Venda;
import com.autopecas.autopecas.repository.VendaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {
    @Autowired
    VendaRepository vendaRepository;
       
    public Venda buscarPorId(Integer id){
        return vendaRepository.findById(id).orElseThrow();
    }
    
    public Venda criar(Venda venda){
        venda.setId(null);
        vendaRepository.save(venda);
        return venda;
        
    }
    public List<Venda> buscarTodos(){
        return vendaRepository.findAll();
    }
    
    public void excluir(Integer id) {
        Venda vendaEncontrada = buscarPorId(id);
        vendaRepository.deleteById(vendaEncontrada.getId());
    }
    
    public Venda atualizar(Integer id, Venda vendaEnviada){
       Venda vendaEncontrada = buscarPorId(id);
       
       vendaEncontrada.setDiscricaoVenda(vendaEnviada.getDiscricaoVenda());
       vendaEncontrada.setCpfCliente(vendaEnviada.getCpfCliente());
       vendaEncontrada.setQuantidade(vendaEnviada.getQuantidade());
       vendaEncontrada.setValorVenda(vendaEnviada.getValorVenda());
       vendaEncontrada.setDataVenda(vendaEnviada.getDataVenda());
       vendaRepository.save(vendaEncontrada);
       return vendaEncontrada;
   }   
    
    
}
