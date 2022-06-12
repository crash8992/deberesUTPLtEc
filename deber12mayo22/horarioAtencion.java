package deber12mayo22;


public class horarioAtencion {

    //atributos
    public String diaSemana;
    
    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public float horaDia;
    public String turnoAtención;
    public String encargadoTurno;

    //constructores

    public horarioAtencion(){

    }

    public horarioAtencion(String diaSemana, float horaDia, String turnoAtención, String encargadoTurno) {
        this.diaSemana = diaSemana;
        this.horaDia = horaDia;
        this.turnoAtención = turnoAtención;
        this.encargadoTurno = encargadoTurno;
    }

    //metodos

    public void mostrarHorario(){
        System.out.println("diaSemana...." + horaDia);
    }
    
    public void horaDecerrar (Float horaDia){
        if (horaDia >= 18){
            System.out.println("se termino el turno");
        }
        else {
            System.out.println("revisar la hora");
            }
    }
    
    
    public static void main(String[] args) {
        System.out.println("sintaxis código OK");
    }



    
}
