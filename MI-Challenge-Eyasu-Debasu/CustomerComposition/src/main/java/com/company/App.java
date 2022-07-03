package com.company;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setFirstName("Debasu");
        customer.setLastName("Eyasu");
        customer.setEmail("example@gmail.com");
        customer.setPhoneNumber("0123456789");

//        System.out.println(customer);

        Address billingAddress = new Address();
        Address shippingAddress = new Address();

        billingAddress.setStreet1("Chawchaw St.");
        billingAddress.setStreet2(("Wakawaka Ave. South."));
        billingAddress.setCity("Seattle");
        billingAddress.setState("WA");
        billingAddress.setZip("54781");

        customer.setBillingAddress(billingAddress);
//        System.out.println(customer);

        shippingAddress.setStreet1("Collage St.");
        shippingAddress.setStreet2(("Ferdinand St. NE"));
        shippingAddress.setCity("Evert");
        shippingAddress.setState("WA");
        shippingAddress.setZip("10267");

        customer.setShippingAddress(shippingAddress);
        customer.setRewardMember(true);

        System.out.println(customer);
    }
}
