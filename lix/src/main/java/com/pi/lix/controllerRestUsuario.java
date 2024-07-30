
package com.pi.lix;

import com.pi.lix.data.usuarioEntity;

import com.pi.lix.service.usuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/usuario")

public class controllerRestUsuario {

    @Autowired

    usuarioService serv;

    @GetMapping("/listar")

    public ResponseEntity<List> getAll() {

        List<usuarioEntity> lista = serv.listarTodos();

        return new ResponseEntity<>(lista, HttpStatus.OK);

    }

    @GetMapping("/pesquisar/{id}")

    public ResponseEntity<usuarioEntity> getById(@PathVariable Integer id) {

        usuarioEntity ent = serv.getById(id);

        return new ResponseEntity<>(ent, HttpStatus.OK);

    }

    @PostMapping("/adicionar")

    public ResponseEntity<usuarioEntity> cadastrar(@RequestBody usuarioEntity func) {

        var ent = serv.cadastrar(func);

        return new ResponseEntity<>(ent, HttpStatus.CREATED);

    }

    @PutMapping("/atualizar/{id}")

    public ResponseEntity<usuarioEntity> atualizar(@PathVariable Integer id, @RequestBody usuarioEntity f) {

        var ent= serv.atualizar(id, f);

        return new ResponseEntity<>(ent, HttpStatus.OK);

    }

    @DeleteMapping("/deletar/{id}")

    public ResponseEntity deletar(@PathVariable Integer id) {

        serv.deletar(id);

        return new ResponseEntity<>(HttpStatus.OK);

    }

}
