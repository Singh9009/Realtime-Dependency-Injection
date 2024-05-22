//CustomerDAOImpl.Java

package in.prashant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import in.prashant.bo.CustomerBO;

public class CustomerDAOImpl implements ICustomerDAO {

	private DataSource ds = null;
	private static final String query = "INSERT INTO SPRING_CUSTOMER_REG VALUES(? ,?, ?, ?, ?)";
	
	public CustomerDAOImpl(DataSource ds) {
		System.out.println("CustomerDAOImpl.1 param constructor");
		this.ds = ds;
	}

	@Override
	public int insertCustomer(CustomerBO bo) throws Exception {
  
		int status = 0;
		
	try(Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(query);)
	{
		ps.setInt(1, bo.getcNo());
		ps.setString(2, bo.getcName());
		ps.setString(3, bo.getcAddr());
		ps.setFloat(4, bo.getDiscountPerc());
		ps.setFloat(5, bo.getAmount());
		
		status = ps.executeUpdate();
	}// end of try with resource
	catch(SQLException se)
	{
		se.printStackTrace();
		throw se;
	}// end of catch
	catch(Exception e)
	{
		e.printStackTrace();
		throw e;
	}
	
	return status;
	}// end of method

}// end of class
