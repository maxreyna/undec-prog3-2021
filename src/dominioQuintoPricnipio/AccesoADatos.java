package dominioQuintoPricnipio;

public class AccesoADatos {
    private Conexion miConexion;

    public AccesoADatos(Conexion miConexion){
        this.miConexion = miConexion;
    }
    
    Dato getDatos(){
        miConexion.getDatos();
    }


}
