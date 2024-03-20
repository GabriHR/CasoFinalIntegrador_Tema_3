package AnalisisAvanzado;

import ModuladoEntidades.Ambiente;
import ModuladoEntidades.Organismo;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class IntegracionNuevasFunciones {
    private Map<String, BiConsumer<Organismo, Ambiente>> interaccionesAmbiente;

    public IntegracionNuevasFunciones() {
        this.interaccionesAmbiente = new HashMap<>();
    }

    public void registrarInteraccionAmbiente(String clave, BiConsumer<Organismo, Ambiente> accion) {
        interaccionesAmbiente.put(clave, accion);
    }

    public void ejecutarInteraccionAmbiente(String clave, Organismo org, Ambiente ambiente) {
        if (interaccionesAmbiente.containsKey(clave)) {
            interaccionesAmbiente.get(clave).accept(org, ambiente);
        } else {
            System.out.println("Interacción no registrada: " + clave);
        }
    }
    public void imprimirInformacion() {
        System.out.println("Método imprimirInformacion en IntegracionNuevasFunciones se está ejecutando");
        System.out.println("Esta es la clase IntegracionNuevasFunciones. Permite registrar y ejecutar interacciones con el ambiente.");
    }
}