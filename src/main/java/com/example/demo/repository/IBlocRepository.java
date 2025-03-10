package com.example.demo.repository;

import com.example.demo.Entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlocRepository extends JpaRepository<Bloc,Long> {

}
