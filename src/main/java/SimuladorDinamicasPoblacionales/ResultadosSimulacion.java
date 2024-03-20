package SimuladorDinamicasPoblacionales;

import ModuladoEntidades.Leon;
import ModuladoEntidades.Tigre;

import ModuladoEntidades.Animal;
import java.util.List;

public class ResultadosSimulacion {
    public int calcularSaludEcosistema(List<Animal> animales) {
        int saludTotal = 0;
        for (Animal animal : animales) {
            saludTotal += animal.salud;
        }
        return saludTotal;
    }

    public void mostrarTendenciasPoblacionales(List<Animal> animales) {
        int leones = 0;
        int tigres = 0;
        int cebras = 0;
        for (Animal animal : animales) {
            if (animal instanceof Leon) {
                leones++;
            } else if (animal instanceof Tigre) {
                tigres++;
            } else {
                cebras++;
            }
        }
        System.out.println("Número de leones: " + leones);
        System.out.println("Número de tigres: " + tigres);
        System.out.println("Número de cebras: " + cebras);
    }
}