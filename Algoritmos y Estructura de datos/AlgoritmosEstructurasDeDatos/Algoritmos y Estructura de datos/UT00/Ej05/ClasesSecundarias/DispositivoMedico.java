package ClasesSecundarias;
import java.util.Objects;

public abstract class DispositivoMedico {
    protected final int idDispositivo;
    protected String codigoFabricante;
    protected byte nivelBateria;
    public static int contador;


    // constructor
    public DispositivoMedico(int idDispositivo, String codigoFabricante, byte nivelBateria){
        this.idDispositivo = idDispositivo;
        this.codigoFabricante = codigoFabricante;
        this.nivelBateria = nivelBateria;
        contador++;
    }

    public int getIdDispositivo(){
        return this.idDispositivo;
    }

    public String getCodigoFabricante(){
        return this.codigoFabricante;
    }

    public byte getNivelBateria(){
        return this.nivelBateria;
    }

    public static int getContador(){
        return contador;

    }

    @Override
        public boolean equals(Object obj){
            if(this == obj){ // si es objeto, devolve true
                return true;
            }
            if(obj == null){ // si el objeto es null, devovle false
                return false;
            }
            if(this.getClass()!=obj.getClass()){ // si el objeto no pertenece a la clase, devolve false
                return false;
            }
            DispositivoMedico otro = (DispositivoMedico) obj; // Yo sé que este objeto en realidad es de este tipo.
            
            return this.idDispositivo == otro.idDispositivo && this.codigoFabricante == otro.codigoFabricante; // compara id 
            }

    @Override
        public int hashCode(){
                return Objects.hash(idDispositivo, codigoFabricante);
        }


}