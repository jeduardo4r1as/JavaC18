package B4;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
* Enunciado del ejercicio:
Escribe un programa en Java que solicite al usuario ingresar dos números enteros. Luego,
* usa un bucle while para mostrar la multiplicación de los números ingresados hasta que el
* resultado sea mayor que 100. Utiliza un bucle do-while para pedir al usuario que ingrese
* nuevamente los números si la multiplicación no supera 100. Agrega manejo de excepciones con
* try-catch para evitar errores de división por cero si el segundo número es igual a cero.
* Registra todos los pasos importantes del programa en un archivo de registro (log) para un
*  seguimiento detallado de su ejecución.
* */
public class EjercicioEnClase {

    private static final Logger logger = Logger.getLogger(EjemploTryCatch.class.getName());
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int  resultado;
        resultado=0;


        int numero1;
        numero1= 0;



        int numero2;
        numero2= 0;

/*
se coloca el scanner dentro de los ciclos ya que si se coloca afuera  se vuelve en un ciclo infinito
 */
        while (resultado<100) {
            System.out.println("Ingrese el numero uno para realizar mutiplicacion  while");
            numero1 = scanner.nextInt();


            System.out.println("Ingrese el numero dos para realizar mutiplicacion  while");
            numero2 = scanner.nextInt();
            if(numero1==0 || numero2==0){

                resultado = (numero1 * numero2);
                System.out.println("Ingrese un valor aceptable con el numero 1 y 2 ya que 0 no lo es: " + resultado);
            }else{

                resultado = (numero1 * numero2);


                System.out.println("Valor de la operacion del resultado (while): " + resultado);
            }





        }







        do {
            System.out.println("Ingrese el numero uno para realizar mutiplicacion do while");
            numero1 = scanner.nextInt();


            System.out.println("Ingrese el numero dos para realizar mutiplicacion do while");
            numero2 = scanner.nextInt();


            try {
                resultado=(numero1*numero2);

                if (numero1 == 0 || numero2==0) {
                    throw new Exception("Por favor ingrese un valor valido para los numeros para la operacion");
                }


                logger.log(Level.INFO, "El resultado de la multiplicacion es es : " + resultado);
            }catch (Exception e){
                logger.log(Level.SEVERE, "Error ", e);
            }
        } while (resultado <100);


    }


}
