public class Main {
    public static void main(String[] args) {
        // Criando Primeiro  multiplicador  da tabuada com "for"
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            // Criando segundo laço contador da tabuada
            for (int contador = 0; contador <= 10; contador++) {
                // Printando na tela o laço criado
                System.out.print(multiplicador * contador);
                // Organizado laços Com Print pra transformar em uma tabela
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
