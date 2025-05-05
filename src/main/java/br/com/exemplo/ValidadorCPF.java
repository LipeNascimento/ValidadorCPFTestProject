package br.com.exemplo;

public class ValidadorCPF {
    public boolean validarCPF(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            return false;
        }
        // Verifica se todos os caracteres são dígitos
        for (char c : cpf.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        // Verifica se todos os dígitos são iguais (CPF inválido)
        if (cpf.chars().distinct().count() == 1) {
            return false;
        }
        return true;
    }
}
