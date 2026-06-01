package entities.ex3;

public class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void withdraw(int quantity) {
        if (quantity > this.stock) {
            throw new OutOfStockException(this.name, this.stock, quantity);
        }
        
        this.stock -= quantity;
        System.out.println(quantity + " unidades retiradas com sucesso. Estoque atual de '" + this.name + "': " + this.stock);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}