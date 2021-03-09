package br.com.zup.pet.model;

import java.time.LocalDate;

public class Pet {
    private String nome;
    private String raca;
    private String especie;
    private LocalDate  DataDeEntrada;
    private String nomeDoDono;
    private String EmailDoDono;
    private String tefoneDoDono;

    public Pet() {
    }

    public Pet(String nome, String raca, String especie, LocalDate dataDeEntrada,
               String nomeDoDono, String emailDoDono, String tefoneDoDono) {
        this.nome = nome;
        this.raca = raca;
        this.especie = especie;
        DataDeEntrada = dataDeEntrada;
        this.nomeDoDono = nomeDoDono;
        EmailDoDono = emailDoDono;
        this.tefoneDoDono = tefoneDoDono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getDataDeEntrada() {
        return DataDeEntrada;
    }

    public void setDataDeEntrada(LocalDate dataDeEntrada) {
        DataDeEntrada = dataDeEntrada;
    }

    public String getNomeDoDono() {
        return nomeDoDono;
    }

    public void setNomeDoDono(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    public String getEmailDoDono() {
        return EmailDoDono;
    }

    public void setEmailDoDono(String emailDoDono) {
        EmailDoDono = emailDoDono;
    }

    public String getTefoneDoDono() {
        return tefoneDoDono;
    }

    public void setTefoneDoDono(String tefoneDoDono) {
        this.tefoneDoDono = tefoneDoDono;
    }


}
