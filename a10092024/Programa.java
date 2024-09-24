package br.edu.uft.poo.a2024s2.a10092024;

import java.util.Scanner;

public class Programa{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		double A, B, MEDIA;
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		MEDIA = (A*3.5*B*7.5)/11;
		
		System.out.printf("Media = %.5f", MEDIA);
		System.out.println();
		
	}
}