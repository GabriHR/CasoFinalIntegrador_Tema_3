package AnalisisAvanzado;

import AnalisisAvanzado.Animales;
import java.util.List;

public class VisualizacionDatos {
    public static String visualizarDatos(List<Animales> animales) {
        StringBuilder datos = new StringBuilder();
        for (Animales animal : animales) {
            datos.append(animal.toString()).append("\n");
        }
        return datos.toString();
    }
}