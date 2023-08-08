package Aula01;

public class ParesImpares {

	public static void main(String[] args) {
		System.out.println("Impressão dos numeros");
		System.out.println();
		System.out.println("Mostra numeros pares: ");
		for (int x=2;x<=100;x+=2) {
			System.out.println("Numero par: " + x);
		}
		System.out.println();
		System.out.println("Mostra numeros impares: ");
		for (int y=1;y<=100;y+=2) {
			System.out.println("Numero impar: " + y);
		}
	}

}