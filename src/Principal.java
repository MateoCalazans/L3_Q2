import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Robo robo = new Robo(0, 0, 1); // Instanciar o robô na posição (0,0) com passo 1
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
           
            exibirSala(robo);

            
            System.out.println(robo.mostrarPosicaoAtual());
            System.out.println("Escolha a direção:");
            System.out.println("1 - Andar para Frente");
            System.out.println("2 - Andar para Trás");
            System.out.println("3 - Andar para Direita");
            System.out.println("4 - Andar para Esquerda");
            System.out.println("0 - Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    robo.andarFrente();
                    break;
                case 2:
                    robo.andarTras();
                    break;
                case 3:
                    robo.andarDireita();
                    break;
                case 4:
                    robo.andarEsquerda();
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        System.out.println("Sistema encerrado.");
        scanner.close();
    }

    
    public static void exibirSala(Robo robo) {
        int linhaAtual = robo.getLinha();
        int colunaAtual = robo.getColuna();

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 40; j++) {
                if (i == linhaAtual && j == colunaAtual) {
                    System.out.print("1");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}

