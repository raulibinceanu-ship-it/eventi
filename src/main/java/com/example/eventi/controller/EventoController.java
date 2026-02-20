package com.example.eventi.controller;

import com.example.eventi.model.Evento;
import com.example.eventi.service.EventoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EventoController {

    private final EventoService eventoService;

    public EventoController(EventoService eventoService){
        this.eventoService = eventoService;
    }

    @GetMapping("/eventi")
    public String listaEventi(Model model){
        model.addAttribute("eventi", eventoService.trovaTutti());
        return "eventi";
    }

    @PostMapping("/prenota/{id}")
    public String prenota(@PathVariable Long id){

        Evento e = eventoService.trovaPerId(id);

        if(e != null && e.getPostiDisponibili() > 0){
            e.setPostiDisponibili(e.getPostiDisponibili() - 1);
            eventoService.salva(e);
        }

        return "redirect:/eventi";
    }
}