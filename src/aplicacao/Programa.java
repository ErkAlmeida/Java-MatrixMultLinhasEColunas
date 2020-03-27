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
		
		int[][] matriz = new int[l][c];
		
		sc.nextLine();
				
		for(int i = 0; i < matriz.length; i++) 
		{
			for(int j = 0; j < matriz[i].length; j++) 
			{
				//System.out.printf("Posicão ["+i+"]"+" ["+j+"] =");
				
				matriz[i][j] = sc.nextInt();
			}
		}
		
		
		
		
		
		sc.close();
		
	}
}
