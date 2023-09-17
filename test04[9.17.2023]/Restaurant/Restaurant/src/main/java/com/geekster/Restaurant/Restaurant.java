package com.geekster.Restaurant;

public class Restaurant {

    private Integer restaurantId;
    private String restaurantName;
    private Integer totalStaff;
    private String address;
    private Integer restaurantNumber;

    public Restaurant(Integer restaurantId, String restaurantName, Integer totalStaff, String address, Integer restaurantNumber) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.totalStaff = totalStaff;
        this.address = address;
        this.restaurantNumber = restaurantNumber;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Integer getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(Integer totalStaff) {
        this.totalStaff = totalStaff;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getRestaurantNumber() {
        return restaurantNumber;
    }

    public void setRestaurantNumber(Integer restaurantNumber) {
        this.restaurantNumber = restaurantNumber;
    }
}
