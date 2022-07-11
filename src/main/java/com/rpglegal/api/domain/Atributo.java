package com.rpglegal.api.domain;

import javax.persistence.*;

@Entity
@Table(name = "atributo")
public class Atributo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Integer nivel;

    @ManyToOne
    @JoinColumn(name = "personagem_id")
    private Personagem personagem;

    public Atributo() {

    }

    public Atributo(Long id, String nome, Integer nivel) {
        this.id = id;
        this.nome = nome;
        this.nivel = nivel;
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

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

}
