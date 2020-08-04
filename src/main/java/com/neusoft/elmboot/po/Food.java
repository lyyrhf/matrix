package com.neusoft.elmboot.po;

public class Food {

    private String foodId;
    private String foodName;
    private String foodExplain;
    private String remarks;
    private String foodImg;
    private Float foodPrice;
    private Integer businessId;

    public Food() {}

    public Food(String foodId, String foodName, String foodExplain,
                String remarks,String foodImg ,Float foodPrice,Integer businessId) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodExplain = foodExplain;
        this.foodImg = foodImg;
        this.remarks = remarks;
        this.businessId = businessId;
        this.foodPrice = foodPrice;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodExplain() {
        return foodExplain;
    }

    public void setFoodExplain(String foodExplain) {
        this.foodExplain = foodExplain;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getFoodImg() {
        return foodImg;
    }

    public void setFoodImg(String foodImg) {
        this.foodImg = foodImg;
    }

    public Float getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Float foodPrice) {
        this.foodPrice = foodPrice;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }
}