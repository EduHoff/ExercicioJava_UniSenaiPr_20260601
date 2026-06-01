package exercises;

import java.util.Scanner;
import entities.ex2.InvalidUsernameException;
import entities.ex2.WeakPasswordException;
import entities.ex2.User;

public class Ex2 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 2 ---");

        String[][] testCases = {
            {"Danilo", "senha123"},    
            {"Luan", "123"},       
            {"Flávio", "senhaSemNumero"},
            {"Pedro", "strongPass9"}
        };

        for (String[] test : testCases) {
            String username = test[0];
            String password = test[1];

            System.out.println("Tentando cadastrar -> Usuário: '" + username + "' | Senha: '" + password + "'");
            try {
                User.validate(username, password);
                User user = new User(username, password);
                
                System.out.println("Objeto User instanciado com sucesso para: " + user.getUsername());
                
            } catch (InvalidUsernameException | WeakPasswordException e) {
                System.err.println("[ERRO DE VALIDAÇÃO] " + e.getMessage());
            }
            System.out.println("------------------------------------------------");
        }
    }
}