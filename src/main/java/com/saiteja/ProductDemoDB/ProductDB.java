package com.saiteja.ProductDemoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {

    String url = "jdbc:mysql://localhost:3306/saitej";
    String username = "root";
    String password = "Sai123456";

    Connection con = null;

    public ProductDB() throws SQLException {
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void save(Product p) {
        String query = "INSERT INTO product (id, name, type, warranty) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, p.getId());
            st.setString(2, p.getName());
            st.setString(3, p.getType());
            st.setInt(4, p.getWarranty());
            st.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

	public List<Product> getAll() {
		
		List<Product> products = new ArrayList();
		String query = "select id,name,type,warranty from product";
        try {
            PreparedStatement st = con.prepareStatement(query);
//            st.setInt(1, p.getId());
//            st.setString(2, p.getName());
//            st.setString(3, p.getType());
//            st.setInt(4, p.getWarranty());
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
//            	Product p = new Product();
//            	p.setId(rs.getInt(1));
//            	p.setName(rs.getString(2));
//            	p.setType(rs.getString(3));
//            	p.setWarranty(rs.getInt(4));
//            	products.add(p);
            	
            	int id = rs.getInt("id");
            	String name = rs.getString("name");
            	String type = rs.getString("type");
            	int warranty = rs.getInt("warranty");
            	products.add(new Product(id,name,type,warranty));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
		
		return products;
	}
}


