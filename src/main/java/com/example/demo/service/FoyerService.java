package com.example.demo.service;


import com.example.demo.Entities.Foyer;
import com.example.demo.repository.IFoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {

    IFoyerRepository forepo;

    @Override
    public Foyer addFoyer(Foyer fo){return forepo.save(fo);}
}
