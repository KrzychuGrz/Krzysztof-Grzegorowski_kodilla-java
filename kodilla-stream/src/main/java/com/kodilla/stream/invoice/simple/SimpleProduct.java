package com.kodilla.stream.invoice.simple;

import java.util.Objects;

public final class SimpleProduct {

    private final String ProductName;
    private final double productPrice;

    public SimpleProduct(String productName, double productPrice) {
        this.ProductName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return ProductName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleProduct that = (SimpleProduct) o;

        return Objects.equals(ProductName, that.ProductName);
    }

}
