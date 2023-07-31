package com.example.stocksbackendspring.repository;

import com.example.stocksbackendspring.model.MBI10Companies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MBI10CompaniesRepository extends JpaRepository<MBI10Companies, Integer> { }
