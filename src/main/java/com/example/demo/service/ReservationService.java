package com.example.demo.service;


import com.example.demo.Entities.Reservation;
import com.example.demo.repository.IReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {

    IReservationRepository resvrepo;

    @Override
    public Reservation addResv(Reservation resv){return resvrepo.save(resv);}

    @Override
    public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date anneeUniversitaire, String nomUniversite) {
        return resvrepo.findReservationsByAnneeUniversitaire(anneeUniversitaire);
    }
}
