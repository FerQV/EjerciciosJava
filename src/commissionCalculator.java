import java.util.Scanner;

public class commissionCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print ("Calcula la comisión: ");
		double salesRange = in.nextDouble(); //Recuerda: Double porque usaré número con decimales, con int no nos daba pq no son enteros
		in.close();
		
		double commission = 0.0; //Recuerda: Pusimos 0.0 para que la variable tenga un valor en caso de que nos resulte false
		if (salesRange >= 10001) {
			commission = 0.30; // Recuerda: No pusimos las comillas pq no es un String
		} else if (salesRange >= 5001) {
			commission = 0.20;
		} else if (salesRange >= 1001) {
			commission = 0.10;
		}  else {
			commission = 0;
		} // if else
		if (commission > 0) {  //Ojo: Tuvimos que hacer otro If para que podamos sacar el procentaje, el total
            double commission1 = salesRange * commission / 100; // Recuerda: Tuvimos que crear otra variable para que nos dé la operación
            System.out.println("Comisión: " + commission1); // Con este sysout nos permite que el resultado que nos dé sea la comisión que se obtiene por el núm de ventas
        } else {
            System.out.println("No se tiene comisión"); // Pusimos este para que nos salga un mensaje en caso de que no se tenga comisión
        } // if else 2
	}// main
} // commissionCalculator
