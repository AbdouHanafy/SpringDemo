package com.example.demo.service;

import com.example.demo.Entities.Universite;

public interface IUniversiteService {
    Universite addUniv(Universite eni);

    Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite);
}
