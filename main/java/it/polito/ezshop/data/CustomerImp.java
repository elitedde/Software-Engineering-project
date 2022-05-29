package it.polito.ezshop.data;

public class CustomerImp implements Customer {
	private String customerName;
	private Integer id;
	private String customerCard;
	private Integer points;

	public CustomerImp(String customerName, Integer id) {
		this.customerName=customerName;
		this.id=id;
	}
	
	@Override
	public String getCustomerName() {
		// TODO Auto-generated method stub
		return this.customerName;
	}

	@Override
	public void setCustomerName(String customerName) {
		// TODO Auto-generated method stub
		this.customerName=customerName;
	}

	@Override
	public String getCustomerCard() {
		// TODO Auto-generated method stub
		return this.customerCard;
	}

	@Override
	public void setCustomerCard(String customerCard) {
		// TODO Auto-generated method stub
		this.customerCard=customerCard;
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		this.id=id;
	}

	@Override
	public Integer getPoints() {
		// TODO Auto-generated method stub
		return this.points;
	}

	@Override
	public void setPoints(Integer points) {
		// TODO Auto-generated method stub
		this.points=points;
	}

}
