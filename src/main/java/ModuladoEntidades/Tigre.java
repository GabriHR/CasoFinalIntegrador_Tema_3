package ModuladoEntidades;

public class Tigre extends Animal implements Carnivoro {
    public int energia;
    public int hidratacion;

    public Tigre(int salud, int edad, boolean esReproductiva) {
        super(salud, edad, esReproductiva);
        this.energia = 0;
        this.hidratacion = 0;
    }

    @Override
    public void alimentarse(Animal animal) {
        this.salud += 10;
    }

    @Override
    public Tigre reproducirse() {
        if (this.salud > 50 && this.esReproductiva) {
            return new Tigre(this.salud, 0, false);
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

    public void competirPorRecursos(Ambiente ambiente) {
        if (salud > 50) {
            ambiente.setRecursosDisponibles(ambiente.getRecursosDisponibles() - 10);
        } else {
            ambiente.setRecursosDisponibles(ambiente.getRecursosDisponibles() - 5);
        }
    }

    public void interactuarCon(Animal otroAnimal) {
        this.salud -= 10;
        otroAnimal.salud -= 10;
    }

    public void comerAnimal(Animal otroAnimal) {
        int recursosObtenidos = otroAnimal.salud / 2;
        this.salud += recursosObtenidos;
    }

    @Override
    public void crecer() {
        this.edad++;
        this.salud += 10;
    }
}