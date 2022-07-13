package com.rpglegal.api.services;

import com.rpglegal.api.domain.Atributo;
import com.rpglegal.api.domain.Cena;
import com.rpglegal.api.domain.Personagem;
import com.rpglegal.api.repositories.AtributoRepository;
import com.rpglegal.api.repositories.CenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CenaService {

    @Autowired
    CenaRepository repository;

    @Autowired
    PersonagemService personagemService;

    public List<Cena> getAll()
    {
        return new ArrayList<>(repository.findAll());
    }

    public Cena getById(Long id)
    {
        return repository.findById(id).get();
    }

    public void saveOrUpdate(Cena cena)
    {
        repository.save(cena);
    }

    public void delete(Long id)
    {
        repository.deleteById(id);
    }

    public void associateUsers(Long cena_id, List<Long> personagem_ids) {
        List<Personagem> personagens = personagemService.getByIds(personagem_ids);
        Cena cena = getById(cena_id);

        for (Personagem personagem : personagens) {
            cena.associateUsers(personagem);
        }
        repository.save(cena);
    }
}
