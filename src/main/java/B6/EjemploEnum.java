package B6;

public class EjemploEnum{


    public static void main(String[] args) {
        Dia hoy =  Dia.LUNES;
        TipoDeDocumento td = TipoDeDocumento.TI;

        switch (hoy){
            case LUNES -> System.out.println("hoy es lunes");
            case MARTES -> System.out.println("hoy es martes");
            case MIERCOLES -> System.out.println("hoy es Miercoles");

        }

    }
}