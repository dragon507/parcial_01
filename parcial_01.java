package parci1;

import java.util.Scanner;

public class parcial_01 {
    Scanner teclado = new Scanner(System.in);

    float ancho;
    float largo;
    float m2;
    double longi;
    double precio=3.50;
    double costo;

    public void mos(){

        System.out.println(" Ingrese el ancho del terreno---> ");
        ancho = teclado.nextFloat();

        System.out.println(" Ingrese el largo del terreno---> ");
        largo = teclado.nextFloat();

        m2 = ancho * largo;
        costo = m2 * precio;
        System.out.println(" el total en metros cudrados es de  " + m2+" el costo del terreno es de = " + costo);


    }
}
