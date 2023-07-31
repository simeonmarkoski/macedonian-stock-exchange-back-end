package com.example.stocksbackendspring.repository;

import com.example.stocksbackendspring.model.MBI10AveragePrices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface MBI10AveragePricesRepository extends JpaRepository<MBI10AveragePrices, Timestamp> {
}
