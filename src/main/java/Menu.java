import java.util.Scanner;

public class Menu {
    static Scanner teclado = new Scanner(System.in);
    public static void menu(){
        int opcion=0;
        while(opcion!=3) {

            System.out.println("Dime  la opcion a elegir: ");
            System.out.println("1- Calcular por multiplicaciones sucesivas");
            System.out.println("2- Calcular por orden computacional");
            System.out.println("3- Salir");

            opcion = teclado.nextInt();
            if(opcion!=3) {
                int x = dameValorX();
                int y = dameValorY();

                if (opcion == 1) {
                    System.out.println(Funciones.funcion1(x, y));
                } else if (opcion == 2) {
                    System.out.println(Funciones.funcion2(x, y));
                } else {
                    System.out.println("Elige una opcion valida");
                }
            }
        }
        System.out.println("Hasta la proxima");

    }

    private static int dameValorX(){
        System.out.println("Dime la x");
        return teclado.nextInt();
    }
    private static int dameValorY(){
        System.out.println("Dime la y");
        return teclado.nextInt();
    }
}
