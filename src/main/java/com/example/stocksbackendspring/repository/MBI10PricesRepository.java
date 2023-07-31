package com.example.stocksbackendspring.repository;

import com.example.stocksbackendspring.model.MBI10Companies;
import com.example.stocksbackendspring.model.MBI10Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MBI10PricesRepository extends JpaRepository<MBI10Prices, Integer> {

    @Query("SELECT p FROM MBI10Prices p WHERE p.company = :company")
    List<MBI10Prices> findCompanyPricesByCompany(@Param("company") Optional<MBI10Companies> company);
}
