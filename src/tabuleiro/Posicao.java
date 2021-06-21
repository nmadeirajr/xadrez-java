package tabuleiro;

public class Posicao {
    
    private Integer linha;
    private Integer coluna;

    public Posicao(Integer linha, Integer coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public Integer getLinha() {
        return linha;
    }

    public void setLinha(Integer linha) {
        this.linha = linha;
    }

    public Integer getColuna() {
        return coluna;
    }

    public void setColuna(Integer coluna) {
        this.coluna = coluna;
    }
    
    public void alterarTamanho(int linha, int coluna) {
        
        this.linha = this.linha + linha;
        this.coluna = this.coluna + coluna;
    }
    
    @Override
    public String toString() {
        
        return linha + ", " + coluna;
    }
}
