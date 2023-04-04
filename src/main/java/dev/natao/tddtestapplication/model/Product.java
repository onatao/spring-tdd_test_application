package dev.natao.tddtestapplication.model;

public class Product {

    private Integer productId;
    private String productName;
    private Integer productQuantity;
    private Double productValue;
    private Double discountValue;
    private Double additionValue;


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Double getProductValue() {
        return productValue;
    }

    public void setProductValue(Double productValue) {
        this.productValue = productValue;
    }

    public Double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(Double discountValue) {
        this.discountValue = discountValue;
    }

    public Double getAdditionValue() {
        return additionValue;
    }

    public void setAdditionValue(Double additionValue) {
        this.additionValue = additionValue;
    }

    /**
     * Calculate the total value applying business rule
     * @return Total value
     */
    public Double totalValue() {
        return (productValue * productQuantity) + additionValue - discountValue;
    }

    
}
