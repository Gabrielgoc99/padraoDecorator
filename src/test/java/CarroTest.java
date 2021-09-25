

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarValorCarro() {
        Carro carro = new PacoteBasico(50000.0f);

        assertEquals(50000.0f, carro.getPacoteDesempenho());
    }

    @Test
    void retornaValorCarroComPacoteEstabilidade() {
        Carro carro = new Estabilidade(new PacoteBasico(50000.0f));

        assertEquals(55000.0f, carro.getPacoteDesempenho());
    }

    @Test
    void retornaValorCarroComPacoteFrenagem() {
        Carro carro = new Frenagem(new PacoteBasico(50000.0f));

        assertEquals(60000.0f, carro.getPacoteDesempenho());
    }
}
