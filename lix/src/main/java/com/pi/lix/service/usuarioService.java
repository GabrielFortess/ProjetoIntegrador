
package com.pi.lix.service;

import com.pi.lix.data.usuarioEntity;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.pi.lix.data.usuarioRepository;

@Service

public class usuarioService {

    @Autowired

    usuarioRepository rep;

    public usuarioEntity cadastrar(usuarioEntity e) {

        e.setId(null);

        rep.save(e);

        return e;

    }

    public usuarioEntity atualizar(Integer id, usuarioEntity e) {

        usuarioEntity f = getById(id);

        f.setNome(e.getNome());
        f.setSenha(e.getSenha());
        f.setCpf(e.getCpf());
        f.setFuncao(e.getFuncao());
        f.setSalario(e.getSalario());
        f.setEndereco(e.getEndereco());
        
        rep.save(f);

        return f;

    }

    public usuarioEntity getById(Integer id) {

        return rep.findById(id).orElse(null);

    }

    public List<usuarioEntity> listarTodos() {

        return rep.findAll();

    }

    public void deletar(Integer id) {

        usuarioEntity e = getById(id);

        rep.deleteById(e.getId());

    }

}
