package br.com.zup.pet.model;
/**
 * Classe modelo tipo Pet com atributos com responsabilidades de validações
 * @author Weslley.candido
 * @version 0.01
 */

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Pet {
    @NotBlank(message = "Campo do nome não pode estar vazio!")
    private String nome;

    @NotBlank(message = "Campo da raça não pode ser vazio!")
    @NotNull(message = "O campo raça não foi informada")
    private String raca;

    @NotEmpty(message = "Campo da especie não pode ser vazio!")
    @NotNull(message = "O campo especie não foi informada")
    private String especie;

    private LocalDate  DataDeEntrada;

    @NotEmpty(message = "Campo do nome não pode estar vazio!")
    private String nomeDoDono;

    @Email(message = "E-mail informado não é válido!")
    private String EmailDoDono;
    private String tefoneDoDono;

    public Pet() {

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
