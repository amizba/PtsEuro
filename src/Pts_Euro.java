/**
* Conversor de pesetas a euros.
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/

import java.util.Scanner;

public class Pts_Euro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor, introduce la cantidad de pesetas que quieres convertir: ");
		int pesetas = sc.nextInt();
		double euros = (double) (pesetas / 166.386);
		System.out.print(pesetas + " pesetas son " + euros + " €.");




	}

}