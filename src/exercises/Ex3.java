package exercises;

import java.util.Scanner;
import entities.ex3.*;

/*
Exercício 3: Controle de Estoque de Produto
1. Contexto: Em uma loja virtual, não se quer permitir que usuários retirem
mais unidades de um produto do que existem em estoque.
2. Tarefa:
oCrie uma exceção OutOfStockException como subtipo de
RuntimeException. Sua mensagem deve informar o nome do
produto, a quantidade em estoque e a quantidade solicitada.
oFaça uma classe de produto que armazene o nome e o estoque
disponível.
oNo método de retirada de unidades:
Se a quantidade pedida for maior que o estoque, lance
OutOfStockException.
Caso contrário, subtraia a quantidade solicitada do estoque.
3. Teste: Instancie um produto com estoque limitado e tente remover
quantidades em sequência, sem usar try-catch. Observe o stack trace
gerado quando o estoque não for suficiente.
*/

public class Ex3 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 3 ---");

        Product product = new Product("Teclado Mecânico RGB", 20);

        System.out.println("Iniciando retiradas sequenciais em '" + product.getName() + "' com " + product.getStock() + " unidades em estoque.\n");

        int[] withdrawals = {8, 10, 5};

        for (int quantity : withdrawals) {
            System.out.println("Tentando retirar " + quantity + " unidades:");
            
            try {
                product.withdraw(quantity);
            } catch (OutOfStockException e) {
                System.err.println("[ERRO DE ESTOQUE] " + e.getMessage());
            }
            
            System.out.println("------------------------------------------------");
        }
    }
}