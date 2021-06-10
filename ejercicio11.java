import java.util.*;

public class ejercicio11{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int contadorimpares = 0;
		double contadorpares = 0;
		double acumuladorpares = 0;
		int contadorsegunda =0;
		int contadornulo = 0;
		int contadormayor = 0;
		int contadormenor = 0;
		double promediopares;
		
		for(int i=1;i<=10;i++){
			int numero = (int)(Math.random()*36+1);
			System.out.println("Numero aleatorio de la ruleta "+i+": "+numero);
			
			if(((numero%2)==0) && (numero != 0)){
				contadorpares = contadorpares + 1;
				acumuladorpares = acumuladorpares + numero;
			}else
				if(((numero%2)==1) && (numero != 0)){
					contadorimpares = contadorimpares + 1;
				}
			if ((numero > 12) && (numero < 25)){
				contadorsegunda = contadorsegunda + 1;
			}
			if (i == 1){
				contadormayor = numero;
				contadormenor = numero;
			}else 
				if(numero > contadormayor){
					contadormayor = numero;
				}
		}
		
		promediopares = acumuladorpares/contadorpares;
		
		System.out.println("a) Los numeros impares son en total: "+contadorimpares);
		System.out.println("b) El promedio de los numeros pares sin contar el 0 es: "+promediopares);
		System.out.println("c) Numeros que se encuentran en la segunda docena: "+contadorsegunda);
		System.out.println("d) El numero mayor es: "+contadormayor);		
	}
}