package br.com.zup.pet.controllers;
/**
 * Classe controller responsavel pela interação com a Classe Pet do model ao services PetService
 * @author Weslley.candido
 * @version 0.01
 */

import br.com.zup.pet.model.Pet;
import br.com.zup.pet.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

@RestController
@RequestMapping("animais/")
public class PetControlller {
    /**
     * Esse método fica responsavel com a injeção de dependencia, ou seja,
     * é um tipo de inversão (Inversion of Control – IoC)
     */
    @Autowired
    private PetService petService;

    /**
     * Médoto que cria um Objeto do tipo Pet
     * @param pet
     * @return: Serviço do médoto cadastrarAnimal que vem da Classe PetService.
     */

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pet cadastrarAnimal(@RequestBody @Valid Pet pet){
        return  petService.cadastrarAnimal(pet);
    }

    /**
     * Médoto que faz Vizualização do Objeto criado
     * @param nome
     * @return: Serviço do médoto buscarAnimalOuDono, pois nesse há regra de
     * negocio entre nome do animal ou nome dono
     */

    @GetMapping("{nome}/")
    @ResponseStatus(HttpStatus.OK)
    public Pet pesquisarPesquisarNomeDoDonoAnimail(@PathVariable String nome){
            return  petService.buscarAnimalOuDono(nome);
    }

    /**
     * Médoto que faz Vizualização do Objeto criado
     * @param email
     * @return: Serviço do médoto buscarEmailDoDono, ou seja, além da possibilidades, há essa que o sistema
     * permite busca pelo e-mail do dono.
     */

    @GetMapping("/email/{email}")
    public Pet pesquisarEmailDoDono(@PathVariable String email) {
            return petService.buscarEmailDoDono(email);
    }

    /**
     * Médoto que faz Exclusão do Objeto criado por meio do médoto deletarAnimal cujo pertencente da classe
     * PetService
     * @param nomeDoAnimal
     */

    @DeleteMapping("{nomeDoAnimal}/")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarAnimalPorNome(@PathVariable String nomeDoAnimal){
            petService.deletarAnimal(nomeDoAnimal);
    }
}
