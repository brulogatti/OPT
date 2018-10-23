package com.projcontrolelocacaocarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projcontrolelocacaocarro.model.Locacao;

@Repository
public interface LocacaoRepository extends JpaRepository<Locacao, Integer> { } 

