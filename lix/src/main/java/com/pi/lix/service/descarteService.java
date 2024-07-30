
package com.pi.lix.service;

import com.pi.lix.data.descarteEntity;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.pi.lix.data.descarteRepository;

@Service

public class descarteService {

    @Autowired

    descarteRepository rep;

    public descarteEntity cadastrar(descarteEntity e) {

        e.setId(null);

        rep.save(e);

        return e;

    }

    public descarteEntity atualizar(Integer id, descarteEntity e) {

        descarteEntity f = getById(id);

        f.setNome(e.getNome());
        f.setTipo(e.getTipo());
        f.setDestino(e.getDestino());

        rep.save(f);

        return f;

    }

    public descarteEntity getById(Integer id) {

        return rep.findById(id).orElse(null);

    }

    public List<descarteEntity> listarTodos() {

        return rep.findAll();

    }

    public void deletar(Integer id) {

        descarteEntity e = getById(id);

        rep.deleteById(e.getId());

    }

}
