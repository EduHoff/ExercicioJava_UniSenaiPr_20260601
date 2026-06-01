package exercises;

import java.util.Scanner;
import entities.ex1.*;

/*
Exercício 1: Limite de Créditos Acadêmicos
1. Contexto: Um estudante não pode se matricular em mais de 30 créditos
por semestre.
2. Tarefa:
oCrie uma exceção chamada CreditLimitException. Ela deve carregar,
em sua mensagem, o valor máximo permitido (30) e o total de
créditos que foi solicitado.
oImplemente uma classe que represente um estudante,
armazenando o nome e a quantidade de créditos já matriculados
(inicialmente zero).
oNo método de matrícula, some os créditos desejados ao total atual:
Se o novo total ultrapassar 30, lance CreditLimitException.
Caso contrário, atualize o total de créditos normalmente.
3. Teste: Crie um laço que tente matricular o estudante em turmas de
diferentes valores de créditos — por exemplo, 10, 15, 8, 5 — e capture a
exceção para exibir a mensagem sem encerrar o programa.
*/

public class Ex1 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 1: Limite de Créditos Acadêmicos ---");
        
        Student student = new Student("Flávio");
        
        int[] classCredits = {10, 15, 8, 5};

        System.out.println("Processando matrículas para o estudante: " + student.getName() + "\n");

        for (int credits : classCredits) {
            try {
                System.out.println("Tentando matricular em uma turma de " + credits + " créditos:");
                student.enroll(credits);
            } catch (CreditLimitException e) {
                System.err.println("[ERRO] " + e.getMessage());
            }
            System.out.println("------------------------------------------------");
        }
    }
}