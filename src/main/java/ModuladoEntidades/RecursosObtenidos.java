package ModuladoEntidades;

public class RecursosObtenidos {
    public int energia;
    public int hidratacion;

    public RecursosObtenidos(int energia, int hidratacion) {
        this.energia = energia;
        this.hidratacion = hidratacion;
    }

    @Override
    public String toString() {
        return "energia=" + energia +
                ", hidratacion=" + hidratacion +
                '}';
    }
}