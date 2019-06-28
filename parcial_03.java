package parci1;

import java.util.Scanner;

public class parcial_03 {
    Scanner teclado = new Scanner(System.in);

    int canti;
    float preci=100;
    float total;

    public void mostra(){
        System.out.println(" Ingrese cuantos trajes quieres = ");
        canti = teclado.nextInt();

        if (canti==1){
            total = preci * 50 / preci;
            System.out.println("su total de descuento es de = " + total);
        }else if (canti == 2){
            total = preci * 55 / preci;
            System.out.println("su total de descuento es de =" + total);
        }else if (canti >= 3){
            total = preci * 65 / preci;
            System.out.println("su total de descuento es de =" + total);
        }
    }
}
