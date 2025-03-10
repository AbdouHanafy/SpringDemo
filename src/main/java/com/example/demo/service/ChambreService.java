package com.example.demo.service;


import com.example.demo.Entities.Chambre;
import com.example.demo.Entities.TypeChambre;
import com.example.demo.repository.IChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {
    IChambreRepository chambrepo;

    @Override
    public Chambre addchambre(Chambre ch){return chambrepo.save(ch);}


    @Override
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type) {
        return chambrepo.findChambresNonReservees(nomUniversite, type);
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC) {
        return chambrepo.findByBlocIdBlocAndTypeC(idBloc, typeC);
    }
}
