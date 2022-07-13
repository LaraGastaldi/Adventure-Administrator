package com.rpglegal.api.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "personagem")
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String tipo;

    @OneToMany(mappedBy = "personagem")
    private List<Item> itens = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "cena_participantes",
            joinColumns = @JoinColumn(name = "id_personagem"),
            inverseJoinColumns = @JoinColumn(name = "id_cena")
    )
    private List<Cena> cenas;

    public Personagem() {

    }

    public Personagem(Long id, String nome, String tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void associateCena(Cena cena) {
        this.cenas.add(cena);
    }
}
