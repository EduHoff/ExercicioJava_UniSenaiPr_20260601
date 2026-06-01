package exercises;

import java.util.Scanner;

import entities.ex1.*;

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