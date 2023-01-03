/*
Criar um programa gerenciador de pacotes.
Para cada 10% de download, o programa deve printar, em sequência e sem espaços, uma barra “/”.
 */

import java.util.Scanner;

public class DowloadPacotes {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        for (int i = 0; i < tamanho; ++i){ System.out.print("/"); }

    }
}

