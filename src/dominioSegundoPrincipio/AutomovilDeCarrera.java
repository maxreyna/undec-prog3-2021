package dominioSegundoPrincipio;

import dominioPrimerPrincipio.Automovil;

public class AutomovilDeCarrera extends Automovil {

    public AutomovilDeCarrera(String marca, String color) {
        super(marca, color);
    }

    @Override
    public void acelera(){
        inyectarCombustible();
        super.acelera();
    }

    private void inyectarCombustible(){
        System.out.println("Inyeccion de nitro");
    }
}
