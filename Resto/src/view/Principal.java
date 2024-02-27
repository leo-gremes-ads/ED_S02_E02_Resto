package view;

import java.util.Scanner;

import controller.Resto;

public class Principal
{
	public static void main(String[] args)
	{
		int dividendo, divisor, resto;
		Resto r = new Resto();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o dividendo: ");
		dividendo = s.nextInt();
		System.out.print("Informe o divisor: ");
		divisor = s.nextInt();
		s.close();
		resto = r.resto(dividendo, divisor);
		System.out.println("O resto da divisão é: " + resto);
	}
}