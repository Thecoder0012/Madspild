package com.madspild.Model;

public class Beregn {
    private String firstName;
    private String lastName;
    private String companyName;
    private String product;
    private int productPrice;
    private double productLeftOvers;

    public Beregn(String firstName, String lastName, String companyName, String product, int productPrice, double productLeftOvers){
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.product = product;
        this.productPrice = productPrice;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductLeftOvers() {
        return productLeftOvers;
    }

    public void setProductLeftOvers(double productLeftOvers) {
        this.productLeftOvers = productLeftOvers;
    }
}
