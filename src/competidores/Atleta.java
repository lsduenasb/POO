
package competidores;
public class Atleta {
    private int numeroAtleta;
    private String nombreAtleta;
    private float tiempoAtleta;
    
    public Atleta(int numeroAtleta, String nombreAtleta,float tiempoAtleta){
        this.numeroAtleta=numeroAtleta;
        this.nombreAtleta=nombreAtleta;
        this.tiempoAtleta=tiempoAtleta;
    }
    public float getTiempoAtleta(){
        return tiempoAtleta;
    }
    public String mostrarDatos(){
        return "Numero Atleta: "+numeroAtleta+"\nNombre Atleta: "+nombreAtleta+"\nTiempo Atleta: "+tiempoAtleta+"\n";
    }
}
