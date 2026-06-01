package exercises;

import java.util.Scanner;
import entities.ex2.*;

/*
Exercício 2: Validação de Cadastro de Usuário
1. Contexto: Ao cadastrar um novo usuário, o sistema exige que o nome
tenha pelo menos 5 caracteres e que a senha tenha 8 caracteres ou mais,
incluindo ao menos um dígito.
2. Tarefa:
o
o
Defina duas exceções:
InvalidUsernameException para nomes muito curtos.
WeakPasswordException para senhas que não atendam aos
critérios.
Crie um método de validação que receba o nome e a senha:
Verifique o tamanho do nome; se for menor que 5 caracteres,
lance InvalidUsernameException.
Para a senha, cheque primeiro seu comprimento; se for
menor que 8, lance WeakPasswordException.

Em seguida, verifique se há ao menos um dígito; se não
houver, lance WeakPasswordException.
3. Teste: Prepare uma lista de pares (nome, senha) com diferentes falhas e, em
cada tentativa, envolva a validação em um único bloco de captura que trate
ambas as exceções, mostrando ao usuário qual regra não foi cumprida.
*/

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