import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BrasileiraoTest {

    @Test
    public void deveRetornarNomedoTime() {
        Brasileirao.getInstance().setTime("Vascão");
        assertEquals("Vascão", Brasileirao.getInstance().getTime());
    }
    @Test
    public void deveRetornarClassificacao() {
        Brasileirao.getInstance().setClassificacao(4);
        assertEquals(4, Brasileirao.getInstance().getClassificacao());
    }
    @Test
    public void deveRetornarPontuacao() {
        Brasileirao.getInstance().setPontuacao(49);
        assertEquals(49, Brasileirao.getInstance().getPontuacao());
    }

}