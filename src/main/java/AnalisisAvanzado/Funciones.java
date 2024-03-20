package AnalisisAvanzado;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import ModuladoEntidades.Ambiente;

public class Funciones {
    private Map<String, BiConsumer<Animales, Ambiente>> interaccionesAmbiente;

    public Funciones() {
        this.interaccionesAmbiente = new HashMap<>();
    }

    public void registrarInteraccionAmbiente(String clave, BiConsumer<Animales, Ambiente> accion) {
        interaccionesAmbiente.put(clave, accion);
    }

    public void ejecutarInteraccionAmbiente(String clave, Animales animal, Ambiente ambiente) {
        if (interaccionesAmbiente.containsKey(clave)) {
            interaccionesAmbiente.get(clave).accept(animal, ambiente);
        } else {
            System.out.println("Interacción no registrada: " + clave);
        }
    }
}