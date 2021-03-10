package br.com.zup.pet.controllers;


import br.com.zup.pet.model.Pet;
import br.com.zup.pet.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("animais/")
public class PetControlller {
    /*
        Atributos referente ao PetService
     */
    @Autowired
    private PetService petService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pet cadastrarAnimal(@RequestBody @Valid Pet pet){
        return  petService.cadastrarAnimal(pet);
    }

    @GetMapping("{nome}/")
    @ResponseStatus(HttpStatus.OK)
    public Pet pesquisarPesquisarNomeDoDonoAnimail(@PathVariable String nome){
        try {
            return  petService.buscarAnimalOuDono(nome);
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    @GetMapping("/email/{email}")
    public Pet pesquisarEmailDoDono(@PathVariable String email) {
        try {
            return petService.buscarEmailDoDono(email);
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    @DeleteMapping("/nome/{nome}/")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarAnimalPorNome(@PathVariable String nome){
        try{
            petService.deletarAnimal(nome);
            }catch (RuntimeException erro){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }
}
