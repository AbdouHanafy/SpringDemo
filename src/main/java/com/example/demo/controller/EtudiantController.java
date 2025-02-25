package com.example.demo.controller;


import com.example.demo.Entities.Chambre;
import com.example.demo.Entities.Etudiant;
import com.example.demo.service.IChambreService;
import com.example.demo.service.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Etudiant")
@AllArgsConstructor
public class EtudiantController {
    @Autowired
    IEtudiantService EtudiantService;

    @PostMapping("/add-etudiant")
    public Etudiant addetudiant(@RequestBody Etudiant etudiant) {
        return EtudiantService.addEtud(etudiant);
    }
}
