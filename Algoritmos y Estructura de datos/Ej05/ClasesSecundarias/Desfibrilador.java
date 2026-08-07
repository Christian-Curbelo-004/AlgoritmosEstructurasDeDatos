package ClasesSecundarias;
public class Desfibrilador extends DispositivoMedico{
    protected int nivelDescargas;
    protected int cantidadCargasAplicadas;


    public Desfibrilador(int idDispositivo, String codigoFabricante, byte nivelBateria, int nivelDescargas, int cantidadCargasAplicadas){
            super(idDispositivo, codigoFabricante, nivelBateria);
            this.nivelDescargas = nivelDescargas; 
            this.cantidadCargasAplicadas = cantidadCargasAplicadas;
            
        }
        public int getNivelDescargas(){
            return this.nivelDescargas;
        }
        public int setNivelDescargas(){
            return this.nivelDescargas;
        }

        public int getCantidadCargasAplicadas(){
            return this.cantidadCargasAplicadas;
        }

        public int setCantidadCargasAplicadas(){
            return this.cantidadCargasAplicadas;
        }

    @Override
        public String toString(){
            return "Desfibrilador\n" +
            "ID: " + idDispositivo +  "\n" +
            "Codigo de fabricante: " + codigoFabricante +"\n"
            + "Nivel de descargas: " + nivelDescargas + "\n" +
            "Cantidad de cargas aplicadas:" + cantidadCargasAplicadas + "\n"+
            "Nivel de bateria: " + nivelBateria;
        }


}
