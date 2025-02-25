package com.example.demo.controller;


import com.example.demo.Entities.Foyer;
import com.example.demo.Entities.Reservation;
import com.example.demo.service.IFoyerService;
import com.example.demo.service.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
