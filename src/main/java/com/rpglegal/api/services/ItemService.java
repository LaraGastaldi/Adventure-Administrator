package com.rpglegal.api.services;

import com.rpglegal.api.domain.Atributo;
import com.rpglegal.api.domain.Item;
import com.rpglegal.api.repositories.AtributoRepository;
import com.rpglegal.api.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository repository;

    public List<Item> getAll()
    {
        return new ArrayList<>(repository.findAll());
    }
    
    public Item getById(Long id)
    {
        return repository.findById(id).get();
    }

    public void saveOrUpdate(Item item)
    {
        repository.save(item);
    }

    public void delete(Long id)
    {
        repository.deleteById(id);
    }
}
