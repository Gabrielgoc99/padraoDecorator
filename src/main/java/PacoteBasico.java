

public class PacoteBasico implements Carro {

    public float desempenhoCarro;

    public PacoteBasico() {
    }

    public PacoteBasico(float desempenhoCarro) {
        this.desempenhoCarro = desempenhoCarro;
    }

    public float getDesempenhoCarro() {
        return desempenhoCarro;
    }

    public String getPacoteDesempenho() {
        return "Pacote Básico";
    }

}