package com.senai.semaforo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.semaforo.models.Semaforo;
import com.senai.semaforo.repositories.SemaforoRepository;

@Service
public class SemaforoService {

    private final SemaforoRepository repository;

    public SemaforoService(SemaforoRepository repository) {
        this.repository = repository;
    }

    public Semaforo carrosPassam() {
        Semaforo s = new Semaforo(
                "VERDE",
                "VERMELHO",
                "Carros podem passar | Pedestre aguarde"
        );
        return repository.save(s);
    }

    public Semaforo atencao() {
        Semaforo s = new Semaforo(
                "AMARELO",
                "VERMELHO",
                "Atenção: semáforo mudando"
        );
        return repository.save(s);
    }

    public Semaforo pedestrePassa() {
        Semaforo s = new Semaforo(
                "VERMELHO",
                "VERDE",
                "Pedestre pode atravessar"
        );
        return repository.save(s);
    }

    public List<Semaforo> listar() {
        return repository.findAll();
    }
}
