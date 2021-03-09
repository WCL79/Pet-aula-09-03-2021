package br.com.zup.pet.controllers;


import br.com.zup.pet.model.Pet;
import br.com.zup.pet.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    public Pet pesquisarPesquisarAnimanial(@PathVariable String nomeAnimalDono){
        return  petService.buscarAnimalOuDono(nomeAnimalDono);
    }

    @GetMapping("{email}/")
    public Pet pesquisarEmailDoDono(@PathVariable String emailDono){
        return petService.buscarEmailDoDono(emailDono);
    }

}
