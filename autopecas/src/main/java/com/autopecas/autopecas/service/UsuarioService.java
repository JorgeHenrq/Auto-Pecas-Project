/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.autopecas.autopecas.service;

import com.autopecas.autopecas.model.Usuario;
import com.autopecas.autopecas.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
       
    public Usuario buscarPorId(Integer id){
        return usuarioRepository.findById(id).orElseThrow();
    }
    
    public Usuario criar(Usuario usuario){
        usuario.setId(null);
        usuarioRepository.save(usuario);
        return usuario;
        
    }
    public List<Usuario> buscarTodos(){
        return usuarioRepository.findAll();
    }
    
    public void excluir(Integer id) {
        Usuario usuarioEncontrado = buscarPorId(id);
        usuarioRepository.deleteById(usuarioEncontrado.getId());
    }
    
    public Usuario atualizar(Integer id, Usuario usuarioEnviado){
       Usuario usuarioEncontrado = buscarPorId(id);
       
       usuarioEncontrado.setNomeUsuario(usuarioEnviado.getNomeUsuario());
       usuarioEncontrado.setCpfUsuario(usuarioEnviado.getCpfUsuario());
       usuarioEncontrado.setCargo(usuarioEnviado.getCargo());
       usuarioEncontrado.setLogin(usuarioEnviado.getLogin());
       usuarioEncontrado.setSenha(usuarioEnviado.getSenha());
       usuarioRepository.save(usuarioEncontrado);
       return usuarioEncontrado;
       

   }   
    
    
}
