package org.example.model;

import java.util.UUID;
import java.time.LocalDate;

public class Purchase {
    private final UUID id;
    private final Customer customer;
    private final Product product;
    private final LocalDate purchaseDate;

    public Purchase(Customer customer, Product product) {
        this.id = UUID.randomUUID();
        this.customer = customer;
        this.product = product;
        this.purchaseDate = LocalDate.now();
    }

    public UUID getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    @Override
    public String toString() {
        return "Покупатель: " + customer + ", Товар: " + product + ", Дата покупки: " + purchaseDate;
    }
}
