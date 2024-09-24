package br.edu.uft.poo.a2024s2.a17092024;

public class Teste2 {
	public static void main(String[] args) {
		int numero1 = 8, numero2 = 9, numero3 = 7, numero4 = 4, numero5 = 5, numero6 = 6;
		int media1, media2, somaMedia, mediaMedia;
		
		media1 = (numero1 + numero2 + numero3)/3;
		media2 = (numero3 + numero4 + numero5)/3;
		
		somaMedia = media1 + media2;
		mediaMedia = (media1 + media2)/2;
		
		System.out.println(media1+ ", " +media2+ ", " +somaMedia+ ", " +mediaMedia);
	}
}
