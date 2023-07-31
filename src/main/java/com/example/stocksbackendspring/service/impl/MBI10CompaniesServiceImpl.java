package com.example.stocksbackendspring.service.impl;

import com.example.stocksbackendspring.model.MBI10Companies;
import com.example.stocksbackendspring.repository.MBI10CompaniesRepository;
import com.example.stocksbackendspring.service.MBI10CompaniesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MBI10CompaniesServiceImpl implements MBI10CompaniesService {

    private final MBI10CompaniesRepository mbi10CompaniesRepository;

    public MBI10CompaniesServiceImpl(MBI10CompaniesRepository mbi10CompaniesRepository) {
        this.mbi10CompaniesRepository = mbi10CompaniesRepository;
    }

    @Override
    public List<MBI10Companies> listMBI10Companies() {
        return mbi10CompaniesRepository.findAll();
    }

    @Override
    public Optional<MBI10Companies> findById(Integer id) {
        return mbi10CompaniesRepository.findById(id);
    }
}
