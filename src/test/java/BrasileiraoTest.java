import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BrasileiraoTest {

    @Test
    public void deveRetornarNomedoTime() {
        Brasileirao.getInstance().setTimesCadastrados("Vascão");
        assertEquals("Vascão", Brasileirao.getInstance().getTimesCadastrados());
    }

}