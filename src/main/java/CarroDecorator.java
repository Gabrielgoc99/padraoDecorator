

public abstract class CarroDecorator implements Carro {

    private Carro carro;
    public String pacoteDesempenho;

    public CarroDecorator(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public abstract float getPercentualDesempenho();

    public float getValorDesempenho() {
        return this.carro.getDesempenhoCarro() * (1 + (this.getPercentualDesempenho() / 100));
    }

    public abstract String getNomePacoteDesempenho();

    public String getPacoteDesempenho() {
        return this.carro.getPacoteDesempenho() + "/" + this.getNomePacoteDesempenho();
    }

    public void setPacoteDesempenho(String pacoteDesempenho) {
        this.pacoteDesempenho = pacoteDesempenho;
    }
}