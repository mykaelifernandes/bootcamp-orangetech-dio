/*
criar um programa que verifique os dados recebidos de uma câmera da Prefeitura de uma cidade e
envie uma mensagem dizendo se o motorista será multado ou não.
A velocidade permitida de é de 60km/h.

Entrada: velocidade do carro.
Saída: Mensagem no console dizendo se o motorista foi multado ou não.
 */

import java.util.Scanner;
public class IndustriaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        String resultado = velocidade > 60 ? "Foi multado" : "Nao foi multado";
        System.out.println(resultado);


    }
}
