package com.example.stocksbackendspring.service.impl;

import com.example.stocksbackendspring.model.MBI10Companies;
import com.example.stocksbackendspring.model.MBI10Prices;
import com.example.stocksbackendspring.repository.MBI10PricesRepository;
import com.example.stocksbackendspring.service.MBI10PricesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MBI10PricesServiceImpl implements MBI10PricesService {

    private final MBI10PricesRepository mbi10PricesRepository;

    public MBI10PricesServiceImpl(MBI10PricesRepository mbi10PricesRepository) {
        this.mbi10PricesRepository = mbi10PricesRepository;
    }

    @Override
    public List<MBI10Prices> listMBI10Prices() {
        return mbi10PricesRepository.findAll();
    }

    @Override
    public Optional<List<MBI10Prices>> findCompanyPricesByCompany(Optional<MBI10Companies> company) {
        return Optional.ofNullable(mbi10PricesRepository.findCompanyPricesByCompany(company));
    }
}
