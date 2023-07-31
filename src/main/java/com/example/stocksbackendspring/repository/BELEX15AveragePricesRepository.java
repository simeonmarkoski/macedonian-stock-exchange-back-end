package com.example.stocksbackendspring.repository;

import com.example.stocksbackendspring.model.BELEX15AveragePrices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface BELEX15AveragePricesRepository extends JpaRepository<BELEX15AveragePrices, Timestamp> {
}
