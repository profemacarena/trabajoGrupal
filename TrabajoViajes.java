package TrabajoViajes;

import java.util.Scanner;

public class TrabajoViajes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce cuantos viajeros habrá, debe de haber como mucho 5: ");
        int viajeros = s.nextInt();
        // La opción del menú
        int menu = 0;

        // Los viajeros
        int viajero1 = 0;
        int viajero2 = 0;
        int viajero3 = 0;
        int viajero4 = 0;
        int viajero5 = 0;
        // Para saber si se ha realizado las opciones 1 y 2 del menú
        int contador1 = 0;
        int contador2 = 0;

        do {
            System.out.println("Dime que quieres elegir del menú: ");
            menu = s.nextInt();

            switch (menu){
                case 1:
                    // Si se ha realizado la opcion 1, el contador se sumará
                    if (menu == 1) contador1++;
                    break;
                case 2:
                    // Si el contador de la opcion 1 es diferente de 0 (se ha realizado esta opcion), entoces haremos la opcion 2, sino se volverá a la opción 1
                    if (contador1 != 0){

                        contador2++;
                    }else{
                        System.out.println("No has introducido los gastos, metelos: ");
                        menu = 1;
                    }
                    break;
                case 3:
                    // Si el contador de la opcion 1 es diferente de 0 (se ha realizado esta opcion), entoces haremos la opcion 3, sino se volverá a la opción 1
                    if (contador1 != 0){

                    }else{
                        System.out.println("No has introducido los gastos, metelos: ");
                        menu = 1;
                    }
                    // Si el contador de la opcion 2 es diferente de 0 (se ha realizado esta opcion), entoces haremos la opcion 3, sino se volverá a la opción 2
                    if (contador2 != 0){

                    }else{
                        System.out.println("No has calculado el reparto de gastos, metelos: ");
                        menu = 2;
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Has elegido una opción que no existe");
                    break;
            }
        }while (menu != 4);

    }
}
