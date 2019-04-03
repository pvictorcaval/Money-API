package com.moneyapi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moneyapi.api.model.Lancamento;
import com.moneyapi.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
