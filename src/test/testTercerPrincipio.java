package test;


import dominioTercerPrincipio.Automovil;
import dominioTercerPrincipio.AutomovilElectrico;
import org.junit.jupiter.api.Test;

public class testTercerPrincipio {

    @Test
    void Test01_acelerarAutomovil(){
        Automovil a1 = new Automovil();
        a1.acelerar();
        AutomovilElectrico a2 = new AutomovilElectrico();
        a2.acelerar();
    }

}
