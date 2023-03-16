import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la x");
        int x = teclado.nextInt();

        System.out.println("Dime la y");
        int y= teclado.nextInt();


        System.out.println(Funciones.funcion1(x,y));
        System.out.println(Funciones.funcion2(x,y));
    }
}
