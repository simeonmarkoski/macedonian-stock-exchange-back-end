package com.example.stocksbackendspring.service.impl;

import com.example.stocksbackendspring.model.SBITOPPrices;
import com.example.stocksbackendspring.repository.SBITOPPricesRepository;
import com.example.stocksbackendspring.service.SBITOPPricesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SBITOPPricesServiceImpl implements SBITOPPricesService {

    private final SBITOPPricesRepository sbitopPricesRepository;

    public SBITOPPricesServiceImpl(SBITOPPricesRepository sbitopPricesRepository) {
        this.sbitopPricesRepository = sbitopPricesRepository;
    }

    @Override
    public List<SBITOPPrices> listSBITOPPrices() {
        return sbitopPricesRepository.findAll();
    }
}
