package GestionUsuarios;

import GestionUsuarios.Simulacion;

import java.util.ArrayList;
import java.util.List;
public class RegistroActividades {
    private List<Simulacion> simulaciones;

    public RegistroActividades() {
        this.simulaciones = new ArrayList<>();
    }

    public void registrarSimulacion(Simulacion simulacion) {
        this.simulaciones.add(simulacion);
    }

    // Otros métodos para interactuar con las simulaciones...
}