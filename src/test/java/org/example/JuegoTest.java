package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JuegoTest {

    @Test
    public void testJugarDevuelveResultado() {
        Juego juego = new Juego();
        String resultado = juego.jugar();

        assertNotNull(resultado);
        assertTrue(resultado.contains("Dado 1:"));
        assertTrue(resultado.contains("Dado 2:"));
        assertTrue(resultado.contains("Suma:"));
        assertTrue(resultado.contains("Ganaste") || resultado.contains("Perdiste"));
    }
}
