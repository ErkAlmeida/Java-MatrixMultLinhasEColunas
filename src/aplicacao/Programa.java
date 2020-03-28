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
		
		System.out.println("Entre com os Valores para Matriz:");
	
		System.out.println();
				
		for(int i = 0; i < matriz.length; i++) 
		{
			for(int j = 0; j < matriz[i].length; j++) 
			{
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		System.out.print("Pesquisar valor Matriz: ");
		
		int vMatriz = sc.nextInt();
		
		for(int i=0; i<matriz.length; i++ ) 
		{
			for(int j=0; j<matriz[i].length; j++)
			{
				if(matriz[i][j] == vMatriz)
				{
					System.out.println("Posição ["+i+"]["+j+"]");
						
					if(j > 0 )
					{
						System.out.println("Esquerada: " + matriz[i][j-1]); 
					}
					if(i > 0) 
					{
						System.out.println("A cima: " + matriz[i-1][j]);
					}
					if(j < matriz[i].length-1)
					{
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if(i < matriz.length-1) 
					{
						System.out.println("Abaixo: " + matriz[i+1][j]);
					}
				}
				/*else 
				{
					System.out.println("Valor não encontrato");
				}*/
			}
		}
		
			sc.close();
	}
}
