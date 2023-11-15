/*
*   Generar un programa que permita ingresar un nombre de una ciudad;
*   Los nombres de las ciudades permitidas son las que empiezan con vocal.
*   Si la ciudad es permitida presentar un mensaje:
*   Nombre con inicial O de otavalo
*   Si la ciudad no es permitida presentar un mensaje:
*   opción incorrecta; ninguna de las anteriores
     ANA DIAZ con edad 19, es estudiante de UTPL
     luis vera con edad 19, es estudiante de UNL
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese nombre del estudiante");
        String nombre_del_estudiante = entrada.nextLine();
        System.out.println("Ingrese el apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese edad");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese universidad");
        String universidad = entrada.nextLine();
        // nombre = "atacames"
        char valor = nombre_del_estudiante.charAt(0); // obtener el primer caracter de una
        // cadena
        //  L   o   j   a
        //  0   1   2   3
        switch (valor) {
            case 'a':
            case 'A':
                System.out.printf("%s %s con edad %d, es estudiante de %s\n",
                        nombre_del_estudiante.toUpperCase(), 
                        apellido.toUpperCase(), 
                        edad, universidad.toUpperCase());
                break;

            default:
                System.out.printf("%s %s con edad %d, es estudiante de %s\n",
                        nombre_del_estudiante.toLowerCase(), 
                        apellido.toLowerCase(), 
                        edad, universidad.toLowerCase());
                break;

        }

    }
}
