package SimuladorDinamicasPoblacionales;

import ModuladoEntidades.Animal;
import java.util.List;

public class Crecimiento {
    public void crecer(List<Animal> animales) {
        for (Animal animal : animales) {
            animal.crecer();
        }
    }
}