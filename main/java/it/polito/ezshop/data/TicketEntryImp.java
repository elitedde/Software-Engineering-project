package it.polito.ezshop.data;

public class TicketEntryImp implements TicketEntry {
    private String barCode;
    private String productDescription;
    private int amount=0;
    private double pricePerUnit=0;
	private double discountRate=0;

    public TicketEntryImp(String barCode,String producString,int amount,double pricePerUnit,double discountRate){
        this.barCode=barCode;
        this.productDescription=producString;
        this.amount=amount;
        this.pricePerUnit=pricePerUnit;
        this.discountRate=discountRate;
    }
	@Override
	public String getBarCode() {
		// TODO Auto-generated method stub
		return barCode;
	}

	@Override
	public void setBarCode(String barCode) {
		// TODO Auto-generated method stub
		this.barCode=barCode;
	}

	@Override
	public String getProductDescription() {
		// TODO Auto-generated method stub
		return productDescription;
	}

	@Override
	public void setProductDescription(String productDescription) {
		// TODO Auto-generated method stub
        this.productDescription=productDescription;
		
	}

	@Override
	public int getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

	@Override
	public void setAmount(int amount) {
		// TODO Auto-generated method stub
		this.amount=amount;
	}

	@Override
	public double getPricePerUnit() {
		// TODO Auto-generated method stub
		return pricePerUnit;
	}

	@Override
	public void setPricePerUnit(double pricePerUnit) {
		// TODO Auto-generated method stub
        this.pricePerUnit=pricePerUnit;
		
	}

	@Override
	public double getDiscountRate() {
		// TODO Auto-generated method stub
		return discountRate;
	}

	@Override
	public void setDiscountRate(double discountRate) {
		// TODO Auto-generated method stub
		this.discountRate =discountRate;
	}

}
