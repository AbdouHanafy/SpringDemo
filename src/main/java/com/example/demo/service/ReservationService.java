package com.example.demo.service;


import com.example.demo.Entities.Reservation;
import com.example.demo.repository.IEtudiantRepository;
import com.example.demo.repository.IReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {

    IReservationRepository resvrepo;

    @Override
    public Reservation addResv(Reservation resv){return resvrepo.save(resv);}
}
