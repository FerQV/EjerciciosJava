import java.util.Scanner;
public class MovieDiscounts {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Escribe tu edad: ");
        int edad = in.nextInt();
        float ticketPrice = 7F;
        
        if (edad >=60) {
        	ticketPrice *=0.55F;
        }
        if (edad <=5) {
        	ticketPrice *=0.60F;
        }
        System.out.println("El precio del ticket es:" + ticketPrice);
        in.close();
	}

}
