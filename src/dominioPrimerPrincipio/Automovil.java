package dominioPrimerPrincipio;

public class Automovil {
    private String marca;
    private String color;

    public Automovil (String marca, String color){
        this.marca = marca;
        this.color = color;
    }

    public void acelera(){
        System.out.println("El automovil acelera");
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
