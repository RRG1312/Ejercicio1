public class Funciones {
    public static double funcion1(int x, int y){
        if (y == 0) {
            return 1;
        } else {
            return x * funcion1(x, y - 1);
        }
    }
    public static double funcion2(int y,int x){
        if (y == 0) {
            return 1;
        } else if (y % 2 == 0) {
            double temp = funcion2(x, y / 2);
            return temp * temp;
        } else {
            return x * funcion2(x, y - 1);
        }
    }


}
