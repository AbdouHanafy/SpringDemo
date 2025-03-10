package com.example.demo.repository;


import com.example.demo.Entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUniversiteRepository extends JpaRepository<Universite,Long> {
    Universite findByNomUniversite(String nomUniversite);
}
