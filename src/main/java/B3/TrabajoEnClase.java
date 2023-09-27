package B3;

import java.util.Scanner;

public class TrabajoEnClase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double  acumulador;
        acumulador=0;
        double[] notas = new double[5];

        for (int i = 0; i < notas.length  ; i++) {

            System.out.println("Digite el valor de la nota del estudiante numero: "+(i+1));
            double valornota = scanner.nextInt();
            notas[i]=valornota;
            System.out.println(notas[i]);
        }

        for (int j = 0; j < notas.length  ; j++) {

         acumulador=acumulador+notas[j];



        }
        System.out.println("Acumulado de las 5 notas: "+acumulador);
        calcularpromedio(acumulador);
    }

    private static void calcularpromedio(double notas) {
        System.out.println("El promedio de las notas de los 5 estudiantes es de::"+(notas/5));

    }
}
