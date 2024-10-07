package net.capricornio.service;

import java.util.List;

import net.capricornio.entity.Product;

public interface IProductService {

    Product addProduct(Product p);

    Product editProduct(Product p) throws RuntimeException;

    void deleteProduct(Long idProduct);

    List<Product> retrieveAll();
}