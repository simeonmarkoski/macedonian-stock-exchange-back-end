package com.example.stocksbackendspring.repository;

import com.example.stocksbackendspring.model.SBITOPAveragePrices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface SBITOPAveragePricesRepository extends JpaRepository<SBITOPAveragePrices, Timestamp> {

}
