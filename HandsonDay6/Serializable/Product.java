package iodemos;

import java.io.Serializable;

import arraysdemo.Employee;

public class Product extends Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5131783787057380364L;
	int productId;
	String prodName;
	int quantityOnHand;
	int price;
//overriding and chaining
	public Product()
	{
		productId=0;
		prodName="NA";
		quantityOnHand=0;
		price=0;
	}
//constructor overloading
	public Product(int productId, String prodName, int quantityOnHand, int price) {
		super();
		this.productId = productId;
		this.prodName = prodName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}
	
	
	public Product(int productId, String prodName, int price) {
		//this();
		this.productId = productId;
		this.prodName = prodName;
		this.price = price;
	}
//here, (int price, String prodName, int ProductId) is not possible, because the type will be same as above constructor
	public Product(String prodName, int productId, int price) {
		//this();
		this.prodName = prodName;
		this.productId = productId;
		this.price = price;
		
	}
	
	
	public Product(int productId, int quantityOnHand, int price) {
		//this();
		this.productId = productId;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", prodName=" + prodName + ", quantityOnHand=" + quantityOnHand
				+ ", price=" + price + "]";
	}

	public static void main(String[] args) {
		Product product1=new Product();
		System.out.println(product1);
		System.out.println(new Product(1,"APPLE",3,300));
		System.out.println(new Product(2,"MANGO",900));
		System.out.println(new Product("BANANA",3,50));
		System.out.println(new Product(4,3,50));
		
		
	}
	//-------------------------with constructor chaining----------------- pn =NA as assigned in default constructor
	
//	Product [productId=0, prodName=NA, quantityOnHand=0, price=0]
//			Product [productId=1, prodName=APPLE, quantityOnHand=3, price=300]
//			Product [productId=2, prodName=MANGO, quantityOnHand=0, price=900]
//			Product [productId=3, prodName=BANANA, quantityOnHand=0, price=50]
//			Product [productId=4, prodName=NA, quantityOnHand=3, price=50]

	//---------------------without constructor chaining-------------------(this())see last line pn=null;
//	Product [productId=0, prodName=NA, quantityOnHand=0, price=0]
//			Product [productId=1, prodName=APPLE, quantityOnHand=3, price=300]
//			Product [productId=2, prodName=MANGO, quantityOnHand=0, price=900]
//			Product [productId=3, prodName=BANANA, quantityOnHand=0, price=50]
//			Product [productId=4, prodName=null, quantityOnHand=3, price=50]

}
