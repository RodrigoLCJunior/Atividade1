package org.exemple.mercado.controller;

import java.util.List;

import org.exemple.mercado.model.Produto;
import org.exemple.mercado.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    
    @Autowired()
    private ProdutoService produtoService;

    @GetMapping()
    public List<Produto> listarProduto(){
        return produtoService.listaProdutos();
    }

    @PostMapping()
    public Produto incluirProduto(@RequestBody Produto produto){
        return produtoService.inserirProduto(produto);
    }

}
