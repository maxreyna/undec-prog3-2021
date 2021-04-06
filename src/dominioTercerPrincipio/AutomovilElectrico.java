package dominioTercerPrincipio;

public class AutomovilElectrico implements IAutomovil{
    private int bateria;

    @Override
    public void acelerar(){
        System.out.println("El automovil electrico acelera");
    }
}
