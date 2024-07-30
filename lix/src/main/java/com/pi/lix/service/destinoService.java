
package com.pi.lix.service;

import com.pi.lix.data.destinoEntity;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.pi.lix.data.destinoRepository;

@Service

public class destinoService {

    @Autowired

    destinoRepository rep;

    public destinoEntity cadastrar(destinoEntity e) {

        e.setId(null);

        rep.save(e);

        return e;

    }

    public destinoEntity atualizar(Integer id, destinoEntity e) {

        destinoEntity f = getById(id);

        f.setNome(e.getNome());
        f.setEndereco(e.getEndereco());
        f.setUnidades(e.getUnidades());
        f.setData(e.getData());
        
        rep.save(f);

        return f;

    }

    public destinoEntity getById(Integer id) {

        return rep.findById(id).orElse(null);

    }

    public List<destinoEntity> listarTodos() {

        return rep.findAll();

    }

    public void deletar(Integer id) {

        destinoEntity e = getById(id);

        rep.deleteById(e.getId());

    }

}
