package com.example.stocksbackendspring.service;

import com.example.stocksbackendspring.model.BELEX15Companies;
import com.example.stocksbackendspring.model.MBI10Companies;

import java.util.List;
import java.util.Optional;

public interface BELEX15CompaniesService {

    List<BELEX15Companies> listBELEX15Companies();

    Optional<BELEX15Companies> findById(Integer id);

}
