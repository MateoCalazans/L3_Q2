
class Robo {
    private int linha;
    private int coluna;
    private int passo;
    private final int maxLinhas = 20;
    private final int maxColunas = 40;

    
    public Robo(int linha, int coluna, int passo) {
        this.linha = linha;
        this.coluna = coluna;
        this.passo = passo;
    }

    
    public String mostrarPosicaoAtual() {
        return "Posição Atual: (" + linha + ", " + coluna + ")";
    }

   
    public void andarFrente() {
        linha = Math.min(linha + passo, maxLinhas - 1);
    }

    
    public void andarTras() {
        linha = Math.max(linha - passo, 0);
    }

    
    public void andarDireita() {
        coluna = Math.min(coluna + passo, maxColunas - 1);
    }

    
    public void andarEsquerda() {
        coluna = Math.max(coluna - passo, 0);
    }

    
    public int getLinha() {
        return linha;
    }

    
    public int getColuna() {
        return coluna;
    }
}