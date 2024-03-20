package SimuladorDinamicasPoblacionales;

import ModuladoEntidades.Animal;
import java.util.List;
import java.util.Random;

public class Terremoto extends EventosAleatorios {

    @Override
    public void ejecutar(List<Animal> animales) {
        Random random = new Random();
        Animal animal = animales.get(random.nextInt(animales.size()));
        animal.salud -= Math.floor(Math.random() * 20);
    }
}