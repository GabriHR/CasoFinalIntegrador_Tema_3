package GestionUsuarios;

import ModuladoEntidades.Ambiente;
import ModuladoEntidades.Animal;

import java.util.List;

public class Simulacion {
    private boolean sesionIniciada;
    private Ambiente ambiente;
    private List<Animal> animales;
    private String resultados;

    public Simulacion(boolean sesionIniciada, Ambiente ambiente, List<Animal> animales, String resultados) {
        this.sesionIniciada = sesionIniciada;
        this.ambiente = ambiente;
        this.animales = animales;
        this.resultados = resultados;
    }

    public boolean isSesionIniciada() {
        return sesionIniciada;
    }

    public void setSesionIniciada(boolean sesionIniciada) {
        this.sesionIniciada = sesionIniciada;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }
}