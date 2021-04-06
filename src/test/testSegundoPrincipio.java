package test;

import dominioPrimerPrincipio.Automovil;
import dominioSegundoPrincipio.AutomovilDeCarrera;
import org.junit.jupiter.api.Test;

public class testSegundoPrincipio {

    @Test
    void Test01_acelerarAutomovil(){
        Automovil a1 = new Automovil("Ford","Rojo");
        a1.acelera();
        Automovil a2 = new AutomovilDeCarrera("Renault","Rojo");
        a2.acelera();
    }
}
