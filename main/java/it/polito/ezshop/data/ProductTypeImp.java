package it.polito.ezshop.data;

public class ProductTypeImp implements ProductType{
		private String description;
		private String productCode;
		private double pricePerUnit;
		private String note;
		private String location;
		private Integer quantity;
		private Integer id;
		public ProductTypeImp(Integer id, String description, String productCode, double pricePerUnit, String note) {
			this.description=description;
			this.productCode=productCode;
			this.pricePerUnit=pricePerUnit;
			this.note=note;
			this.id=id;
		}
		@Override
		public Integer getQuantity() {
			// TODO Auto-generated method stub
			return quantity;
		}
		@Override
		public void setQuantity(Integer quantity) {
			// TODO Auto-generated method stub
			this.quantity=quantity;
			
		}
		@Override
		public String getLocation() {
			// TODO Auto-generated method stub
			return location;
		}
		@Override
		public void setLocation(String location) {
			// TODO Auto-generated method stub
			this.location=location;
			
		}
		@Override
		public String getNote() {
			// TODO Auto-generated method stub
			return this.note;
		}
		@Override
		public void setNote(String note) {
			// TODO Auto-generated method stub
			this.note=note;
		}
		@Override
		public String getProductDescription() {
			// TODO Auto-generated method stub
			return this.description;
		}
		@Override
		public void setProductDescription(String productDescription) {
			// TODO Auto-generated method stub
			this.description=productDescription;
			
		}
		@Override
		public String getBarCode() {
			// TODO Auto-generated method stub
			return this.productCode;
		}
		@Override
		public void setBarCode(String barCode) {
			// TODO Auto-generated method stub
			this.productCode=barCode;
			
		}
		@Override
		public Double getPricePerUnit() {
			// TODO Auto-generated method stub
			return this.pricePerUnit;
		}
		@Override
		public void setPricePerUnit(Double pricePerUnit) {
			// TODO Auto-generated method stub
			this.pricePerUnit=pricePerUnit;
			
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


}
