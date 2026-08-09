package AlgoritmosEstructurasDeDatos.Ej13;

enum TipoCaracter {
 VOCAL,
 CONSONANTE,
 DIGITO,
 OTRO
}

 class UsoEnum{
    TipoCaracter tipoCaracter;


    public UsoEnum(TipoCaracter tipoCaracter){
        this.tipoCaracter = tipoCaracter;
    }
    
    public void mostrarTipos(){
        for(TipoCaracter tc : TipoCaracter.values()){
            System.out.println(tc);
        }
    }

    public static TipoCaracter clasificarCaracter(char caracter){
        if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
            return TipoCaracter.VOCAL;
        }
        else if(Character.isLetter(caracter)){
            return TipoCaracter.CONSONANTE;
        }
        else if(Character.isDigit(caracter)){
            return TipoCaracter.DIGITO;
        }
        else{
            return TipoCaracter.OTRO;
        }
    }
    
}

