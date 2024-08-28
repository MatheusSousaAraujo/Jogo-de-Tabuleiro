package jogodetabuleiro;

public class Jogador {
    private int casaAtual = 0;
    private int meuNumero ;

    public Jogador(int meuNumero) {
        this.meuNumero = meuNumero;
    }
    
    
    public void jogar(Dado dado){
        casaAtual = casaAtual + dado.rolar();
    }

    public int getCasaAtual() {
        return casaAtual;
    }

    public void setCasaAtual(int casaAtual) {
        this.casaAtual = casaAtual;
    }

    public int getMeuNumero() {
        return meuNumero;
    }

    public void setMeuNumero(int meuNumero) {
        this.meuNumero = meuNumero;
    }
    
}
