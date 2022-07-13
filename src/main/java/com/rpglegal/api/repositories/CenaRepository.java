package com.rpglegal.api.repositories;

import com.rpglegal.api.domain.Atributo;
import com.rpglegal.api.domain.Cena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenaRepository extends JpaRepository<Cena, Long> {
}
