package com.example.demo.service;


import com.example.demo.Entities.Universite;
import com.example.demo.repository.IUniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {

    IUniversiteRepository univrepo;

    @Override
    public Universite addUniv(Universite eni){return univrepo.save(eni);}
}
