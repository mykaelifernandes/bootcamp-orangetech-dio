/*
Seu sobrinho começou a ganhar mesada dos pais. No auge dos seus 8 anos recebendo 50 reais por mês,
ele quer saber quanto terá se juntar todo o dinheiro, sem gastar nada, durante alguns meses.
E você, como um bom tio com habilidades de programação,
vai criar um programa que com as entradas do seu sobrinho,
vai calcular automaticamente a quantidade de dinheiro que ele terá em X meses.

Entrada: quantidade de meses que irá juntar.
Saída: valor obtido durante a quantidade de meses juntando.
*/

import java.util.Scanner;

public class MesadaDoSobrinho {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int mes = scanner.nextInt();
        int mesada = 50;
        int valorFinal = mes * mesada;
        System.out.println("Você terá " + valorFinal + " reais");
    }
}

   /*
   Outra alternativa simples:
    Scanner leitor = new Scanner(System.in);
    System.out.println (50 * leitor.nextInt());
           */


