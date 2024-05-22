//CustomerBO.java

package in.prashant.bo;

public class CustomerBO {

	private Integer cNo;
	private String cName;
	private String cAddr;
	private Float discountPerc;
	private Float amount;
	
	
	public Integer getcNo() {
		return cNo;
	}
	public void setcNo(Integer cNo) {
		this.cNo = cNo;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcAddr() {
		return cAddr;
	}
	public void setcAddr(String cAddr) {
		this.cAddr = cAddr;
	}
	public Float getDiscountPerc() {
		return discountPerc;
	}
	public void setDiscountPerc(Float discountPerc) {
		this.discountPerc = discountPerc;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	
	
	
}
