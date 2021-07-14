package handson2;
public class Welcome {

	public static void main(String[] args) {
		
		Product product=new Product();
		product.productDetails();
		product.productPrice();
		System.out.println();
		
		OrderDetails orderDetails=new OrderDetails();
		orderDetails.order();
		orderDetails.orderDetails();
		System.out.println();
		
		StockDetails stockDetails=new StockDetails();
		stockDetails.stocks();
		stockDetails.stocksCount();
		System.out.println();
		
		PaymentDetails paymentDetails=new PaymentDetails();
		paymentDetails.payment();
		paymentDetails.paymentSuccess();
	}

}
