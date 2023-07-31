package com.example.stocksbackendspring.service.impl;

import com.example.stocksbackendspring.model.BELEX15Companies;
import com.example.stocksbackendspring.model.BELEX15Prices;
import com.example.stocksbackendspring.repository.BELEX15PricesRepository;
import com.example.stocksbackendspring.service.BELEX15PricesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BELEX15PricesServiceImpl implements BELEX15PricesService {

    private final BELEX15PricesRepository belex15PricesRepository;

    public BELEX15PricesServiceImpl(BELEX15PricesRepository belex15PricesRepository) {
        this.belex15PricesRepository = belex15PricesRepository;
    }

    @Override
    public List<BELEX15Prices> listBELEX15Prices() {
        return belex15PricesRepository.findAll();
    }

    @Override
    public Optional<List<BELEX15Prices>> findCompanyPricesByCompany(Optional<BELEX15Companies> company) {
        return Optional.ofNullable(belex15PricesRepository.findCompanyPricesByCompany(company));
    }
}
