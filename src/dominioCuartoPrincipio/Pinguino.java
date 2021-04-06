package dominioCuartoPrincipio;

public class Pinguino implements Ave, IAveNadadora{

    public Pinguino() {
    }

    @Override
    public void nadar(){
        System.out.println("Pinguino: nadar");
    }

    @Override
    public void comer(){
        System.out.println("Pinguino: comer");
    }
}
