package SimuladorDinamicasPoblacionales;

import ModuladoEntidades.Animal;
import java.util.List;

public class Reproduccion {
    public void reproducir(List<Animal> animales) {
        for (int i = 0; i < animales.size(); i++) {
            Animal animal = animales.get(i);
            Animal nuevoAnimal = animal.reproducirse();
            if (nuevoAnimal != null) {
                animales.add(nuevoAnimal);
            }
        }
    }
}