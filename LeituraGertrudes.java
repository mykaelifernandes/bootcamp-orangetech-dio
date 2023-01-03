/*
Aplicativo que diga para a tia Gertrudes, conforme o número de páginas de um livro,
quanto tempo ela levaria para ler, lendo apenas 3 páginas por dia.

Entrada: Número de páginas do livro.
Saída : Quanto tempo ela levará para ler esse livro.
 */

import java.util.Scanner;

public class LeituraGertrudes {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println(leitor.nextInt() / 3 + " dias");
    }
}
