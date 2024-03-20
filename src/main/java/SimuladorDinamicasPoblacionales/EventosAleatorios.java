package SimuladorDinamicasPoblacionales;

import ModuladoEntidades.Animal;
import java.util.List;

public abstract class EventosAleatorios {

    public abstract void ejecutar(List<Animal> animales);
}