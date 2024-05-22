//ICustomerDAO.java

package in.prashant.dao;

import in.prashant.bo.CustomerBO;

public interface ICustomerDAO {

	public int insertCustomer(CustomerBO bo) throws Exception;
}
