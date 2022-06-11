package deber12mayo22;

public class juegoOfertado1 {
    //atributos de la clase

    public String nombreJuego;
    public String generoJuego;
    public int añoPublicacion;

    //constructores
    
    public juegoOfertado1(){
    }

    public juegoOfertado1(String nombreJuego, String generoJuego, int añoPublicacion) {
        this.nombreJuego = nombreJuego;
        this.generoJuego = generoJuego;
        this.añoPublicacion = añoPublicacion;
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


