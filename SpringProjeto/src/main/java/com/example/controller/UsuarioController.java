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

import com.example.model.Usuario;
import com.example.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	  @Autowired
	    private UsuarioService usuarioService;

	    @GetMapping
	    public List<Usuario> getAllUsuarios() {
	        return usuarioService.getAllUsuarios();
	    }

	    @GetMapping("/{id}")
	    public Usuario getUsuarioById(@PathVariable Long id) {
	        return usuarioService.getUsuarioById(id);
	    }

	    @PostMapping
	    public Usuario addUsuario(@RequestBody Usuario usuario) {
	        return usuarioService.addUsuario(usuario);
	    }

	    @PutMapping("/{id}")
	    public Usuario updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
	        return usuarioService.updateUsuario(id, usuario);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteUsuario(@PathVariable Long id) {
	        usuarioService.deleteUsuario(id);
	    }
	}
