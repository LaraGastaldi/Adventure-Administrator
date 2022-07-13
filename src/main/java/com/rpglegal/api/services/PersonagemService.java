package com.rpglegal.api.services;

import com.rpglegal.api.domain.Cena;
import com.rpglegal.api.domain.Personagem;
import com.rpglegal.api.repositories.CenaRepository;
import com.rpglegal.api.repositories.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    PersonagemRepository repository;

    @Autowired
    CenaService cenaService;

    public List<Personagem> getAllPersonagens()
    {
        return new ArrayList<>(repository.findAll());
    }
    public Personagem getById(Long id)
    {
        return repository.findById(id).get();
    }

    public List<Personagem> getByIds(List<Long> ids)
    {
        return repository.findByIds(ids);
    }

    public void saveOrUpdate(Personagem personagem)
    {
        repository.save(personagem);
    }

    public void delete(Long id)
    {
        repository.deleteById(id);
    }

    public void associateCena(Long personagem_id, Long cena_id) {
        Personagem personagem = getById(personagem_id);
        Cena cena = cenaService.getById(cena_id);

        personagem.associateCena(cena);
        repository.save(personagem);
    }
}
