package com.gussalves.mvc.mudi.dto;

import com.gussalves.mvc.mudi.model.ProductOrder;

import javax.validation.constraints.NotBlank;

public class NewProductOrderForm {

    @NotBlank
    private String productName;

    @NotBlank(message="Please enter a valid URL")
    private String productUrl;

    @NotBlank(message="Must not be blank")
    private String productImage;
    private String productDescription;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public ProductOrder toOrder() {
        ProductOrder order = new ProductOrder();
        order.setProductName(getProductName());
        order.setProductUrl(getProductUrl());
        order.setProductDescription(getProductDescription());
        order.setProductImage(getProductImage());

        return order;
    }
}
