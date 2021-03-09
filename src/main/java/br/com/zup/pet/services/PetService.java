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

    public Pet buscarEmailDoDono(String email){
        for(Pet petEmail : animais){
            if(petEmail.getEmailDoDono().equalsIgnoreCase(email)){
                return  petEmail;
            }
        }
        throw new RuntimeException("Não foram localizado!");
    }

    public Pet buscarNomeDono(String nome) {
        for (Pet petNomeDono : animais) {
            if (petNomeDono.getNomeDoDono().equalsIgnoreCase(nome)) {
                return petNomeDono;
            }
        }
        throw new RuntimeException("Não foram localizado!");
    }

    public Pet buscarNomeDoAnimal(String nomeAnimal) {
        for (Pet petNomeAnimal : animais) {
            if (petNomeAnimal.getNomeDoDono().equalsIgnoreCase(nomeAnimal)) {
                return petNomeAnimal;
            }
        }
        throw new RuntimeException("Não foram localizado!");
    }
}
