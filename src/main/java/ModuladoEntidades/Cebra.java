package ModuladoEntidades;
public class Cebra extends Animal {
    public Cebra(int salud, int edad, boolean esReproductiva) {
        super(salud, edad, esReproductiva);
    }

    @Override
    public RecursosObtenidos comerPlanta(Planta planta) {
        // Implementación del método
        return null;
    }

    @Override
    public void crecer() {
                this.edad++;
        this.salud += 10;
    }

    @Override
    public Animal reproducirse() {
        return null;
    }
}