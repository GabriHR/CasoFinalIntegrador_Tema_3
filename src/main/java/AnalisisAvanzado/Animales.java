package AnalisisAvanzado;

public class Animales {
    // Atributos de la clase Animales
    private String nombre;
    private int edad;
    private boolean estadoSalud;

    // Constructor de la clase Animales
    public Animales(String nombre, int edad, boolean estadoSalud) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoSalud = estadoSalud;
    }

    // Métodos de la clase Animales
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isEstadoSalud() {
        return estadoSalud;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estadoSalud=" + estadoSalud +
                '}';
    }
}