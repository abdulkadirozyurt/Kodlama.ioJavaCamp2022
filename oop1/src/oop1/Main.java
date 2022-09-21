package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		System.out.println("----------------------------------");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(9);
		product2.setUnitPrice(9800);
		product2.setUnitsInStock(5);
		product2.setImageUrl("image2.jpg");

		System.out.println("----------------------------------------------------------------------");

		Product[] products = { product1, product2 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");

		System.out.println("----------------------------------------------------------------------");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("055626264");
		individualCustomer.setCustomerNumber("12346");
		individualCustomer.setFirstName("Abdulkadir");
		individualCustomer.setLastName("Ozyurt");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("0532161651");
		corporateCustomer.setCompanyName("Ozyurt Inc.");
		corporateCustomer.setCustomerNumber("1234567");
		corporateCustomer.setTaxNumber("213248678973");
		
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		for (Customer customer : customers) {
			System.out.println(customer.getId());
			
		}
		
	}

}
