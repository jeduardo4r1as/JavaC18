package B2;

import java.util.Scanner;

/* y
Clacular el valor en pesos de un valor x segun la trm de hoy
calcular el area de un cuadrado.

 */
public class TrabajoEnCLase {





    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     int valordolar=3980;

        System.out.println("Digite el valor en peso colombiano para convertir en dolar EEUU");
        int valorpeso = scanner.nextInt();


        System.out.println("Digite el primer  lado del cuadrado para calculara el area");
        int lado1 = scanner.nextInt();


        System.out.println("Digite el segundo  lado del cuadrado para calculara el area");
        int lado2 = scanner.nextInt();





        conversion(valordolar,valorpeso);
        calculararea(lado1,lado2);

    }
    private static void conversion(int dolar, int peso) {
        System.out.println("La Conversion de peso al dolar es de :"+(peso/dolar));

    }
    private static void calculararea(int lado1, int lado2) {
        System.out.println("El area de un cuadrado es:"+(lado1*lado2));

    }
}
