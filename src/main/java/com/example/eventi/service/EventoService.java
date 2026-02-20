package com.example.eventi.service;

import com.example.eventi.model.Evento;
import com.example.eventi.repository.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    private final EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository){
        this.eventoRepository = eventoRepository;
    }

    public List<Evento> trovaTutti(){
        return eventoRepository.findAll();
    }

    public Evento salva(Evento e){
        return eventoRepository.save(e);
    }

    public Evento trovaPerId(Long id){
        return eventoRepository.findById(id).orElse(null);
    }

    public void elimina(Long id){
        eventoRepository.deleteById(id);
    }
}