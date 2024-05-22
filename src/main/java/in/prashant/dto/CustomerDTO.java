//CustomerDTO.Java

package in.prashant.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {

	private Integer CNo;
	private String cName;
	private String CAddr;
	private Float amount;
	
	
	public Integer getCNo() {
		return CNo;
	}
	public void setCNo(Integer cNo) {
		CNo = cNo;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getCAddr() {
		return CAddr;
	}
	public void setCAddr(String cAddr) {
		CAddr = cAddr;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	
	
}
