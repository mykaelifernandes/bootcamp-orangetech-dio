import java.util.Scanner;

public class imoveisDisponiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String array[] = leitor.next().split("/");
        System.out.format("Imovel: %s R$%s %s" , array[0], array[1], array[2]);
    }
}