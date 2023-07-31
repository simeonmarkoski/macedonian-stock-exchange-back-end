package com.example.stocksbackendspring.repository;

import com.example.stocksbackendspring.model.BELEX15Companies;
import com.example.stocksbackendspring.model.BELEX15Prices;
import com.example.stocksbackendspring.model.MBI10Companies;
import com.example.stocksbackendspring.model.MBI10Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BELEX15PricesRepository extends JpaRepository<BELEX15Prices, Integer> {

    @Query("SELECT p FROM BELEX15Prices p WHERE p.company = :company")
    List<BELEX15Prices> findCompanyPricesByCompany(@Param("company") Optional<BELEX15Companies> company);
}
