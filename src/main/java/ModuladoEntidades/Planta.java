package ModuladoEntidades;

public class Planta extends Organismo {
    public Planta( int salud, int edad, boolean esReproductiva) {
        super(salud, edad, esReproductiva);
    }

    @Override
    public void crecer() {
        edad++;
        salud += 10;
    }

    @Override
    public Planta reproducirse() {
        if (esReproductiva && salud > 50) {
            return new Planta(salud, 0, false);
        }
        return null;
    }

    public int serComido() {
        int recursosObtenidos = salud / 2;
        salud -= recursosObtenidos;
        return recursosObtenidos;
    }

    public boolean isReproductiva() {
        return esReproductiva;
    }
}