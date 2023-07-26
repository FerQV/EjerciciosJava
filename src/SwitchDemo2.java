import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe el número del mes (1-12) para obtener el total de días: ");
		int month= in.nextInt();
		String monthString= "";
		switch (month) {
			case 1,3,5,7,8,10,12: //Aquí se hizo resúmen de los casos que comparten los días
				System.out.println("31");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30");
				break;
			case 2:
				System.out.println("28/29");
				break;
			default:
				monthString="No es un mes válido";
				break;
		} // switch
		System.out.println(monthString);
		in.close();
	} //main

} // SwitchDemo2
