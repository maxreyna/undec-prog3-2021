package test;

import dominioCuartoPrincipio.Loro;
import dominioCuartoPrincipio.Pinguino;
import org.junit.jupiter.api.Test;

public class TestCuartoPrincipio {
    @Test

    void test_segregacionDeInterfaces(){
        Loro l = new Loro();
        l.comer();
        l.volar();
        Pinguino p = new Pinguino();
        p.nadar();
        p.comer();

    }
}
