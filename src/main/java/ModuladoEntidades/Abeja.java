package ModuladoEntidades;

public class Abeja extends Animal implements Carnivoro, Polinizador, Crecer, Reproducirse {
    public int energia;
    public int hidratacion;

    public Abeja(int salud, int edad, boolean esReproductiva) {
        super(salud, edad, esReproductiva);
        this.energia = 0;
        this.hidratacion = 0;
    }

    @Override
    public void polinizar(Planta planta) {
        this.salud += 5;
    }

    @Override
    public void alimentarse(Animal animal) {
        this.salud += 10;
    }

    @Override
    public Abeja reproducirse() {
        if (this.salud > 50 && this.esReproductiva) {
            return new Abeja(this.salud, 0, false);
        }
        return null;
    }

    @Override
    public RecursosObtenidos comerPlanta(Planta planta) {
        int recursosObtenidos = planta.serComido();
        energia += recursosObtenidos;
        hidratacion += recursosObtenidos;
        return new RecursosObtenidos(energia, hidratacion);
    }

    @Override
    public void crecer() {
        this.edad++;
        this.salud += 10;
    }

    public int getEnergia() {
        return energia;
    }

    public int getHidratacion() {
        return hidratacion;
    }
}