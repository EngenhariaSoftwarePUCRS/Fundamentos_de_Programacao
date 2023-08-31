package Aula_09;

import java.util.Scanner;

public class Ex09_PossuiA {
	/*
	 * Escreva um programa que leia um valor string s1 e informe se essa string
	 * possui o caractere ‘a’.
	 */
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Escreva uma frase/palavra: ");
			String s1 = input.nextLine();

			if (possuiA(s1))
				System.out.println("Essa string possui 'a'. ");
			else
				System.out.println("Essa string nao possui 'a'. ");
		}
	}

	private static boolean possuiA(String s1) {
		s1 = s1.trim();
		boolean possui = false;

		for (int i = 0; i < s1.length(); i++)
			if (s1.charAt(i) == 97) {
				possui = true;
				break;
			}

		return possui;
	}
}
