package br.com.zup.pet.services;
/**
 * Classe service tipo PetService com métodos responsaveis pela regra negocio
 * referente: inserção de novo Objeto Pet, Visualização de Objetos por meio: email, nome do pet ou nome do dono.
 * E excluir o Objeto Pet.
 * @author Weslley.candido
 * @version 0.01
 */
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

    public Pet buscarAnimalOuDono(String nome) {
        for (Pet petNome : animais) {
            if (petNome.getNomeDoDono().equalsIgnoreCase(nome) || petNome.getNome().equalsIgnoreCase(nome)) {
                return petNome;
            }
        }
        throw new RuntimeException("Não foram localizado!");
    }

    public void deletarAnimal(String nome) throws RuntimeException{
            Pet estimacao = new Pet();
            estimacao.setNome(nome);
            deletarAnimal(estimacao);
    }

    public boolean deletarAnimal(Pet petEstimacao){
        for(Pet petNome : animais){
            if(petNome.getNome().equalsIgnoreCase(petEstimacao.getNome())){
                animais.remove(petNome);
                return true;
            }
        }
        throw new RuntimeException("Animail não localizado!");
    }
}
