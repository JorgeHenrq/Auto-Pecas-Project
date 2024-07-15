package com.autopecas.autopecas.controller;

import com.autopecas.autopecas.model.Cliente;
import com.autopecas.autopecas.model.Compra;
import com.autopecas.autopecas.model.Peca;
import com.autopecas.autopecas.model.Usuario;
import com.autopecas.autopecas.model.Venda;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AutoController {
    @GetMapping("/")
    public String inicio(){
        return "telainicial";
    }
    @GetMapping("/cadastrocliente")
    public String CadastroCliente(Model model){
        model.addAttribute("cliente", new Cliente());
        return "cadastrocliente";
    }
    @GetMapping("/cadastrocompra")
    public String CadastroCompra(Model model){
        model.addAttribute("compra", new Compra());
        return "cadastrocompra";
    }
    @GetMapping("/cadastrovenda")
    public String CadastroVenda(Model model){
        model.addAttribute("venda", new Venda());
        return "cadastrovenda";
    }
    @GetMapping("/cadastropeca")
    public String CadastroPeca(Model model){
        model.addAttribute("peca", new Peca());
        return "cadastropeca";
    }
    @GetMapping("/cadastrousuario")
    public String CadastroUsuario(Model model){
        model.addAttribute("usuario", new Usuario());
        return "cadastrousuario";
    }
    
    
}
