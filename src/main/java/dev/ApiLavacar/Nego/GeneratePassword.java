package dev.ApiLavacar.Nego;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeneratePassword {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        // Senha que você quer criptografar
        String senhaOriginal = "Wkldjr58*"; // Substitua pela senha desejada

        // Gera o hash BCrypt
        String senhaCriptografada = encoder.encode(senhaOriginal);

        System.out.println("Senha original: " + senhaOriginal);
        System.out.println("Senha criptografada (BCrypt): " + senhaCriptografada);
    }
}