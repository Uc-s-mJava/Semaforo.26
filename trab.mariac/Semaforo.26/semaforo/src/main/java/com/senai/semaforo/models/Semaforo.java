package com.senai.semaforo.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "semaforo")
public class Semaforo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String statusCarro;
    private String statusPedestre;
    private String mensagem;
    private LocalDateTime dataHora;

    public Semaforo() {}

    public Semaforo(String statusCarro, String statusPedestre, String mensagem) {
        this.statusCarro = statusCarro;
        this.statusPedestre = statusPedestre;
        this.mensagem = mensagem;
        this.dataHora = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public String getStatusCarro() { return statusCarro; }
    public void setStatusCarro(String statusCarro) { this.statusCarro = statusCarro; }

    public String getStatusPedestre() { return statusPedestre; }
    public void setStatusPedestre(String statusPedestre) { this.statusPedestre = statusPedestre; }

    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
}
