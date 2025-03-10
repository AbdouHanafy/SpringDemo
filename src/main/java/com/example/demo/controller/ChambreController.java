package com.example.demo.controller;

import com.example.demo.Entities.Chambre;
import com.example.demo.Entities.TypeChambre;
import com.example.demo.service.ChambreService;
import com.example.demo.service.IBlocService;
import com.example.demo.service.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @GetMapping("/chambres-non-reservees/{nomUniversite}/{typeChambre}")
    public List<Chambre> getChambresNonReservees(@PathVariable String nomUniversite, @PathVariable TypeChambre typeChambre) {
        return ChambreService.getChambresNonReserveParNomUniversiteEtTypeChambre(nomUniversite, typeChambre);
    }
    @GetMapping("/chambres-par-bloc/{idBloc}/{typeChambre}")
    public List<Chambre> getChambresParBloc(@PathVariable long idBloc, @PathVariable TypeChambre typeChambre) {
        return ChambreService.getChambresParBlocEtType(idBloc, typeChambre);
    }
}
