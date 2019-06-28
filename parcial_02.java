package parci1;

import java.util.Scanner;

public class parcial_02 {
    Scanner teclado = new Scanner(System.in);

    String nombre;
    float nota1;
    float nota2;
    float nota3;
    float nota4;
    float promedio;

    public void mostra01() {
        System.out.println(" Ingrese el nombre del estudiante ---> ");
        nombre = teclado.next();

        System.out.println(" Ingrese la primera nota ---> ");
        nota1 = teclado.nextFloat();

        System.out.println(" Ingrese la segunda nota ---> ");
        nota2 = teclado.nextFloat();

        System.out.println(" Ingrese la tercera nota ---> ");
        nota3 = teclado.nextFloat();

        System.out.println(" Ingrese la cuarta nota ---> ");
        nota4 = teclado.nextFloat();

        promedio = nota1 + nota2 + nota3 + nota4 / 4;

        if (promedio >= 71) {
            System.out.println(" el estudiante : " + nombre + " aprobo con = " + promedio);
        } else {
            System.out.println(" El estudiante : " + nombre + " reprobo con = " + promedio);
        }
    }
}