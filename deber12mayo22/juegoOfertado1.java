package deber12mayo22;

public class juegoOfertado1 {
    //atributos de la clase

    public String nombreJuego;
    
    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String generoJuego;
    public int añoPublicacion;
    public String clasificación;

    //constructores
    
    public juegoOfertado1(){
    }

    public juegoOfertado1(String nombreJuego, String generoJuego, int añoPublicacion, String clasificación) {
        this.nombreJuego = nombreJuego;
        this.generoJuego = generoJuego;
        this.añoPublicacion = añoPublicacion;
        this.clasificación = clasificación;
    }

    //metodos
    

    public static void mostrarNombrejuego (){
        System.out.println("nombreJuego...." );
    }

    public static void restriccionJuego (int edadJugador){
        if (edadJugador <= 16){
            System.out.println("no es apto por edad");
        }
        else {
            System.out.println("apto para el juego");
        }



        

}
}


