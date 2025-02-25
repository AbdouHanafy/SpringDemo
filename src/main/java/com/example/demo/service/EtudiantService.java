package com.example.demo.service;


import com.example.demo.Entities.Etudiant;
import com.example.demo.repository.IEtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService {

    IEtudiantRepository etudrepo;

    @Override
    public Etudiant addEtud(Etudiant et){return etudrepo.save(et);}
}
