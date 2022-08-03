package tema3_1;
/*
Primera parte:
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.
*/
public class Ejercicio1 {
    public static void main(String arg[]){
        int resultado;
        resultado = suma(10,20, 10 );
        System.out.println("El resultado de a+b+c es: "+resultado );
    }
    public static int suma (int a, int b, int c){
        return a + b + c;
    }
}
