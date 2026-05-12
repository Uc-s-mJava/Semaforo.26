package com.senai.semaforo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.semaforo.models.Semaforo;

public interface SemaforoRepository extends JpaRepository<Semaforo, Long> {
}
