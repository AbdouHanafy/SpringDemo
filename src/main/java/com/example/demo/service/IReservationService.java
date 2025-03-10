package com.example.demo.service;

import com.example.demo.Entities.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationService {
    Reservation addResv(Reservation resv);

    List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date anneeUniversitaire, String nomUniversite);
}
