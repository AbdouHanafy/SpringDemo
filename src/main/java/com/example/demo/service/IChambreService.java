package com.example.demo.service;

import com.example.demo.Entities.Chambre;
import com.example.demo.Entities.TypeChambre;

import java.util.List;

public interface IChambreService {
    Chambre addchambre(Chambre bl);

    List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type);

    List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC);

    List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type);
}
