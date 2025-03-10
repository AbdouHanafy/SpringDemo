package com.example.demo.controller;


import com.example.demo.Entities.Foyer;
import com.example.demo.Entities.Reservation;
import com.example.demo.service.IFoyerService;
import com.example.demo.service.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationController {
    @Autowired
    IReservationService reservationService;

    @PostMapping("/add-reservation")
    public Reservation addreservation(@RequestBody Reservation reservation) {
        return reservationService.addResv(reservation);
    }

    @GetMapping("/reservations/{anneeUniversitaire}/{nomUniversite}")
    public List<Reservation> getReservationsParAnneeUniversitaire(@PathVariable Date anneeUniversitaire, @PathVariable String nomUniversite) {
        return reservationService.getReservationParAnneeUniversitaireEtNomUniversite(anneeUniversitaire, nomUniversite);
    }
}
