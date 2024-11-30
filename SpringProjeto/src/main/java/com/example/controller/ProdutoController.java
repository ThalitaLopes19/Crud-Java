package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Produto;
import com.example.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	 @Autowired
	    private ProdutoService produtoService;

	    @GetMapping
	    public List<Produto> getAllProdutos() {
	        return produtoService.getAllProdutos();
	    }

	    @GetMapping("/{id}")
	    public Produto getProdutoById(@PathVariable Long id) {
	        return produtoService.getProdutoById(id);
	    }

	    @PostMapping
	    public Produto addProduto(@RequestBody Produto produto) {
	        return produtoService.addProduto(produto);
	    }

	    @PutMapping("/{id}")
	    public Produto updateProduto(@PathVariable Long id, @RequestBody Produto produto) {
	        return produtoService.updateProduto(id, produto);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteProduto(@PathVariable Long id) {
	        produtoService.deleteProduto(id);
	    }
	}