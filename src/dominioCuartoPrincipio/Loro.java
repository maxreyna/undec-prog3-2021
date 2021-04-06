package dominioCuartoPrincipio;

public class Loro implements Ave,IAveVoladora{

    public Loro() {
    }

    @Override
    public void volar(){
        System.out.println("Loro: Volar!");
    }

    @Override
    public void comer(){
        System.out.println("Loro: Comer");
    }
}
