package com.example.stocksbackendspring.web.rest;

import com.example.stocksbackendspring.model.BELEX15AveragePrices;
import com.example.stocksbackendspring.model.BELEX15Companies;
import com.example.stocksbackendspring.model.BELEX15Prices;
import com.example.stocksbackendspring.service.BELEX15AveragePricesService;
import com.example.stocksbackendspring.service.BELEX15CompaniesService;
import com.example.stocksbackendspring.service.BELEX15PricesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = {"http://localhost:4000", "http://localhost:4001"})
@RequestMapping("/api/belex15-companies")
public class BELEX15RestController {

    private final BELEX15CompaniesService belex15CompaniesService;

    private final BELEX15PricesService belex15PricesService;

    private final BELEX15AveragePricesService belex15AveragePricesService;

    public BELEX15RestController(BELEX15CompaniesService belex15CompaniesService, BELEX15PricesService belex15PricesService, BELEX15AveragePricesService belex15AveragePricesService) {
        this.belex15CompaniesService = belex15CompaniesService;
        this.belex15PricesService = belex15PricesService;
        this.belex15AveragePricesService = belex15AveragePricesService;
    }

    @GetMapping
    private List<BELEX15Companies> findAll() {
        return this.belex15CompaniesService.listBELEX15Companies();
    }

    @GetMapping("/prices")
    public List<BELEX15AveragePrices> findPrices() {
        return this.belex15AveragePricesService.listBELEX15AveragePrices();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BELEX15Companies> findById(@PathVariable Integer id) {
        return this.belex15CompaniesService.findById(id)
                .map(company -> ResponseEntity.ok().body(company))
                .orElseGet(() -> ResponseEntity.notFound().build());

    }

    @GetMapping("/{id}/prices")
    public ResponseEntity<List<BELEX15Prices>> findByIdPrices(@PathVariable Integer id) {
        Optional<BELEX15Companies> company = belex15CompaniesService.findById(id);
        return this.belex15PricesService.findCompanyPricesByCompany(company)
                .map(prices -> ResponseEntity.ok().body(prices))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
