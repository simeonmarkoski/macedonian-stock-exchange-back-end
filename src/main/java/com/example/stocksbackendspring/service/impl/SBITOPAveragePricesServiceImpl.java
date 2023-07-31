package com.example.stocksbackendspring.service.impl;

import com.example.stocksbackendspring.model.SBITOPAveragePrices;
import com.example.stocksbackendspring.repository.SBITOPAveragePricesRepository;
import com.example.stocksbackendspring.service.SBITOPAveragePricesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SBITOPAveragePricesServiceImpl implements SBITOPAveragePricesService {

    private final SBITOPAveragePricesRepository sbitopAveragePricesRepository;


    public SBITOPAveragePricesServiceImpl(SBITOPAveragePricesRepository sbitopAveragePricesRepository) {
        this.sbitopAveragePricesRepository = sbitopAveragePricesRepository;
    }


    @Override
    public List<SBITOPAveragePrices> listSBITOPAveragePrices() {
        return sbitopAveragePricesRepository.findAll();
    }
}
