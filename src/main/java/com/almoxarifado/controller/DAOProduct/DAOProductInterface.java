package com.almoxarifado.controller.DAOProduct;

import com.almoxarifado.model.Product;
import java.util.List;

public interface DAOProductInterface {

    //TODO add metodos melhores e mais consistentes?? novos e diferentes? 
    // EM HAVER
    List<Product> SelectAll();

    Product SelectById(int code);

    void Insert(Product product);

    void UpdateById(int code, Product product);

    void DeleteById(int code);
}
