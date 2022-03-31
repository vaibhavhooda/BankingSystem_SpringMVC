package com.ad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.ad.beans.Customer;
import com.ad.beans.CustomerAcc;

public class CusAcctDao {
	
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	
	public CustomerAcc getCusAcctByCId(int id){  
	    String sql="select * from customeracct where customerId=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<CustomerAcc>(CustomerAcc.class));  
	}
	// only for admin login 
	public int saveCusAcct(CustomerAcc ca){  
	    String sql="insert into customeracct(AcctNo,AccType,AcctBalance,customerId) values("+ca.getAcctNo()+",'"+ca.getAcctType()+"',0,'"+ca.getCustomerId()+"')";  
	    return template.update(sql);  
	}
	
	//****** may be changed -- current User customerId
		public List<CustomerAcc> getCusAcct(int id){  
		    return template.query("Select * from CustomerAcct Where customerId = "+id ,new RowMapper<CustomerAcc>(){  
		        public CustomerAcc mapRow(ResultSet rs, int row) throws SQLException {  
		            CustomerAcc ca = new CustomerAcc();  
		            ca.setAcctNo(rs.getInt(1));  
		            ca.setAcctType(rs.getString(2));  
		            ca.setAcctBalance(rs.getFloat(3));  
		            ca.setCustomerId(rs.getInt(4));
		            return ca;  
		        }  
		    });  	
		}
		
		public int updateCusAcct(CustomerAcc ca){  
			
			//** float newAmount = 100; ** to be changed by increase or decrease amount 
		    String sql="update customeracct set balanace='"+ca.getAcctBalance()+"' where AcctNo="+ca.getAcctNo()+" ";  
		    return template.update(sql);  
		}	
	
	

}
