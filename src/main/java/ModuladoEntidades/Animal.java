package ModuladoEntidades;

public abstract class Animal implements Crecer, Reproducirse {
    public int salud;
    protected int edad;
    protected boolean esReproductiva;
    protected int energia;
    protected int hidratacion;

    public Animal(int salud, int edad, boolean esReproductiva) {
        this.salud = salud;
        this.edad = edad;
        this.esReproductiva = esReproductiva;
        this.energia = 0;
        this.hidratacion = 0;
    }

    public int getSalud() {
        return salud;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isReproductiva() {
        return esReproductiva;
    }

    public int getEnergia() {
        return energia;
    }

    public int getHidratacion() {
        return hidratacion;
    }
    public abstract RecursosObtenidos comerPlanta(Planta planta);

    public void interactuarCon(Animal otroAnimal) {
        // Disminuir la salud del animal en 10 puntos cada vez que interactúa con otro animal
        this.salud -= 10;
        otroAnimal.salud -= 10;
    }

    public void comerAnimal(Animal otroAnimal) {
        // Aumentar la salud del animal en la mitad de la salud del animal que se come
        int recursosObtenidos = otroAnimal.salud / 2;
        this.salud += recursosObtenidos;
    }

    public void morir() {
        this.salud = 0;
    }

    @Override
    public String toString() {
        return "Animal con salud: " + salud;
    }
}