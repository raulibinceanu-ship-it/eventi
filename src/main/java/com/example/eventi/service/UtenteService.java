package com.example.eventi.service;

import com.example.eventi.model.Utente;
import com.example.eventi.repository.UtenteRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {

    private final UtenteRepository utenteRepository;
    private final BCryptPasswordEncoder encoder;

    public UtenteService(UtenteRepository utenteRepository,
                         BCryptPasswordEncoder encoder){
        this.utenteRepository = utenteRepository;
        this.encoder = encoder;
    }

    public Utente registra(Utente u){
        u.setPassword(encoder.encode(u.getPassword()));
        return utenteRepository.save(u);
    }
}