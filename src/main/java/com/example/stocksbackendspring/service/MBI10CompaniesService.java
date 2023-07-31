package com.example.stocksbackendspring.service;

import com.example.stocksbackendspring.model.MBI10Companies;

import java.util.List;
import java.util.Optional;

public interface MBI10CompaniesService {

    List<MBI10Companies> listMBI10Companies();

    Optional<MBI10Companies> findById(Integer id);

}
