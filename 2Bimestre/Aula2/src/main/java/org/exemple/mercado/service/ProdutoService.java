package org.exemple.mercado.service;
import java.util.List;

import org.exemple.mercado.model.Produto;
import org.exemple.mercado.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listaProdutos(){
       return produtoRepository.findAll();

    }

    public Produto inserirProduto(Produto produto){
        return produtoRepository.save(produto);
    }

}
