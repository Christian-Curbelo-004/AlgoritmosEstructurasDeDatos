package EJPractica;

// atributos
public class CuentaBancaria{
    private String titular;
    private double saldo;
    private int numeroCuenta;

    // constructor
    public CuentaBancaria(String titular, int numeroCuenta){
        this.titular = titular;
        this.saldo = 0;
        this.numeroCuenta = numeroCuenta;
        
    }

    // metodos
    public void depositar(double monto ){
        if(monto <= 0){
            System.out.println("El monto no puede ser menor a 0");
        }
        else{
            this.saldo += monto; // tambien puedo usar this.saldo += monto;
        }
        
    }
    public void retirar(double monto ){
         if (monto <= 0) {
        System.out.println("El monto debe ser mayor que 0.");
    }

       else if(this.saldo < monto){
            System.out.println("No hay saldo suficiente.");
        }
        else{
            this.saldo -= monto; // tambien puedo usar this.saldo -= monto;
        }
        
    }

    public void mostrarDatos(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Numero de cuenta: " + this.numeroCuenta);
        System.out.println("Saldo: " + this.saldo);

    }


    public static void main(String[] args){
        CuentaBancaria cuenta = new CuentaBancaria("QUE OPINAN DE LA MERCA?", 12345); // instancia de objeto
        
        // PRUEBEN A SU GUSTO
        cuenta.depositar(1000);
        cuenta.retirar(350);
        cuenta.retirar(1000);
        cuenta.mostrarDatos();
    }

}