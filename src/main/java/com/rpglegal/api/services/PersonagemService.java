package com.rpglegal.api.services;

import com.rpglegal.api.domain.Personagem;
import com.rpglegal.api.repositories.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    PersonagemRepository repository;

    public List<Personagem> getAllPersonagens()
    {
        List<Personagem> personagens = new ArrayList<Personagem>();
        repository.findAll().forEach(personagem -> personagens.add((personagem)));
        return personagens;
    }
    public Personagem getById(Long id)
    {
        return repository.findById(id).get();
    }

    public void saveOrUpdate(Personagem personagem)
    {
        repository.save(personagem);
    }

    public void delete(Long id)
    {
        repository.deleteById(id);
    }

    public void update(Personagem personagem, int personagem_id)
    {
        repository.save(personagem);
    }
}
