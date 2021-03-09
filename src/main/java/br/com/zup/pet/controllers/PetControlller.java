package br.com.zup.pet.controllers;


import br.com.zup.pet.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("animais/")
public class PetControlller {


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pet cadastrarAnimal(@RequestBody )
}
