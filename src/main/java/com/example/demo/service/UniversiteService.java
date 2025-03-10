package com.example.demo.service;


import com.example.demo.Entities.Foyer;
import com.example.demo.Entities.Universite;
import com.example.demo.repository.IFoyerRepository;
import com.example.demo.repository.IUniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {

    IUniversiteRepository univrepo;
    IFoyerRepository foyerrepo;

    @Override
    public Universite addUniv(Universite eni){return univrepo.save(eni);}

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Foyer foyer = foyerrepo.findById(idFoyer).get();
        Universite universite = univrepo.findByNomUniversite(nomUniversite);

        if (foyer == null || universite == null) {
            throw new RuntimeException("Foyer ou Université introuvable !");
        }
        universite.setFoyer(foyer);
        foyer.setUniversite(universite);

        return univrepo.save(universite);
    }
}
