package test;

import dominioPrimerPrincipio.ImprimirAutomovil;

import dominioPrimerPrincipio.Automovil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testPrimerPrincipio {
    @Test
    void Test01_imprimirAutomovil(){
        Automovil a1 = new Automovil("Ford","Rojo");
        ImprimirAutomovil ia = new ImprimirAutomovil();
        ia.imprimirCaracteristicas(a1);
    }



}
