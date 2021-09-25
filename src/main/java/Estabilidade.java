

public class Estabilidade extends CarroDecorator {

    public Estabilidade (Carro carro) {
        super(carro);
    }

    public float getPercentualDesempenho() {
        return 20.0f;
    }

    public String getPacoteDesempenho() {
        return "Pacote Desempenho";
    }


}