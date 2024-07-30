
package com.pi.lix;

import com.pi.lix.data.destinoEntity;

import com.pi.lix.service.destinoService;

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

@RequestMapping("/destino")

public class controllerRestDestino {

    @Autowired

    destinoService serv;

    @GetMapping("/listar")

    public ResponseEntity<List> getAll() {

        List<destinoEntity> lista = serv.listarTodos();

        return new ResponseEntity<>(lista, HttpStatus.OK);

    }

    @GetMapping("/pesquisar/{id}")

    public ResponseEntity<destinoEntity> getById(@PathVariable Integer id) {

        destinoEntity ent = serv.getById(id);

        return new ResponseEntity<>(ent, HttpStatus.OK);

    }

    @PostMapping("/adicionar")

    public ResponseEntity<destinoEntity> cadastrar(@RequestBody destinoEntity func) {

        var ent = serv.cadastrar(func);

        return new ResponseEntity<>(ent, HttpStatus.CREATED);

    }

    @PutMapping("/atualizar/{id}")

    public ResponseEntity<destinoEntity> atualizar(@PathVariable Integer id, @RequestBody destinoEntity f) {

        var ent= serv.atualizar(id, f);

        return new ResponseEntity<>(ent, HttpStatus.OK);

    }

    @DeleteMapping("/deletar/{id}")

    public ResponseEntity deletar(@PathVariable Integer id) {

        serv.deletar(id);

        return new ResponseEntity<>(HttpStatus.OK);

    }

}
