package com.ad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ad.beans.Customer;

public class CustomerDao {
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	
	public Customer getCustomerById(int id){  
	    String sql="select * from customer where customerId=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Customer>(Customer.class));  
	}
	//****** to be changed -- current User login_id
	public List<Customer> getCustomer(int id){  
	    return template.query("Select * from Customer Where userId = "+id ,new RowMapper<Customer>(){  
	        public Customer mapRow(ResultSet rs, int row) throws SQLException {  
	            Customer e = new Customer();  
	            e.setCustomerId(rs.getInt(1));  
	            e.setName(rs.getString(2));  
	            e.setCountry(rs.getString(3));  
	            e.setState(rs.getString(4));
	            e.setAddr(rs.getNString(5));
	            e.setPostalcode(rs.getNString(6));
	    
	            return e;  
	        }  
	    });  	
	}
	public int updateCustomer(Customer c){  
	    String sql="update Customer set name='"+c.getName()+"', country='"+c.getCountry()+"',state='"+c.getState()+"',postalcode='"+c.getPostalcode()+"' where customerId="+c.getCustomerId()+"";  
	    return template.update(sql);  
	}  
	
	public int saveCustomer(Customer c){  
	    String sql="insert into Customer(customerId,name,country,state,addr,postalcode,userId) values("+c.getCustomerId()+",'"+c.getName()+"','"+c.getCountry()+"','"+c.getState()+"','"+c.getAddr()+"','"+c.getPostalcode()+"',"+c.getUserId()+")";  
	    return template.update(sql);  
	}  
	

}
