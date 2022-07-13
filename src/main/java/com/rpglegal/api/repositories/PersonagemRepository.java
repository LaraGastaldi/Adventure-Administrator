package com.rpglegal.api.repositories;

import com.rpglegal.api.domain.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Long> {

    @Query("select b from Building b where b.id in :ids" )
    List<Personagem> findByIds(@Param("ids") List<Long> personagem_ids);
}
