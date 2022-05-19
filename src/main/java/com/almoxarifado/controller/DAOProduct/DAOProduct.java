package com.almoxarifado.controller.DAOProduct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.almoxarifado.model.Product;

/**
 * DAOProduct
 */

 //TODO Falta identar e formatar melhor esse codigo
public class DAOProduct implements DAOProductInterface {

    // SQL code
    final String INSERT = "INSERT INTO product (code,name,description,price_unit,validity,quantity,overall_price) VALUES(?,?,?,?,?,?,?);";
    final String SELECT_ALL = "SELECT * FROM product;";
    final String SELECTBYID = "SELECT * FROM product WHERE code = ?;";
    final String DELETE_BY_ID = "DROP FROM product WHERE code = ?;";
    final String UPDATE = "UPDATE product set name = ?, code = ?,price_unit = ?,description = ?,validity = ?,quantity = ?,overall_price = ?;";

    // Execute SQL statements
    PreparedStatement preparedStatement;

    // Return data from table
    ResultSet resultSet;

    // Factory of connection to database
    Connection con = ConnectionFactory.GetConnection();

    @Override
    public List<Product> SelectAll() {

        List<Product> products = new ArrayList<>();
        try {
            preparedStatement = con.prepareStatement(SELECTBYID);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                products.add(extraiProdFromDB(resultSet));

            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Product SelectById(int code) {

        try {
            preparedStatement = con.prepareStatement(SELECTBYID);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            preparedStatement.close();
            return extraiProdFromDB(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void Insert(Product product) {
        try {
            preparedStatement = con.prepareStatement(INSERT);
            preparedStatement.setInt(1, product.code);
            preparedStatement.setString(2, product.name);
            preparedStatement.setString(3, product.description);
            preparedStatement.setString(4, product.price_unit);
            preparedStatement.setString(5, product.validity);
            preparedStatement.setString(6, product.quantity);
            preparedStatement.setString(7, product.quantity);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public void UpdateById(int code, Product product) {

        try {
            preparedStatement = con.prepareStatement(UPDATE);

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void DeleteById(int code) {

        try {
            preparedStatement = con.prepareStatement(DELETE_BY_ID);
            preparedStatement.setInt(1, code);
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void closeConnection() throws SQLException {
        con.close();
    }

    public Product extraiProdFromDB(ResultSet resultSet) throws SQLException {
        Product prod = new Product();
        prod.code = resultSet.getInt(1);

        prod.description = resultSet.getString(2);
        prod.name = resultSet.getString(3);
        prod.price_unit = resultSet.getString(4);
        prod.validity = resultSet.getString(5);
        prod.quantity = resultSet.getString(6);
        prod.overall_price = resultSet.getString(7);

        return prod;
    }
}