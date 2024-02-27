package controller;

public class Resto
{
	public Resto()
	{
		super();
	}
	
	public int resto(int dividendo, int divisor)
	{
		if (divisor == 0) {
			System.out.println("Não existe Divisão por 0!");
			System.exit(1);
		}
		if (dividendo < divisor)
			return dividendo;
		return resto(dividendo - divisor, divisor);
	}
}
