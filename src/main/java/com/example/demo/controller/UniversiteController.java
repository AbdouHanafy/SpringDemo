package com.example.demo.controller;


import com.example.demo.Entities.Foyer;
import com.example.demo.Entities.Universite;
import com.example.demo.service.IFoyerService;
import com.example.demo.service.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/universite")
@AllArgsConstructor
public class UniversiteController {
    @Autowired
    IUniversiteService universiteService;

    @PostMapping("/add-universite")
    public Universite adduniversite(@RequestBody Universite universite) {
        return universiteService.addUniv(universite);
    }

    @PutMapping("/affecter-foyer/{idFoyer}/{nomUniversite}")
    public Universite affecterFoyerAUniversite(@PathVariable long idFoyer, @PathVariable String nomUniversite) {
        return universiteService.affecterFoyerAUniversite(idFoyer, nomUniversite);
    }
}
