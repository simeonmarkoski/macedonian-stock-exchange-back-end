package com.example.stocksbackendspring.repository;

import com.example.stocksbackendspring.model.BELEX15Companies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BELEX15CompaniesRepository extends JpaRepository<BELEX15Companies, Integer> { }
