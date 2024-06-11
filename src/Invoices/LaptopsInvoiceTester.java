package Invoices;

public class LaptopsInvoiceTester {
    public static void main(String[] args){
    LaptopsInvoice customerInvoice = new LaptopsInvoice(
            "Joseph ", "Adams",
            "1000 Holly Street, SilverSpring, Maryland", "Macbook Air 13",
            1300, 5, .06, .15, 1500);
        System.out.println("Hello and Welcome to Maryland Global Distributors!");
        System.out.println("We are glad you chose to do business with us.\n");
        System.out.println("The following is an invoice with your order details: ");
         System.out.println("first name: " + customerInvoice.getFirstName());
         System.out.println("last name: " +customerInvoice.getLastName());
         System.out.println("laptop type: " + customerInvoice.getLaptopType());
         System.out.println("laptop unit price: " + customerInvoice.getLaptopUnitPrice());
         System.out.println("Quantity: " + customerInvoice.getQuantity());
         System.out.println("Tax: " + customerInvoice.getTax());
         System.out.println("discount: " + customerInvoice.getDiscount());
         System.out.println("Final Price: " + customerInvoice.getFinalPrice());
    }
}
