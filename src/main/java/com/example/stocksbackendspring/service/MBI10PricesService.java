package com.example.stocksbackendspring.service;

import com.example.stocksbackendspring.model.MBI10Companies;
import com.example.stocksbackendspring.model.MBI10Prices;

import java.util.List;
import java.util.Optional;

public interface MBI10PricesService {

    List<MBI10Prices> listMBI10Prices();

    Optional<List<MBI10Prices>> findCompanyPricesByCompany(Optional<MBI10Companies> company);
}
