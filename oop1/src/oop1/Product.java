package oop1;

//PascalCase
public class Product {

	private String _name;
	private double _unitPrice;
	private double _discount;
	private String _imageUrl;
	private int _unitsInStock;

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public double getUnitPrice() {
		return _unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		_unitPrice = unitPrice;
	}

	public double getDiscount() {
		return _discount;
	}

	public void setDiscount(double discount) {
		_discount = discount;
	}

	public String getImageUrl() {
		return _imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		_imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return _unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		_unitsInStock = unitsInStock;
	}

}
