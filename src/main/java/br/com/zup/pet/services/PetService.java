package br.com.zup.pet.services;

import br.com.zup.pet.model.Pet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {
    private static List<Pet> animais = new ArrayList<>();

    public Pet cadastrarAnimal(Pet estimacao) {
        animais.add(estimacao);
        return estimacao;
    }

    public Pet buscarAnimalOuDono(String nome) {
        for (Pet pet : animais) {
            if (pet.getNomeDoDono().equalsIgnoreCase(nome) || pet.getNomeDoDono().equalsIgnoreCase(nome)) {
                return pet;
            }
        }
        throw new RuntimeException("Não foram localizado!");
    }
}
