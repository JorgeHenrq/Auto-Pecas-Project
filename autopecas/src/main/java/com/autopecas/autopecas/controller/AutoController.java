package com.autopecas.autopecas.controller;

import com.autopecas.autopecas.model.Cliente;
import com.autopecas.autopecas.model.Compra;
import com.autopecas.autopecas.model.Peca;
import com.autopecas.autopecas.model.Usuario;
import com.autopecas.autopecas.model.Venda;
import com.autopecas.autopecas.service.ClienteService;
import com.autopecas.autopecas.service.CompraService;
import com.autopecas.autopecas.service.PecaService;
import com.autopecas.autopecas.service.UsuarioService;
import com.autopecas.autopecas.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AutoController {

    

    @Autowired
    VendaService vendaService;
    
    @Autowired
    PecaService pecaService;
    
    @Autowired
    ClienteService clienteService;
    
    @Autowired
    CompraService compraService;
    
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/")
    public String inicio() {
        return "telainicial";
    }

    @GetMapping("/cadastrocliente")
    public String CadastroCliente(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "cadastrocliente";
    }
    
    @PostMapping("/gravar-cliente")
    public String processarFormCliente(Model model, @ModelAttribute Cliente cliente) {
        if (cliente.getId() != null) {
            clienteService.atualizar(cliente.getId(), cliente);
        } else {
            clienteService.criar(cliente);
        }
        return "redirect:/listaPeca";
    }
    
    @GetMapping("/exluir-cliente")
    public String excluirCliente(Model model, @RequestParam String id) {
        Integer idCliente = Integer.parseInt(id);
        clienteService.excluir(idCliente);
        return "redirect:/listaCliente";
    }
    

    @GetMapping("/cadastrocompra")
    public String CadastroCompra(Model model) {
        model.addAttribute("compra", new Compra());
        return "cadastrocompra";
    }
    
    @PostMapping("/gravar-compra")
    public String processarFormCompra(Model model, @ModelAttribute Compra compra) {
        if (compra.getId() != null) {
            compraService.atualizar(compra.getId(), compra);
        } else {
            compraService.criar(compra);
        }
        return "redirect:/listaCompra";
    }
    @GetMapping("/exluir-compra")
    public String excluirCompra(Model model, @RequestParam String id) {
        Integer idCompra = Integer.parseInt(id);
        compraService.excluir(idCompra);
        return "redirect:/listaCompra";
    }
    
   
    @GetMapping("/cadastropeca")
    public String CadastroPeca (Model model) {
        model.addAttribute("peca", new Peca());
        return "cadastropeca";
    }
    

    @PostMapping("/gravar-peca")
    public String processarFormPeca(Model model, @ModelAttribute Peca peca) {
        if (peca.getId() != null) {
            pecaService.atualizar(peca.getId(), peca);
        } else {
            pecaService.criar(peca);
        }
        return "redirect:/listaPeca";
    }

    @GetMapping("/exluir-peca")
    public String excluirPeca(Model model, @RequestParam String id) {
        Integer idPeca = Integer.parseInt(id);
        pecaService.excluir(idPeca);
        return "redirect:/listaPeca";
    }

    @GetMapping("/cadastrousuario")
    public String CadastroUsuario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "cadastrousuario";
    }
    
    @PostMapping("/gravar-usuario")
    public String processarFormUsuario(Model model, @ModelAttribute Usuario usuario) {
        if (usuario.getId() != null) {
            usuarioService.atualizar(usuario.getId(), usuario);
        } else {
            usuarioService.criar(usuario);
        }
        return "redirect:/listaUsuario";
    }
    @GetMapping("/exluir-usuario")
    public String excluirUsuario(Model model, @RequestParam String id) {
        Integer idUsuario = Integer.parseInt(id);
        usuarioService.excluir(idUsuario);
        return "redirect:/listaUsuario";
    }
    
    
    
    
    @GetMapping("/cadastrovenda")
    public String CadastroVenda(Model model) {
        model.addAttribute("venda", new Venda());
        return "cadastrovenda";
    }
    
    @PostMapping("/gravar-venda")
    public String processarFormVenda(Model model, @ModelAttribute Venda venda) {
        if (venda.getId() != null) {
            vendaService.atualizar(venda.getId(), venda);
        } else {
            vendaService.criar(venda);
        }
        return "redirect:/listaVenda";
    }

    @GetMapping("/exluir-venda")
    public String excluirVenda(Model model, @RequestParam String id) {
        Integer idVenda = Integer.parseInt(id);
        vendaService.excluir(idVenda);
        return "redirect:/listaVenda";
    }

    @GetMapping("/listaVenda")
    public String listaVenda(Model model) {
        model.addAttribute("vendas", vendaService.buscarTodos());
        return "listaVenda";
    }
    @GetMapping("/listaPeca")
    public String listaPeca(Model model) {
        model.addAttribute("pecas", pecaService.buscarTodos());
        return "listaPeca";    
    }
    @GetMapping("/listaCliente")
    public String listaCliente(Model model) {
        model.addAttribute("clientes", clienteService.buscarTodos());
        return "listaCliente";    
    }
    @GetMapping("/listaCompra")
    public String listaCompra(Model model) {
        model.addAttribute("compras", compraService.buscarTodos());
        return "listaCompra";    
    }
    @GetMapping("/listaUsuario")
    public String listaUsuario(Model model) {
        model.addAttribute("usuarios", usuarioService.buscarTodos());
        return "listaUsuario";    
    }
}
