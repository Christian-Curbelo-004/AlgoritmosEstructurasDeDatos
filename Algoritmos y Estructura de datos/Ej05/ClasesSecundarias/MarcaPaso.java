
package ClasesSecundarias;



public class MarcaPaso extends DispositivoMedico{

        // atributos

        private short latidosPorMinutos;
        

        // constructor
        public MarcaPaso(int idDispositivo, String codigoFabricante,short latidosPorMinutos,  byte nivelBateria){
            super(idDispositivo, codigoFabricante, nivelBateria);
            this.latidosPorMinutos = latidosPorMinutos;
        }

        /* 
        Solamente get de id 
        public int getIdDispositivo(){
            return this.idDispositivo;
        }
        */ 

        /* 
        getter de codigo de fabriacante
        public String getCodigoFabricante(){
            return this.codigoFabricante;
        }        
        */ 

        /*getter de nivel de bateria
        public short getNivelBateria(){
            return this.nivelBateria;
        } */ 
        

        
        /* 
        setter de nivel de bateria
        public void setNivelBateria(byte nivelBateria){
            this.nivelBateria = nivelBateria;
        }
        
        */ 

        /* 
        Incorporar un contador static de instancias creadas y un identificador constante final del dispositivo.
        public static int getContador(){
            return contador;
        }
        */ 

        // getter de latidos por minutos;
        public short getLatidosPorMinutos(){
            return this.latidosPorMinutos;
        }
        // setter de latidos por minutos
        public void setLatidosPorMinutos(short latidosPorMinutos){
            this.latidosPorMinutos = latidosPorMinutos;
        }
        
        // toString para que sea legible
        @Override
        public String toString(){
            return "Marcapasos\n" +
            "ID: " + idDispositivo +  "\n" +
            "Codigo de fabricante: " + codigoFabricante +"\n"
            + "Latidos por minutos: " + latidosPorMinutos + "\n" +
            "Nivel de bateria: " + nivelBateria;
        }

        /* equals 
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
            MarcaPaso otro = (MarcaPaso) obj; // Yo sé que este objeto en realidad es de este tipo.
            
            return this.idDispositivo == otro.idDispositivo; // compara id 
            }
        */  

        /*
        
        @Override
        public int hashCode(){
            return idDispositivo;
        }
        
        */
    
        // main
        public static void main(String[] args){
            MarcaPaso m1 = new MarcaPaso(10,"1234",(short)100, (byte) 60);
            MarcaPaso m2 = new MarcaPaso(11,"1234",(short)100, (byte)60);
            MarcaPaso m3 = new MarcaPaso(12,"1234",(short)100, (byte) 60);
            Desfibrilador d1 = new Desfibrilador(13, "5678", (byte)80, 200, 3);
            System.out.println("Cantidad de dispositivos: " + DispositivoMedico.getContador());
            System.out.println();
            System.out.println(m1);
            System.out.println(m2);
            System.out.println(m3);
            System.out.println(d1);


        }
    }
