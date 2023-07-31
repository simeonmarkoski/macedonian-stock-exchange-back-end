package com.example.stocksbackendspring.repository;

import com.example.stocksbackendspring.model.SBITOPPrices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SBITOPPricesRepository extends JpaRepository<SBITOPPrices, Integer> { }
