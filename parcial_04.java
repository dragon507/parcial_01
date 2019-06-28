package parci1;

import java.util.Scanner;

public class parcial_04 {
    Scanner teclado = new Scanner(System.in);

    String nombre;
    String apellido;
    int dias;
    int tipo;
    int caso=5;
    double total;
    double descu;

    public void vaca (){
        System.out.println(" Ingrese el nombre --->");
        nombre = teclado.next();
        System.out.println(" Ingrese el apellido ----> ");
        apellido = teclado.next();
        System.out.println(" Ingrese la habitacion que se le asignara ----> ");
        tipo = teclado.nextInt();
        System.out.println(" Ingrese la cantidad de días que se va a quedar ----> ");
        dias = teclado.nextInt();

        switch (tipo){
            case 1:
                if (dias>=5&&dias<=10){
                    descu = 120 * 0.10;
                    total = 120 - descu;
                System.out.println(" la cantidad de días que te quedaras es de = "+dias+"Su total a pagar es de = "+total);
                }else if (dias>=10&&dias<=14){
                descu = 120 * 0.15;
                total = 120 - descu;
                System.out.println(" la cantidad de días que te quedaras es de = "+dias+"Su total a pagar es de = "+total);
            }else if (dias>=15){
                descu = 120 * 0.20;
                total = 120 - descu;
                System.out.println(" la cantidad de días que te quedaras es de = "+dias+"Su total a pagar es de = "+total);
            }
                break;

            case 2:
                if (dias>=5&&dias<=10){
                    descu = 155 * 0.10;
                    total = 120 - descu;
                    System.out.println(" la cantidad de días que te quedaras es de = "+dias+"Su total a pagar es de = "+total);
                }else if (dias>=10&&dias<=14){
                    descu = 155 * 0.15;
                    total = 155 - descu;
                    System.out.println(" la cantidad de días que te quedaras es de = "+dias+"Su total a pagar es de = "+total);
                }else if (dias>=15){
                    descu = 155 * 0.20;
                    total = 155 - descu;
                    System.out.println(" la cantidad de días que te quedaras es de = "+dias+"Su total a pagar es de = "+total);
                }
                    break;

            case 3:
                if (dias>=5&&dias<=10){
                    descu = 210 * 0.10;
                    total = 210 - descu;
                    System.out.println(" la cantidad de días que te quedaras es de = "+dias+"Su total a pagar es de = "+total);
                }else if (dias>=10&&dias<=14){
                    descu = 210 * 0.15;
                    total = 210 - descu;
                    System.out.println(" la cantidad de días que te quedaras es de = "+dias+"Su total a pagar es de = "+total);
                }else if (dias>=15){
                    descu = 210 * 0.20;
                    total = 210 - descu;
                    System.out.println(" la cantidad de días que te quedaras es de = "+dias+"Su total a pagar es de = "+total);
                }
                    break;

            case 4:
                if (dias>=5&&dias<=10){
                    descu = 185 * 0.10;
                    total = 185 - descu;
                    System.out.println(" la cantidad de días que te quedaras es de = "+dias+"Su total a pagar es de = "+total);
                }else if (dias>=10&&dias<=14){
                    descu = 185 * 0.15;
                    total = 185 - descu;
                    System.out.println(" la cantidad de días que te quedaras es de = "+dias+"Su total a pagar es de = "+total);
                }else if (dias>=15){
                    descu = 185 * 0.20;
                    total = 185 - descu;
                    System.out.println(" la cantidad de días que te quedaras es de = "+dias+"Su total a pagar es de = "+total);
                }
                    break;

            case 5:
                if (dias>=5&&dias<=10){
                    descu = 400 * 0.10;
                    total = 400 - descu;
                    System.out.println(" la cantidad de días que te quedaras es de = "+dias+"Su total a pagar es de = "+total);
                }else if (dias>=10&&dias<=14){
                    descu = 400 * 0.15;
                    total = 400 - descu;
                    System.out.println(" la cantidad de días que te quedaras es de = "+dias+"Su total a pagar es de = "+total);
                }else if (dias>=15){
                    descu = 400 * 0.20;
                    total = 400 - descu;
                    System.out.println(" la cantidad de días que te quedaras es de = "+dias+"Su total a pagar es de = "+total);
                }
                    break;
                default:
                    System.out.println("Digite una opción correcta ");
        }



    }
}
