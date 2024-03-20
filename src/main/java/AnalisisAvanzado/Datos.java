package AnalisisAvanzado;

import java.util.ArrayList;
import java.util.List;

public class Datos {
    private List<Animales> animales;

    public Datos() {
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animales animal) {
        this.animales.add(animal);
    }

    public List<Animales> obtenerAnimales() {
        return this.animales;
    }

    public static String visualizarDatos(List<Animales> animales) {
        StringBuilder datos = new StringBuilder();
        for (Animales animal : animales) {
            datos.append(animal.toString()).append("\n");
        }
        return datos.toString();
    }
}