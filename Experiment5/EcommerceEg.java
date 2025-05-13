import Ecommerce.Product;
import Ecommerce.Customer;
import Ecommerce.order.Order;

public class EcommerceEg{
public static void main(String[] ar){
Product p = new Product();
Customer c = new Customer();
Order r = new Order();

p.getInfo();
p.setInfo();

c.takeDetails();
c.displayDetails();

r.calculate();

}
}

