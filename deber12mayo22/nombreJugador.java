package deber12mayo22;

/**
 * Hello world!
 *
 */
public class nombreJugador{ 
    
    //atributos de la clase
    public String nombreCliente;
    public String juegoPreferido;
    public int  horasDejuego;
    public String edadJugador;
    public int díasJugando;
    

    //constructores
    public nombreJugador(){
        }
    
     public nombreJugador(String nombreCliente, String juegoPreferido, int horasDejuego, String edadJugador,
            int díasJugando) {
        this.nombreCliente = nombreCliente;
        this.juegoPreferido = juegoPreferido;
        this.horasDejuego = horasDejuego;
        this.edadJugador = edadJugador;
        this.díasJugando = díasJugando;
    }       
    
         //metodos asignados
        
        public String getNombreCliente() {
            return nombreCliente;
        }
    
        public void setNombreCliente(String nombreCliente) {
            this.nombreCliente = nombreCliente;
        }

    public void mostrarNombre(){
        System.out.println("nombre..." + juegoPreferido);
}

    public void mostrarhorasDejuego (Float horasDejuego){
        if (horasDejuego >= 3){
            System.out.println("regalar 30 min");
        }
        else {
            System.out.println("perdiste 30 min");
            }
            
        }

    public void registrarHoras (int horasDejuego ,  int díasJugando){
        int r = horasDejuego*díasJugando;
        System.out.println("var r");

    }

public static void main(String[] args) {
    System.out.println("confirmación OK");
}



}
