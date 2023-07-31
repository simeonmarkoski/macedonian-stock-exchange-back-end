package com.example.stocksbackendspring.service.impl;

import com.example.stocksbackendspring.model.BELEX15AveragePrices;
import com.example.stocksbackendspring.repository.BELEX15AveragePricesRepository;
import com.example.stocksbackendspring.service.BELEX15AveragePricesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BELEX15AveragePricesServiceImpl implements BELEX15AveragePricesService {

    private final BELEX15AveragePricesRepository belex15AveragePricesRepository;

    public BELEX15AveragePricesServiceImpl(BELEX15AveragePricesRepository belex15AveragePricesRepository) {
        this.belex15AveragePricesRepository = belex15AveragePricesRepository;
    }

    @Override
    public List<BELEX15AveragePrices> listBELEX15AveragePrices() {
        return belex15AveragePricesRepository.findAll();
    }
}
