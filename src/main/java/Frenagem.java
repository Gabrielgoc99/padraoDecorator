

public class Frenagem extends CarroDecorator {

    public Frenagem (Carro carro) {
        super(carro);
    }

    public float getPercentualDesempenho() {
        return 10.0f;
    }

    public String getNomePacoteDesempenho() {
        return "Pacote Frenagem";
    }

    @Override
    public float getDesempenhoCarro() {
        return 0;
    }
}