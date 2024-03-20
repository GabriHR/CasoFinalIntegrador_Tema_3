package ModuladoEntidades;

public class Ambiente {
    private String clima;
    private String tipo;
    private int recursosDisponibles;
    private String temperatura;
    private int humedad;
    private int nivelDeLuz;

    public Ambiente(String clima, String tipo, int recursosDisponibles, String temperatura, int humedad, int nivelDeLuz) {
        this.clima = clima;
        this.tipo = tipo;
        this.recursosDisponibles = recursosDisponibles;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.nivelDeLuz = nivelDeLuz;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTipo() {
        return tipo;
    }

    public int getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void setRecursosDisponibles(int recursosDisponibles) {
        this.recursosDisponibles = recursosDisponibles;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public int getHumedad() {
        return humedad;
    }

    public int getNivelDeLuz() {
        return nivelDeLuz;
    }
}