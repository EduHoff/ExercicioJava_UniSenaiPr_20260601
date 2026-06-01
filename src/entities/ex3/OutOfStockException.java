package entities.ex3;

public class OutOfStockException extends RuntimeException {
    
    public OutOfStockException(String productName, int availableStock, int requestedQuantity) {
        super("Estoque insuficiente para o produto '" + productName + "'! " +
              "Disponível: " + availableStock + " unidades. " +
              "Solicitado: " + requestedQuantity + " unidades.");
    }
}