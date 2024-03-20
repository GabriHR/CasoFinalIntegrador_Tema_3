package ModuladoEntidades;

public abstract class Organismo {
    public int salud;
    public int edad;
    public boolean esReproductiva;

    public Organismo(int salud, int edad, boolean esReproductiva) {
        this.salud = salud;
        this.edad = edad;
        this.esReproductiva = esReproductiva;
    }

    public abstract void crecer();
    public abstract Organismo reproducirse();

    public int getSalud() {
        return salud;
    }

    public int getEdad() {
        return edad;
    }

    public boolean esReproductiva() {
        return esReproductiva;
    }
}