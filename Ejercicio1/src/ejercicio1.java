import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		 SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		 Scanner scan= new Scanner(System.in); //instancio la clase scan
	        Date fecha= new Date();
	       

	        /*ingreso el producto 1*/
	        System.out.println("Ingrese el primer producto");
	        System.out.println("\tCantidad: ");
	        int cantProducto1= scan.nextInt();
	        scan.nextLine();
	        System.out.println("\tDescripcion: ");
	        String descripcionProducto1= scan.nextLine();  /*lee un string*/
	        System.out.println("\tValor sin iva:");
	        double valorUnitario1= scan.nextDouble();
	        double total1=cantProducto1*valorUnitario1;

	        
	        /*ingreso el producto 2*/
	        System.out.println("\nIngrese el segundo producto");
	        System.out.println("\tCantidad: ");
	        int cantProducto2= scan.nextInt();
	        scan.nextLine();
	        System.out.println("\tDescripcion: ");
	        String descripcionProducto2= scan.nextLine();  /*lee un string*/
	        System.out.println("\tValor sin iva:");
	        double valorUnitario2= scan.nextDouble();
	        double total2=cantProducto2*valorUnitario2;

	        /*ingreso los datos del comprador*/
	        System.out.println("Ingrese Razon Social.");
	        String razonSocial= scan.nextLine();
	        scan.nextLine();
	        System.out.println("Ingrese Domicilio.");
	        String domicilio= scan.nextLine();

	        /*IMPRIMO FACTURA*/
	        System.out.println("**************************************************");
	        System.out.println("\t\t\t\tFecha " + sdf.format(fecha));
	        System.out.println("**************************************************");
	        System.out.println("Nombre: "+ razonSocial);
	        System.out.println("Domicilio: "+ domicilio);
	        System.out.println("**************************************************");
	        System.out.println("Cant.\t | Descripcion\t | P. unit.\t | SubTotal ");
	        System.out.println("--------------------------------------------------");
	        System.out.println(cantProducto1 +"\t | "+ descripcionProducto1 + "\t | "+ valorUnitario1 + "\t\t | "+ total1);
	        System.out.println("--------------------------------------------------");
	        System.out.println(cantProducto2 +"\t | "+ descripcionProducto2 + "\t | "+ valorUnitario2 + "\t\t | "+ total2);
	        System.out.println("--------------------------------------------------");
	        System.out.println("IVA: $" + (total1+total2)* 0.21);      
	        System.out.println("Total: $"+ ((total1+total2)+ (total1+total2)* 0.21));
	        System.out.println("*************************************************");
	        
	        scan.close();
	}

}
