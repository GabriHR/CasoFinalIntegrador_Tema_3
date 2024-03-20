package Main;

import GestionUsuarios.InterfazUsuario;
import ModuladoEntidades.*;
import SimuladorDinamicasPoblacionales.*;
import AnalisisAvanzado.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static boolean sesionIniciada = false;

    public static void main(String[] args) {
        InterfazUsuario interfazUsuario = new InterfazUsuario();
        System.out.println("Para iniciar la simulación, por favor inicie sesión.");
        System.out.println("El nombre de usuario es 'usuario' y la contraseña es 'contraseña'.");

        setSesionIniciada(true);

        ResolucionProblemas resolucionProblemas = new ResolucionProblemas();
        resolucionProblemas.imprimirInformacion();

        IntegracionNuevasFunciones integracionNuevasFunciones = new IntegracionNuevasFunciones();
        integracionNuevasFunciones.imprimirInformacion();
    }

    public static void imprimirDatos() {
        if (sesionIniciada) {
            Ambiente ambiente = new Ambiente("Templado", "Bosque", 100, "20ºC", 50, 70);
            Leon leon = new Leon(50, 5, true);
            Tigre tigre = new Tigre(60, 6, true);
            Abeja abeja = new Abeja(40, 3, true);
            Cebra cebra = new Cebra(30, 2, true);
            Planta planta = new Planta(30, 2, true);

            System.out.println("\nDatos iniciales del león:");
            System.out.println("    - Salud inicial del león: " + leon.getSalud());
            leon.interactuarCon(cebra);
            System.out.println("    - Salud del león después de interactuar con la cebra (-10 puntos): " + leon.getSalud());
            RecursosObtenidos recursosLeon = leon.comerPlanta(planta);
            System.out.println("    - Salud del león después de comerse la planta (+15 puntos): " + leon.getSalud());
            System.out.println("    - Recursos obtenidos por el león después de comerse la planta: " + recursosLeon);
            System.out.println("    - Edad del león: " + leon.getEdad() + " años");
            System.out.println("    - Estado reproductivo del león: " + (leon.isReproductiva() ? "Fertil" : "Esteril"));

            System.out.println("\nDatos iniciales del tigre:");
            System.out.println("    - Salud inicial del tigre: " + tigre.getSalud());
            tigre.interactuarCon(cebra);
            System.out.println("    - Salud del tigre después de interactuar con la cebra (-10 puntos): " + tigre.getSalud());
            RecursosObtenidos recursosTigre = tigre.comerPlanta(planta);
            System.out.println("    - Salud del tigre después de comerse la planta (+15 puntos): " + tigre.getSalud());
            System.out.println("    - Recursos obtenidos por el tigre después de comerse la planta: " + recursosTigre);
            System.out.println("    - Edad del tigre: " + tigre.getEdad() + " años");
            System.out.println("    - Estado reproductivo del tigre: " + (tigre.isReproductiva() ? "Fertil" : "Esteril"));

            System.out.println("\nDatos sobre la planta:");
            System.out.println("    - Salud de la planta: " + planta.getSalud());
            System.out.println("    - Edad de la planta: " + planta.getEdad() + " años");
            System.out.println("    - Estado reproductivo de la planta: " + (planta.isReproductiva() ? "Fertil" : "Esteril"));

            System.out.println("\nDatos sobre el ambiente: ");
            System.out.println("    - Recursos disponibles en el ambiente: " + ambiente.getRecursosDisponibles());
            System.out.println("    - Clima del ambiente: " + ambiente.getClima());
            System.out.println("    - Temperatura del ambiente: " + ambiente.getTemperatura());
            System.out.println("    - Humedad del ambiente: " + ambiente.getHumedad());
            System.out.println("    - Nivel de luz del ambiente: " + ambiente.getNivelDeLuz());

            System.out.println("\nDatos sobre la abeja:");
            System.out.println("    - Salud inicial de la abeja: " + abeja.getSalud());
            abeja.alimentarse(cebra);
            System.out.println("    - Salud de la abeja después de alimentarse de la cebra (+10 puntos): " + abeja.getSalud());
            RecursosObtenidos recursosAbeja = abeja.comerPlanta(planta);
            System.out.println("    - Salud de la abeja después de comerse la planta (+15 puntos): " + abeja.getSalud());
            System.out.println("    - Recursos obtenidos por la abeja después de comerse la planta: " + recursosAbeja);
            System.out.println("    - Edad de la abeja: " + abeja.getEdad() + " años");
            System.out.println("    - Estado reproductivo de la abeja: " + (abeja.isReproductiva() ? "Fertil" : "Esteril"));
            abeja.polinizar(planta);
            System.out.println("    - La abeja ha polinizado la planta.");

            System.out.println("\nDatos sobre animales después de fenómenos aleatorios: ");

            List<Animal> animales = new ArrayList<>();
            animales.add(leon);
            animales.add(tigre);
            animales.add(abeja);
            animales.add(cebra);

            Enfermedad enfermedad = new Enfermedad();
            Terremoto terremoto = new Terremoto();

            terremoto.ejecutar(animales);
            imprimirEstadoAnimales(animales, "el terremoto");

            enfermedad.ejecutar(animales);
            imprimirEstadoAnimales(animales, "la enfermedad");
        } else {
            System.out.println("No se ha iniciado sesión.");
        }
    }

    public static void setSesionIniciada(boolean estado) {
        sesionIniciada = estado;
        System.out.println("La sesión se ha " + (estado ? "iniciado" : "cerrado"));

    }

    public static void imprimirEstadoAnimales(List<Animal> animales, String evento) {
        for (Animal animal : animales) {
            String nombreClase = animal.getClass().getSimpleName();
            if (animal.getSalud() <= 0) {
                System.out.println("    - " + nombreClase + " murió después de " + evento);
            } else {
                System.out.println("    - " + nombreClase + " después de " + evento + ": salud " + animal.getSalud());
            }
        }
    }
}
