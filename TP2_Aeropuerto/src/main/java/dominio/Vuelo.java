package dominio;

import exception.AvionErroneoException;
import exception.VueloDatoNuloException;

import java.util.Objects;

public class Vuelo {
    private String fechaDeSalida;
    private String fechaDeLlegada;
    private String horaDeSalida;
    private String horaDeLlegada;
    private String codigoDeVuelo;
    private Aerolinea aerolineaACargo;

    public Vuelo(String fechaDeSalida, String fechaDeLlegada, String horaDeSalida, String horaDeLlegada, String codigoDeVuelo, Aerolinea aerolineaACargo) throws AvionErroneoException, VueloDatoNuloException {
        if(fechaDeSalida == null || fechaDeLlegada == null || horaDeLlegada == null || horaDeSalida == null || codigoDeVuelo == null || aerolineaACargo == null ){
            throw new VueloDatoNuloException();
        }else {
            this.fechaDeSalida = fechaDeSalida;
            this.fechaDeLlegada = fechaDeLlegada;
            this.horaDeSalida = horaDeSalida;
            this.horaDeLlegada = horaDeLlegada;
            this.codigoDeVuelo = codigoDeVuelo;
            this.aerolineaACargo = aerolineaACargo;
        }
    }

    public String getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(String fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public String getFechaDeLlegada() {
        return fechaDeLlegada;
    }

    public void setFechaDeLlegada(String fechaDeLlegada) {
        this.fechaDeLlegada = fechaDeLlegada;
    }

    public String getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(String horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public String getHoraDeLlegada() {
        return horaDeLlegada;
    }

    public void setHoraDeLlegada(String horaDeLlegada) {
        this.horaDeLlegada = horaDeLlegada;
    }

    public String getCodigoDeVuelo() {
        return codigoDeVuelo;
    }

    public void setCodigoDeVuelo(String codigoDeVuelo) {
        this.codigoDeVuelo = codigoDeVuelo;
    }

    public Aerolinea getAerolineaACargo() {
        return aerolineaACargo;
    }

    public void setAerolineaACargo(Aerolinea aerolineaACargo) {
        this.aerolineaACargo = aerolineaACargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vuelo)) return false;
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(fechaDeSalida, vuelo.fechaDeSalida) &&
                Objects.equals(fechaDeLlegada, vuelo.fechaDeLlegada) &&
                Objects.equals(horaDeSalida, vuelo.horaDeSalida) &&
                Objects.equals(horaDeLlegada, vuelo.horaDeLlegada) &&
                Objects.equals(codigoDeVuelo, vuelo.codigoDeVuelo) &&
                Objects.equals(aerolineaACargo, vuelo.aerolineaACargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaDeSalida, fechaDeLlegada, horaDeSalida, horaDeLlegada, codigoDeVuelo, aerolineaACargo);
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "fechaDeSalida='" + fechaDeSalida + '\'' +
                ", fechaDeLlegada='" + fechaDeLlegada + '\'' +
                ", horaDeSalida='" + horaDeSalida + '\'' +
                ", horaDeLlegada='" + horaDeLlegada + '\'' +
                ", codigoDeVuelo='" + codigoDeVuelo + '\'' +
                ", aerolineaACargo=" + aerolineaACargo +
                '}';
    }
}
