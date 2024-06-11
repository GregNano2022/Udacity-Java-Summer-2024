package Invoices;

public class LaptopsInvoice {
    String firstName;
    String lastName;

    String Address;

    String laptopType;

    double laptopUnitPrice;
    Integer quantity;

    double Tax;

    double discount;

    double finalPrice;


    public  LaptopsInvoice(String firstName, String lastName, String Address, String laptopType,
                           double laptopUnitPrice, Integer quantity, double Tax, double discount,
                           double finalPrice){
        this.firstName = firstName;
        this.lastName = lastName;
        this.Address = Address;
        this.laptopType = laptopType;
        this.laptopUnitPrice = laptopUnitPrice;
        this.quantity = quantity;
        this.discount = discount;
        this.Tax = Tax;
        this.finalPrice = finalPrice;

    }

    public void setFirstNameName(String firstNameName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public void setLaptopType(String laptopType) {
        this.laptopType = laptopType;
    }

    public String getLaptopType() {
        return laptopType;
    }

    public void setLaptopUnitPrice(double laptopUnitPrice) {
        this.laptopUnitPrice = laptopUnitPrice;
    }

    public double getLaptopUnitPrice() {
        return laptopUnitPrice;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        discount = quantity *laptopUnitPrice * 0.15;
        return discount;
    }

    public void setTax(double tax) {
        this.Tax = Tax;
    }
    public double getTax(){
        Tax = .06 * laptopUnitPrice*quantity;
        return Tax;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public double getFinalPrice() {
        finalPrice = quantity*laptopUnitPrice-discount + Tax;
        return finalPrice;
    }

    @Override
    public String toString() {
        return "First Name" + firstName + "Last Name" + lastName + "Address" + Address + "Laptop Type" +
                laptopType + "Laptop Unit Price" + laptopUnitPrice + "Laptop Quantity" + quantity +
                "Discount" + discount + "Tax" + Tax + "Final Price" + finalPrice;
    }
}
