package com.example.demo.controller;


import com.example.demo.Entities.Etudiant;
import com.example.demo.Entities.Foyer;
import com.example.demo.service.IEtudiantService;
import com.example.demo.service.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foyer")
@AllArgsConstructor
public class FoyerController {
    @Autowired
    IFoyerService foyerService;

    @PostMapping("/add-foyer")
    public Foyer addfoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }
}
