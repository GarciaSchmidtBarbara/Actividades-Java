import java.util.Random;
import java.util.Scanner;

public class ejercicio2ControlCovid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random ();
		
		final int CANT_EMPLEADOS= 10;	//hay 50 empleados en total
		int cantCensados = 0;		//variables contador de censados
		int sector1= 0;		//contadores de empleados por sector
		int sector2= 0;
		int sector3= 0;
		int afebradosSector1= 0;		//contadores de personas CON FIEBRE de cada sector
		int afebradosSector2= 0;
		int afebradosSector3= 0;
		
		//leo el primer empleado
		System.out.print("Se ingresa el sector al que pertenece el empleado: ");
		int actual=0;
		System.out.println( actual=(1+ random.nextInt(3)) );		//indicara el sector leido
		System.out.print("Se ingresa su temperatura corporal: ");
		double temp=(double)(Math.random()*(40-36)+36);
		System.out.println(temp + "º \n");		//indicara temperatura entre 36º y 39º
		cantCensados++;		//voy controlando cuentos cense 
	
		while(cantCensados <= CANT_EMPLEADOS) {		//mientras no termine de censar a todos los empleados
			
			switch(actual) {		//sumo 1 a cada sector y si tiene fiebre lo contabilizo
			case 1:
				sector1++;
				if(temp >37.5) afebradosSector1++;
				break;
			case 2:
				sector2++;
				if(temp >37.5) afebradosSector2++;
				break;
			case 3:
				sector3++;
				if(temp >37.5) afebradosSector3++;
				break;
			}
			
			//leo el siguiente empleado
			System.out.print("Se ingresa el sector al que pertenece el empleado: ");
			actual=0;
			System.out.println( actual=(1+ random.nextInt(3)) );		//indicara el sector leido
			System.out.print("Se ingresa su temperatura corporal: ");
			temp=(double)(Math.random()*(40-36)+36);
			System.out.println(temp + "º \n");		//indicara temperatura entre 36º y 39º
			cantCensados++;		//voy controlando cuentos cense 
			
		}
		scan.close();
		
		System.out.println("FIN DE LA LECTURA. CONCLUSIONES: ");
		System.out.println("\n SECTOR 1: Posee "+sector1+" empleados, de los que "+afebradosSector1+" tienen fiebre.");
		if(afebradosSector1 != 0) System.out.println("\t Por lo tanto el sector 1 debe ser aislado, con un promedio de "+ ((afebradosSector1*100)/sector1) +"% de afebrados.");
		System.out.println("\n SECTOR 2: Posee "+sector2+" empleados, de los que "+afebradosSector2+" tienen fiebre.");
		if(afebradosSector2 != 0) System.out.println("\t Por lo tanto el sector 2 debe ser aislado, con un promedio de "+ ((afebradosSector2*100)/sector2) + "% de afebrados.");
		System.out.println("\n SECTOR 3: Posee "+sector3+" empleados, de los que "+afebradosSector3+" tienen fiebre.");
		if(afebradosSector3 != 0) System.out.println("\t Por lo tanto el sector 3 debe ser aislado., con un promedio de "+ ((afebradosSector3*100)/sector3) + "% de afebrados.");;
		
		System.out.println("\nEl "+ (((afebradosSector1 +afebradosSector2 +afebradosSector3)*100)/CANT_EMPLEADOS) + "% de los empleados esta bajo sospecha de Covid, es decir "+(afebradosSector1 +afebradosSector2 +afebradosSector3)+" de "+CANT_EMPLEADOS);

	}

}
