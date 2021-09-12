package com.felipebreve.fsbvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipebreve.fsbvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
