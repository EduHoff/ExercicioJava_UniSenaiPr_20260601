package entities.ex1;

public class CreditLimitException extends RuntimeException{

    public CreditLimitException(int requested) {
        super("Falha na matrícula! Limite máximo permitido: 30 créditos. Total solicitado: " + requested + " créditos.");
    }
}
