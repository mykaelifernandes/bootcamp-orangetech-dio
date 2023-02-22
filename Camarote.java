/*
Nesta parte, estamos criando uma variável do tipo primitivo inteiro,
e definindo ela como 0, usando o mesmo padrão camelCase.
Neste caso, essa variável será responsável por informar quantas pessoas estão no camarote.
int pessoasNoCamarote = 0;

Nesta parte, estamos iniciando um looping contado,
definindo o começo como 0 (na parte do int i = 0),
e o valor final do looping, representado pelo tamanho da fila.
(estamos utilizando <= para verificar se a nossa variável de iterator, está menor ou é igual ao tamanho da fila,
para poder continuar no looping, caso não seja, o looping será encerrado)
for (int i = 0; i <= tamanhoDaFila; i++) {

(ainda dentro do looping) temos uma estrutura de condição verificando se a posição da fila é par,
caso não seja, ele está auto incrementando a variável pessoasNoCamarote (utilizando ++ no final,
adiciona +1 no valor total dessa variável, exemplo, se eu tenho uma variavel = 10, e dou variavel++,
automaticamente ela ficará no valor de 11.
if ( (i % 2) != 0) {
pessoasNoCamarote++;
          }
 */
import java.util.Scanner;

public class Camarote {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        for (int i = 0; i <= tamanhoDaFila; ++i) {
            if (i % 2 != 0) pessoasNoCamarote += 1;
        }
        System.out.println(pessoasNoCamarote + " pessoas no camarote");

    }
}
