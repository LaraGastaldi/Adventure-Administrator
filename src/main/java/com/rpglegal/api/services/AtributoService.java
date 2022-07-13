package com.rpglegal.api.services;

import com.rpglegal.api.domain.Atributo;
import com.rpglegal.api.domain.Mestre;
import com.rpglegal.api.repositories.AtributoRepository;
import com.rpglegal.api.repositories.MestreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AtributoService {

    @Autowired
    AtributoRepository repository;

    public List<Atributo> getAll()
    {
        return new ArrayList<>(repository.findAll());
    }

    public Atributo getById(Long id)
    {
        return repository.findById(id).get();
    }

    public void saveOrUpdate(Atributo mestre)
    {
        repository.save(mestre);
    }

    public void delete(Long id)
    {
        repository.deleteById(id);
    }
}
