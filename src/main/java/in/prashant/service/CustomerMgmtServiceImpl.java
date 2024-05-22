//CustomerMgmtServiceImpl.Java

package in.prashant.service;

import in.prashant.bo.CustomerBO;
import in.prashant.dao.ICustomerDAO;
import in.prashant.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	private ICustomerDAO dao;
	
	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
    System.out.println("CustomerMgmtServiceImpl.1- param constructor");
    this.dao = dao;
	}


	@Override
	public String registerCustomer(CustomerDTO dto) throws Exception {
		
		Float discountPerc;
		
		if(dto.getAmount()>=1000 && dto.getAmount()<=2000)
			discountPerc=5.0f;
		else if(dto.getAmount()>=2001 && dto.getAmount()<=3000)
			discountPerc=8.0f;
		else if(dto.getAmount()>3001 && dto.getAmount()<=4000)
			discountPerc=12.0f;
		else if(dto.getAmount()>4001 && dto.getAmount()<=5000)
			discountPerc=15.0f;
		else discountPerc = 20.0f;
		
		CustomerBO bo = new CustomerBO();
		bo.setcNo(dto.getCNo());
		bo.setcName(dto.getcName());
		bo.setcAddr(dto.getCAddr());
		bo.setDiscountPerc(discountPerc);
		bo.setAmount(dto.getAmount());
		
		int count = dao.insertCustomer(bo);
	
		return count==1?"Customer Registered":"Costomer Not Registered";
	}

}
