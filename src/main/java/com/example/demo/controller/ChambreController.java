package com.example.demo.controller;

import com.example.demo.Entities.Chambre;
import com.example.demo.service.ChambreService;
import com.example.demo.service.IBlocService;
import com.example.demo.service.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreController {
    @Autowired
    IChambreService ChambreService;
    @PostMapping("/add-chambre")
    public Chambre addchambre(@RequestBody Chambre chamb) {
        return ChambreService.addchambre(chamb);
    }
}
