import java.util.Scanner;

public class salvandoMusicas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        if(arquivoDoPc.contains(".mp3")){
            System.out.println("Salvar");
        }else {
            System.out.println("Deletar");
        }

    }
}

