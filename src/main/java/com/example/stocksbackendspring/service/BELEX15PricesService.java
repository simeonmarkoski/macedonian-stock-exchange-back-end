package com.example.stocksbackendspring.service;

import com.example.stocksbackendspring.model.BELEX15Companies;
import com.example.stocksbackendspring.model.BELEX15Prices;
import com.example.stocksbackendspring.model.MBI10Companies;
import com.example.stocksbackendspring.model.MBI10Prices;

import java.util.List;
import java.util.Optional;

public interface BELEX15PricesService {

    List<BELEX15Prices> listBELEX15Prices();

    Optional<List<BELEX15Prices>> findCompanyPricesByCompany(Optional<BELEX15Companies> company);

}
