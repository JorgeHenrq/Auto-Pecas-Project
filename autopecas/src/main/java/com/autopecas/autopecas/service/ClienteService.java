package com.autopecas.autopecas.service;

import com.autopecas.autopecas.model.Cliente;
import com.autopecas.autopecas.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;
       
    public Cliente buscarPorId(Integer id){
        return clienteRepository.findById(id).orElseThrow();
    }
    
    public Cliente criar(Cliente cliente){
        cliente.setId(null);
        clienteRepository.save(cliente);
        return cliente;
        
    }
    public List<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }
    
    public void excluir(Integer id) {
        Cliente clienteEncontrado = buscarPorId(id);
        clienteRepository.deleteById(clienteEncontrado.getId());
    }
    
    public Cliente atualizar(Integer id, Cliente clienteEnviado){
       Cliente clienteEncontrado = buscarPorId(id);
       
       clienteEncontrado.setNomeCliente(clienteEnviado.getNomeCliente());
       clienteEncontrado.setCpfCliente(clienteEnviado.getCpfCliente());
       clienteEncontrado.setEndereco(clienteEnviado.getEndereco());
       clienteEncontrado.setCidade(clienteEnviado.getCidade());
       clienteEncontrado.setBairro(clienteEnviado.getBairro());
       clienteEncontrado.setNumero(clienteEnviado.getNumero());
       clienteEncontrado.setContato(clienteEnviado.getContato());
       clienteRepository.save(clienteEncontrado);
       return clienteEncontrado;

   }   
    
    
}