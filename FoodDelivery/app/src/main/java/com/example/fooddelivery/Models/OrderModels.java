package com.example.fooddelivery.Models;

public class OrderModels {
    int orderimage;
    String ordername, orderPPrice, ordernumber;

    public OrderModels(int orderimage, String ordername, String orderPPrice, String ordernumber) {
        this.orderimage = orderimage;
        this.ordername = ordername;
        this.orderPPrice = orderPPrice;
        this.ordernumber = ordernumber;
    }

    public int getOrderimage() {
        return orderimage;
    }

    public void setOrderimage(int orderimage) {
        this.orderimage = orderimage;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public String getOrderPPrice() {
        return orderPPrice;
    }

    public void setOrderPPrice(String orderPPrice) {
        this.orderPPrice = orderPPrice;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }
}