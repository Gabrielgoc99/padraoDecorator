

public class Frenagem extends CarroDecorator {

    public Frenagem (Carro carro) {
        super(carro);
    }

    public float getPercentualDesempenho() {
        return 10.0f;
    }

    public String getPacoteDesempenho() {
        return "Pacote Frenagem";
    }
}