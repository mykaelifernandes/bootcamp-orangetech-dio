import java.util.Scanner;

public class dcMonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = ingredientes.split(";");

        for (String ingrediente : listaIngredientes) {
            System.out.println(ingrediente);
        }
    }
}

/*
public class App {
    public static void main(String[] args) {
        System.out.println(new java.util.Scanner(System.in).next().replaceAll(";","\n"));
    }
}
 */

