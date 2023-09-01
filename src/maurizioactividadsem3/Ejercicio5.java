
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Alumno
 */
public class Ejercicio5 {
    public static void main(String[] args) {
       
            Scanner sc= new Scanner(System.in);
            System.out.println("Introduzca un numero para hallar el numero de la semana");
            int n= sc.nextInt();
            System.out.println("Ya puedes leer un texto ingresado por teclado" + n);
       

        String diaSemana;

        switch (n) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Número fuera de rango";
                break;
        }

        System.out.println("El día de la semana correspondiente al número ingresado es: " + diaSemana);
}
}
