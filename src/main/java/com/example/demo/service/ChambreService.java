package com.example.demo.service;


import com.example.demo.Entities.Chambre;
import com.example.demo.repository.IChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {
    IChambreRepository chambrepo;

    @Override
    public Chambre addchambre(Chambre ch){return chambrepo.save(ch);}
}
