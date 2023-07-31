package com.example.stocksbackendspring.service.impl;

import com.example.stocksbackendspring.model.BELEX15Companies;
import com.example.stocksbackendspring.model.MBI10Companies;
import com.example.stocksbackendspring.repository.BELEX15CompaniesRepository;
import com.example.stocksbackendspring.service.BELEX15CompaniesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BELEX15CompaniesServiceImpl implements BELEX15CompaniesService {

    private final BELEX15CompaniesRepository belex15CompaniesRepository;

    public BELEX15CompaniesServiceImpl(BELEX15CompaniesRepository belex15CompaniesRepository) {
        this.belex15CompaniesRepository = belex15CompaniesRepository;
    }

    @Override
    public List<BELEX15Companies> listBELEX15Companies() {
        return belex15CompaniesRepository.findAll();
    }

    @Override
    public Optional<BELEX15Companies> findById(Integer id) {
        return belex15CompaniesRepository.findById(id);
    }
}
