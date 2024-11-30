package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Produto;
import com.example.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	 @Autowired
	    private ProdutoRepository produtoRepository;

	    public List<Produto> getAllProdutos() {
	        List<Produto> produtos = new ArrayList<>();
	        produtoRepository.findAll().forEach(produtos::add);
	        return produtos;
	    }

	    public Produto getProdutoById(Long id) {
	        return produtoRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
	    }

	    public Produto addProduto(Produto produto) {
	        return produtoRepository.save(produto);
	    }

	    public Produto updateProduto(Long id, Produto produto) {
	        produto.setId(id); 
	        return produtoRepository.save(produto);
	    }

	    public void deleteProduto(Long id) {
	        produtoRepository.deleteById(id);
	    }
	}