package com.rpglegal.api.services;

import com.rpglegal.api.domain.Mestre;
import com.rpglegal.api.domain.Personagem;
import com.rpglegal.api.repositories.MestreRepository;
import com.rpglegal.api.repositories.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MestreService {

    @Autowired
    MestreRepository repository;

    public List<Mestre> getAll()
    {
        return new ArrayList<>(repository.findAll());
    }
    public Mestre getById(Long id)
    {
        return repository.findById(id).get();
    }

    public void saveOrUpdate(Mestre mestre)
    {
        repository.save(mestre);
    }

    public void delete(Long id)
    {
        repository.deleteById(id);
    }
}
