package com.example.stocksbackendspring.web.rest;

import com.example.stocksbackendspring.model.MBI10AveragePrices;
import com.example.stocksbackendspring.model.MBI10Companies;
import com.example.stocksbackendspring.model.MBI10Prices;
import com.example.stocksbackendspring.service.MBI10AveragePricesService;
import com.example.stocksbackendspring.service.MBI10CompaniesService;
import com.example.stocksbackendspring.service.MBI10PricesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = {"http://localhost:4000", "http://localhost:4001"})
@RequestMapping("/api/mbi10-companies")
public class MBI10RestController {

    private final MBI10CompaniesService mbi10CompaniesService;

    private final MBI10PricesService mbi10PricesService;

    private final MBI10AveragePricesService mbi10AveragePricesService;

    public MBI10RestController(MBI10CompaniesService mbi10CompaniesService, MBI10PricesService mbi10PricesService, MBI10AveragePricesService mbi10AveragePricesService) {
        this.mbi10CompaniesService = mbi10CompaniesService;
        this.mbi10PricesService = mbi10PricesService;
        this.mbi10AveragePricesService = mbi10AveragePricesService;
    }

    @GetMapping
    private List<MBI10Companies> findAll() {
        return this.mbi10CompaniesService.listMBI10Companies();
    }

    @GetMapping("/prices")
    public List<MBI10AveragePrices> findPrices() {
        return this.mbi10AveragePricesService.listMBI10AveragePrices();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MBI10Companies> findById(@PathVariable Integer id) {
        return this.mbi10CompaniesService.findById(id)
                .map(company -> ResponseEntity.ok().body(company))
                .orElseGet(() -> ResponseEntity.notFound().build());

    }

    @GetMapping("/{id}/prices")
    public ResponseEntity<List<MBI10Prices>> findByIdPrices(@PathVariable Integer id) {
        Optional<MBI10Companies> company = mbi10CompaniesService.findById(id);
        return this.mbi10PricesService.findCompanyPricesByCompany(company)
                .map(prices -> ResponseEntity.ok().body(prices))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
