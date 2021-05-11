package prueba;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ejercicio1Curso {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in); //instancio la clase scan
        Date fecha= new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");

        /*ingreso el producto 1*/
        System.out.println("Ingrese el primer producto");
        System.out.println("Cantidad: ");
        int cantProducto1= scan.nextInt();
        scan.nextLine();
        System.out.println("Descripcion: ");
        String descripcionProducto1= scan.nextLine();  /*lee un string*/
        System.out.println("Valor:");
        double valorUnitario1= scan.nextDouble();
        double total1=cantProducto1*valorUnitario1;

        
        /*ingreso el producto 2*/
        System.out.println("\nIngrese el segundo producto");
        System.out.println("\tCantidad: ");
        int cantProducto2= scan.nextInt();
        scan.nextLine();
        System.out.println("\tDescripcion: ");
        String descripcionProducto2= scan.nextLine();  /*lee un string*/
        System.out.println("\tValor:");
        double valorUnitario2= scan.nextDouble();
        double total2=cantProducto2*valorUnitario2;

        /*ingreso los datos del comprador*/
        System.out.println("Ingrese Razon Social.");
        String razonSocial= scan.nextLine();
        System.out.println("Ingrese Domicilio.");
        String domicilio= scan.nextLine();

        /*IMPRIMO FACTURA*/
        System.out.println("*******************************************");
        System.out.println("Fecha" + sdf.format(fecha));
        System.out.println("*******************************************");
        System.out.println("Nombre: "+ razonSocial);
        System.out.println("Domicilio: "+ domicilio);
        System.out.println("*******************************************");
        System.out.println("Cant.  / Descripcion            / P. unit.      / P.total ");
        System.out.println("-------------------------------------------");
        System.out.println(cantProducto1 +"      / "+ descripcionProducto1 +   " / "+ valorUnitario1 + " / " + total1);
        System.out.println("-------------------------------------------");
        System.out.println(cantProducto2 +"      / "+ descripcionProducto2 +   " / "+ valorUnitario2 + " / " + total2);
        System.out.println("-------------------------------------------");
        System.out.println("IVA: $" + (total1+total2)* 0.21);      
        System.out.println("Subtotal sin IVA: $" + total1+total2);
        System.out.println("Total: $"+ (total1+total2)*1.21 );
        System.out.println("*******************************************");
        
        scan.close();

	}

}
