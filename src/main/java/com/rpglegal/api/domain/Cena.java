package com.rpglegal.api.domain;

import javax.persistence.*;
import java.util.List;

public class Cena {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String desc;

    @ManyToOne
    @JoinColumn(name = "id_mestre")
    private Mestre mestre;

    @ManyToMany
    @JoinTable(
            name = "cena_participantes",
            joinColumns = @JoinColumn(name = "id_cena"),
            inverseJoinColumns = @JoinColumn(name = "id_personagem")
    )
    private List<Personagem> personagens;

    public Cena() {

    }

    public Cena(Long id, String desc) {
        this.id = id;
        this.desc = desc;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void associateUsers(Personagem personagem) {
        this.personagens.add(personagem);
    }
}
