/*importa clases para el funcionamiento del programa*/
import java.text.DecimalFormat;
import java.util.Scanner;

/*Inicio*/
public class Aplicacion {
    public static void main(String[]args) {

/*Definir variables, etc.*/ 
        Scanner in = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("###,###.##");
        int opc,dia,mes;
        boolean salir = false;

/*Comienzo del programa (se visualiza la interfaz con ASCII)*/
        do{
        System.out.println(   "_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._");
        System.out.println( ",'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.");
        System.out.println("( (                                                         ) )");
        System.out.println(" ) )                    BIENVENIDO A TU                    ( (");
        System.out.println("( (                   CALCULADORA FAVORITA                  ) )");
        System.out.println(" ) )                                                       ( (");
        System.out.println("( (         Elije tu Opcion:                                ) )");
        System.out.println(" ) )                                                       ( (");
        System.out.println("( (         1. Calcular tu signo del zodiaco                ) )");
        System.out.println(" ) )        2. Calcular Tus dias vividos.                  ( (");
        System.out.println("( (         3. Calcular tu edad en años de perro.           ) )");
        System.out.println(" ) )        4. Caluclar tu número según la numerología.    ( (");
        System.out.println("( (         5. Calcular todos los anteriores.               ) )");
        System.out.println(" ) )        6. Salir                                       ( (");
        System.out.println("( (                                                         ) )");
        System.out.println(" ) )           Realizada por Mkclaren y Camilo.           ( (");
        System.out.println("( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )");
        System.out.println(" `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'");
        System.out.println("");
        
        System.out.print("Ingrese una opcion ");
        opc = in.nextInt();

/*Eleccion de opciones*/
        switch(opc){
            case 1:
                System.out.println("Has seleccionado la opcion 1");
                do {
                    System.out.println("");
                    System.out.print("Ingresa el dia de tu nacimiento: ");
                    dia = in.nextInt();
                    if(dia > 31 || dia < 1){
                        System.out.println("Debes elegir un dia entre 1 y 31");
                    }
                } while(dia >31 || dia < 1);
                System.out.println("");

                do{
                    System.out.print("Ingresa el mes de tu nacimiento: ");
                    mes = in.nextInt();
                    if(mes > 12 || mes < 1){
                    System.out.println("Debes elegir un mes entre 1 y 12");
                }
                }while(mes > 12 || mes < 1);
                System.out.println("");

                if(dia >= 21 && mes == 3 ||dia <= 20 && mes == 4){
                    System.out.println("Signo: Aries");
                }
                if(dia >= 24 && mes == 9 || dia <= 23 && mes == 10 ){
                    System.out.println("Signo: Libra");
                }
                if(dia >= 21 && mes == 4 || dia <= 21 && mes == 5){
                    System.out.println("Signo: Tauro");
                }
                if(dia >= 24 && mes == 10 || dia <= 22 && mes == 11){
                    System.out.println("Signo: Escorpio");
                }
                if(dia >= 22 && mes == 5 || dia <= 21 && mes == 6){
                    System.out.println("Signo: Geminis");
                }
                if(dia >= 23 && mes == 11 || dia <= 21 && mes == 12){
                    System.out.println("Signo: Sagitario");
                }
                if(dia >= 21 && mes == 6 || dia <= 23 && mes == 7){
                    System.out.println("Signo: Cancer");
                }
                if(dia >= 22 && mes == 12 || dia <= 20 && mes == 1){
                    System.out.println("Signo: Capricornio");
                }
                if(dia >= 24 && mes == 7 || dia <= 23 && mes == 8){
                    System.out.println("Signo: Leo");
                }
                if(dia >= 21 && mes == 1 || dia <= 19 && mes == 2){
                    System.out.println("Signo: Acuario");
                }
                if(dia >= 24 && mes == 8 || dia <= 23 && mes == 9){
                    System.out.println("Signo: Virgo");
                }
                if(dia >= 20 && mes == 2 || dia <= 20 && mes == 3){
                    System.out.println("Signo: Piscis");
                }
                break;

                case 2:
                System.out.println("Has seleccionado la opcion 2");
                break;

                case 3:
                System.out.println("Has seleccionado la opcion 2");
                break;

                case 4:
                System.out.println("Has seleccionado la opcion 2");
                break;

                case 5:
                System.out.println("Has seleccionado la opcion 2");
                break;

                case 6:
                salir=true;
                default:
                System.out.println("opcion incorrecta");

        }           
        break;
        }while(!salir);
        System.out.println("Has salido del programa");

    } 
}
