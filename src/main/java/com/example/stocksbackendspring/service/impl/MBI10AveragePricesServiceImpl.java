package com.example.stocksbackendspring.service.impl;

import com.example.stocksbackendspring.model.MBI10AveragePrices;
import com.example.stocksbackendspring.repository.MBI10AveragePricesRepository;
import com.example.stocksbackendspring.service.MBI10AveragePricesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MBI10AveragePricesServiceImpl implements MBI10AveragePricesService {

    private final MBI10AveragePricesRepository mbi10AveragePricesRepository;


    public MBI10AveragePricesServiceImpl(MBI10AveragePricesRepository mbi10AveragePricesRepository) {
        this.mbi10AveragePricesRepository = mbi10AveragePricesRepository;
    }


    @Override
    public List<MBI10AveragePrices> listMBI10AveragePrices() {
        return mbi10AveragePricesRepository.findAll();
    }
}
