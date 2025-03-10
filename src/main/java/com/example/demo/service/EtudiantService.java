package com.example.demo.service;


import com.example.demo.Entities.Etudiant;
import com.example.demo.repository.IEtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService {

    IEtudiantRepository etudrepo;

    @Override
    public Etudiant addEtud(Etudiant et){return etudrepo.save(et);}

    @Override
    public Etudiant removeEtudiant(Long id) {
        Etudiant et = etudrepo.findById(id).orElse(null);

        if (et != null) {
            etudrepo.delete(et);
        } else {
            // Handle the case where the Etudiant was not found.
            // You could log a message, throw an exception, or return null.
            System.out.println("Etudiant with ID " + id + " not found.");
            return null; // Or throw an exception
        }

        return null;
    }
}
