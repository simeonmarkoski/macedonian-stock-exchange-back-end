package com.example.stocksbackendspring.web.rest;

import com.example.stocksbackendspring.model.SBITOPAveragePrices;
import com.example.stocksbackendspring.model.SBITOPPrices;
import com.example.stocksbackendspring.service.SBITOPAveragePricesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4000", "http://localhost:4001"})
@RequestMapping("/api/sbitop-companies/prices")
public class SBITOPRestController {

    private final SBITOPAveragePricesService sbitopAveragePricesService;

    public SBITOPRestController(SBITOPAveragePricesService sbitopAveragePricesService) {
        this.sbitopAveragePricesService = sbitopAveragePricesService;
    }

    @GetMapping
    public List<SBITOPAveragePrices> findPrices() {
        return sbitopAveragePricesService.listSBITOPAveragePrices();
    }
}
