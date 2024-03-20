package SimuladorDinamicasPoblacionales;

public abstract class Especie {
    protected String posicion;
    protected int salud;
    protected int edad;
    protected boolean esReproductiva;

    public Especie(String posicion, int salud, int edad, boolean esReproductiva) {
        this.posicion = posicion;
        this.salud = salud;
        this.edad = edad;
        this.esReproductiva = esReproductiva;
    }

    public abstract void crecer();

    public abstract Especie reproducirse();

    public void morir() {
        this.salud = 0;
        this.esReproductiva = false;
    }
}