package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa 
{
	public static void main(String[] arg) 
	{
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Matrix [M][N]");
		
		System.out.print("Digite o numero de Linhas: ");
		
		int l = sc.nextInt();
		
		System.out.print("Digite o numero de Colunas: ");
		int c = sc.nextInt();
		
		int matrix[][] = new int[l][c];
		
		
		
		sc.close();
		
	}
}
