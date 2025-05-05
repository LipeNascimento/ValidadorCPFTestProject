package br.com.exemplo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ValidadorCPFTest {

    ValidadorCPF validador = new ValidadorCPF();

    @Test
    public void testCPFValido() {
        assertTrue(validador.validarCPF("12345678909"), "CPF válido deve retornar true");
    }

    @Test
    public void testCPFComCaracteresInvalidos() {
        assertFalse(validador.validarCPF("12345A7890B"), "CPF com letras deve retornar false");
    }

    @Test
    public void testCPFComMenosDigitos() {
        assertFalse(validador.validarCPF("12345"), "CPF com menos de 11 dígitos deve retornar false");
    }

    @Test
    public void testCPFComTodosDigitosIguais() {
        assertFalse(validador.validarCPF("11111111111"), "CPF com todos dígitos iguais deve retornar false");
    }

    @Test
    public void testCPFNull() {
        assertFalse(validador.validarCPF(null), "CPF null deve retornar false");
    }
}
