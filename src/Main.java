public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 = new Product();
                        // set / value
     product1.setName("Delonghi Kahve Makinesi");
     product1.setDiscount(7);
     product1.setUnitPrice(7500);
     product1.setUnitInStock(3);
     product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitInStock(3);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitInStock(3);
        product3.setImageUrl("image3.jpg");

        System.out.println("<ul>");
        Product[] products = {product1, product2, product3};
        for(Product product:products){
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("222222");
        individualCustomer.setCustomerNumber("123456");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demiroğ");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("222222222");
        corporateCustomer.setTaxNumber("1111111");
        corporateCustomer.setCustomerNumber("54863");

        Customer[] customers = {individualCustomer, corporateCustomer};


    }
}