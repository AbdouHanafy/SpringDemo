package com.example.demo.service;

import com.example.demo.Entities.Bloc;
import com.example.demo.repository.IBlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BlocService implements IBlocService{


    IBlocRepository blocrepo;

    @Override
    public Bloc addBloc(Bloc bl){return blocrepo.save(bl);}
}
